package com.inteye.tools.mapper;

import com.inteye.tools.model.CmUserAddress;
import com.inteye.tools.model.CmUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmUserAddressMapper {
    int countByExample(CmUserAddressExample example);

    int deleteByExample(CmUserAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserAddress record);

    int insertSelective(CmUserAddress record);

    List<CmUserAddress> selectByExample(CmUserAddressExample example);

    CmUserAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserAddress record, @Param("example") CmUserAddressExample example);

    int updateByExample(@Param("record") CmUserAddress record, @Param("example") CmUserAddressExample example);

    int updateByPrimaryKeySelective(CmUserAddress record);

    int updateByPrimaryKey(CmUserAddress record);
}