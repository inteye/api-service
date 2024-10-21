package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUserScanningLog;
import com.inteye.tools.model.CmUserScanningLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserScanningLogMapper {
    int countByExample(CmUserScanningLogExample example);

    int deleteByExample(CmUserScanningLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserScanningLog record);

    int insertSelective(CmUserScanningLog record);

    List<CmUserScanningLog> selectByExample(CmUserScanningLogExample example);

    CmUserScanningLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserScanningLog record, @Param("example") CmUserScanningLogExample example);

    int updateByExample(@Param("record") CmUserScanningLog record, @Param("example") CmUserScanningLogExample example);

    int updateByPrimaryKeySelective(CmUserScanningLog record);

    int updateByPrimaryKey(CmUserScanningLog record);
}