package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUser;
import com.inteye.tools.model.CmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserMapper {
    int countByExample(CmUserExample example);

    int deleteByExample(CmUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUser record);

    int insertSelective(CmUser record);

    List<CmUser> selectByExample(CmUserExample example);

    CmUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUser record, @Param("example") CmUserExample example);

    int updateByExample(@Param("record") CmUser record, @Param("example") CmUserExample example);

    int updateByPrimaryKeySelective(CmUser record);

    int updateByPrimaryKey(CmUser record);
}