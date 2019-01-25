package com.example.maven201901251606.dao;

import com.example.maven201901251606.model.XwBindFlow;
import com.example.maven201901251606.model.XwBindFlowExample;
import com.example.maven201901251606.model.XwBindFlowWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XwBindFlowMapper {
    long countByExample(XwBindFlowExample example);

    int deleteByExample(XwBindFlowExample example);

    int deleteByPrimaryKey(String bank_card_id);

    int insert(XwBindFlowWithBLOBs record);

    int insertSelective(XwBindFlowWithBLOBs record);

    List<XwBindFlowWithBLOBs> selectByExampleWithBLOBs(XwBindFlowExample example);

    List<XwBindFlow> selectByExample(XwBindFlowExample example);

    XwBindFlowWithBLOBs selectByPrimaryKey(String bank_card_id);

    int updateByExampleSelective(@Param("record") XwBindFlowWithBLOBs record, @Param("example") XwBindFlowExample example);

    int updateByExampleWithBLOBs(@Param("record") XwBindFlowWithBLOBs record, @Param("example") XwBindFlowExample example);

    int updateByExample(@Param("record") XwBindFlow record, @Param("example") XwBindFlowExample example);

    int updateByPrimaryKeySelective(XwBindFlowWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(XwBindFlowWithBLOBs record);

    int updateByPrimaryKey(XwBindFlow record);
}