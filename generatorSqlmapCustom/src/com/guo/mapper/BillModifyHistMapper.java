package com.guo.mapper;

import com.guo.pojo.BillModifyHist;
import com.guo.pojo.BillModifyHistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillModifyHistMapper {
    int countByExample(BillModifyHistExample example);

    int deleteByExample(BillModifyHistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillModifyHist record);

    int insertSelective(BillModifyHist record);

    List<BillModifyHist> selectByExample(BillModifyHistExample example);

    BillModifyHist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillModifyHist record, @Param("example") BillModifyHistExample example);

    int updateByExample(@Param("record") BillModifyHist record, @Param("example") BillModifyHistExample example);

    int updateByPrimaryKeySelective(BillModifyHist record);

    int updateByPrimaryKey(BillModifyHist record);
}