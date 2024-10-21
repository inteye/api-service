package com.inteye.tools.mapper;

import com.inteye.tools.model.AmAdmin;
import com.inteye.tools.model.AmAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmAdminMapper {
    int countByExample(AmAdminExample example);

    int deleteByExample(AmAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmAdmin record);

    int insertSelective(AmAdmin record);

    List<AmAdmin> selectByExample(AmAdminExample example);

    AmAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmAdmin record, @Param("example") AmAdminExample example);

    int updateByExample(@Param("record") AmAdmin record, @Param("example") AmAdminExample example);

    int updateByPrimaryKeySelective(AmAdmin record);

    int updateByPrimaryKey(AmAdmin record);
}