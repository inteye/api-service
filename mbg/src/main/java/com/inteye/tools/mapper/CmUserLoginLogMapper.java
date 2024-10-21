package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUserLoginLog;
import com.inteye.tools.model.CmUserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserLoginLogMapper {
    int countByExample(CmUserLoginLogExample example);

    int deleteByExample(CmUserLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserLoginLog record);

    int insertSelective(CmUserLoginLog record);

    List<CmUserLoginLog> selectByExample(CmUserLoginLogExample example);

    CmUserLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserLoginLog record, @Param("example") CmUserLoginLogExample example);

    int updateByExample(@Param("record") CmUserLoginLog record, @Param("example") CmUserLoginLogExample example);

    int updateByPrimaryKeySelective(CmUserLoginLog record);

    int updateByPrimaryKey(CmUserLoginLog record);
}