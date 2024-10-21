package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUserData;
import com.inteye.tools.model.CmUserDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserDataMapper {
    int countByExample(CmUserDataExample example);

    int deleteByExample(CmUserDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserData record);

    int insertSelective(CmUserData record);

    List<CmUserData> selectByExample(CmUserDataExample example);

    CmUserData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserData record, @Param("example") CmUserDataExample example);

    int updateByExample(@Param("record") CmUserData record, @Param("example") CmUserDataExample example);

    int updateByPrimaryKeySelective(CmUserData record);

    int updateByPrimaryKey(CmUserData record);
}