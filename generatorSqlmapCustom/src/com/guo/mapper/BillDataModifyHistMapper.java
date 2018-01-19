package com.guo.mapper;

import com.guo.pojo.BillDataModifyHist;
import com.guo.pojo.BillDataModifyHistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillDataModifyHistMapper {
    int countByExample(BillDataModifyHistExample example);

    int deleteByExample(BillDataModifyHistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillDataModifyHist record);

    int insertSelective(BillDataModifyHist record);

    List<BillDataModifyHist> selectByExample(BillDataModifyHistExample example);

    BillDataModifyHist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillDataModifyHist record, @Param("example") BillDataModifyHistExample example);

    int updateByExample(@Param("record") BillDataModifyHist record, @Param("example") BillDataModifyHistExample example);

    int updateByPrimaryKeySelective(BillDataModifyHist record);

    int updateByPrimaryKey(BillDataModifyHist record);
}