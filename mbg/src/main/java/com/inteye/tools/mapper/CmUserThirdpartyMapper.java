package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUserThirdparty;
import com.inteye.tools.model.CmUserThirdpartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserThirdpartyMapper {
    int countByExample(CmUserThirdpartyExample example);

    int deleteByExample(CmUserThirdpartyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserThirdparty record);

    int insertSelective(CmUserThirdparty record);

    List<CmUserThirdparty> selectByExample(CmUserThirdpartyExample example);

    CmUserThirdparty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserThirdparty record, @Param("example") CmUserThirdpartyExample example);

    int updateByExample(@Param("record") CmUserThirdparty record, @Param("example") CmUserThirdpartyExample example);

    int updateByPrimaryKeySelective(CmUserThirdparty record);

    int updateByPrimaryKey(CmUserThirdparty record);
}