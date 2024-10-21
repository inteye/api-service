package com.inteye.tools.api.service.impl;

import com.inteye.tools.api.service.PbSmsCodeService;
import com.inteye.tools.mapper.PbSmsCodeMapper;
import com.inteye.tools.model.PbSmsCode;
import com.inteye.tools.model.PbSmsCodeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * SmsCode Service
 * Created by inteye on 2/17/19.
 */
@Service
public class PbSmsCodeServiceImpl implements PbSmsCodeService {

    private static final int RANDOM_MAX = 999999;
    private static final int RANDOM_MIN = 100000;

    @Autowired
    private PbSmsCodeMapper pbSmsCodeMapper;

    @Override
    public int create(Short type, String phone) {
        Date date = new Date();
        PbSmsCode pbSmsCode = new PbSmsCode();
        pbSmsCode.setId(null);
        pbSmsCode.setPhone(phone);
        pbSmsCode.setType(type);
        pbSmsCode.setCreatedTime(date);
        pbSmsCode.setExpiresTime(new Date(date.getTime() + 60 * 30 * 1000));
        pbSmsCode.setCode(String.valueOf(new Random().nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN));
        pbSmsCode.setStatus(false);
        return pbSmsCodeMapper.insert(pbSmsCode);
    }

    @Override
    public boolean checkCode(Short type, String mobile, String code) {
        PbSmsCodeExample example = new PbSmsCodeExample();
        example.createCriteria().andPhoneEqualTo(mobile)
                .andTypeEqualTo(type)
                .andCodeEqualTo(code)
                .andStatusEqualTo(false)
                .andExpiresTimeGreaterThan(new Date());
        List<PbSmsCode> lists = pbSmsCodeMapper.selectByExample(example);
        if (lists.size() == 0) {
            return false;
        }
        PbSmsCode record = lists.get(0);
        boolean result = mobile.equals(record.getPhone());
        if (result) {
            updateStatus(record);
        }
        return result;
    }

    private void updateStatus(PbSmsCode record) {
        record.setStatus(true);
        pbSmsCodeMapper.updateByPrimaryKey(record);
    }

}