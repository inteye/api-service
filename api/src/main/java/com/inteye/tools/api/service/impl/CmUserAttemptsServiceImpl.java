package com.inteye.tools.api.service.impl;

import com.inteye.tools.api.service.CmUserAttemptsService;
import com.inteye.tools.api.service.CmUserService;
import com.inteye.tools.mapper.CmUserAttemptsMapper;
import com.inteye.tools.mapper.CmUserMapper;
import com.inteye.tools.model.CmUser;
import com.inteye.tools.model.CmUserAttempts;
import com.inteye.tools.model.CmUserAttemptsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * User Attempts Service Impl
 * Created by inteye on 2/20/19.
 */
@Service
public class CmUserAttemptsServiceImpl implements CmUserAttemptsService {

    private static final int MAX_ATTEMPTS = 5;

    @Autowired
    private CmUserMapper cmUserMapper;
    @Autowired
    private CmUserAttemptsMapper cmUserAttemptsMapper;
    @Autowired
    private CmUserService cmUserService;

    @Override
    public void updateFailAttempts(String username) {
        CmUserAttempts cmUserAttempts = getUserAttempts(username);
        if (cmUserAttempts == null) {
            CmUserAttempts record = new CmUserAttempts();
            record.setUsername(username);
            record.setUpdatedAt(new Date());
            record.setAttempts(1);
            cmUserAttemptsMapper.insert(record);
        } else {
            if (cmUserAttempts.getAttempts() + 1 > MAX_ATTEMPTS) {
                //锁定用户
                CmUser cmUser = cmUserService.getUserByPhone(username);
                cmUser.setStatus((short) 0);
                cmUserMapper.updateByPrimaryKey(cmUser);
                throw new LockedException("错误次数超限，账户已被锁定");
            } else {
                //累加一次
                cmUserAttempts.setAttempts(cmUserAttempts.getAttempts() + 1);
                cmUserAttemptsMapper.updateByPrimaryKey(cmUserAttempts);
            }
        }
    }

    @Override
    public CmUserAttempts getUserAttempts(String username) {
        CmUserAttemptsExample example = new CmUserAttemptsExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<CmUserAttempts> attemptsList = cmUserAttemptsMapper.selectByExample(example);
        if (attemptsList != null && attemptsList.size() > 0) {
            return attemptsList.get(0);
        }
        return null;
    }

    @Override
    public void resetFailAttempts(String username) {
        CmUserAttempts cmUserAttempts = getUserAttempts(username);
        if (cmUserAttempts != null) {
            cmUserAttempts.setAttempts(0);
            cmUserAttemptsMapper.updateByPrimaryKey(cmUserAttempts);
        }
    }
}
