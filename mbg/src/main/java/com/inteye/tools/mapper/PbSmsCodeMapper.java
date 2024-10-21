package com.inteye.tools.mapper;

import com.inteye.tools.model.PbSmsCode;
import com.inteye.tools.model.PbSmsCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PbSmsCodeMapper {
    int countByExample(PbSmsCodeExample example);

    int deleteByExample(PbSmsCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PbSmsCode record);

    int insertSelective(PbSmsCode record);

    List<PbSmsCode> selectByExample(PbSmsCodeExample example);

    PbSmsCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PbSmsCode record, @Param("example") PbSmsCodeExample example);

    int updateByExample(@Param("record") PbSmsCode record, @Param("example") PbSmsCodeExample example);

    int updateByPrimaryKeySelective(PbSmsCode record);

    int updateByPrimaryKey(PbSmsCode record);
}