package com.guo.mapper;

import com.guo.pojo.RebuyBill;
import com.guo.pojo.RebuyBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebuyBillMapper {
    int countByExample(RebuyBillExample example);

    int deleteByExample(RebuyBillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RebuyBill record);

    int insertSelective(RebuyBill record);

    List<RebuyBill> selectByExample(RebuyBillExample example);

    RebuyBill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RebuyBill record, @Param("example") RebuyBillExample example);

    int updateByExample(@Param("record") RebuyBill record, @Param("example") RebuyBillExample example);

    int updateByPrimaryKeySelective(RebuyBill record);

    int updateByPrimaryKey(RebuyBill record);
}