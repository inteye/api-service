package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUserAttempts;
import com.inteye.tools.model.CmUserAttemptsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserAttemptsMapper {
    int countByExample(CmUserAttemptsExample example);

    int deleteByExample(CmUserAttemptsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserAttempts record);

    int insertSelective(CmUserAttempts record);

    List<CmUserAttempts> selectByExample(CmUserAttemptsExample example);

    CmUserAttempts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserAttempts record, @Param("example") CmUserAttemptsExample example);

    int updateByExample(@Param("record") CmUserAttempts record, @Param("example") CmUserAttemptsExample example);

    int updateByPrimaryKeySelective(CmUserAttempts record);

    int updateByPrimaryKey(CmUserAttempts record);
}