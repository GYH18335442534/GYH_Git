package com.guo.mapper;

import com.guo.pojo.RebuyBatch;
import com.guo.pojo.RebuyBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebuyBatchMapper {
    int countByExample(RebuyBatchExample example);

    int deleteByExample(RebuyBatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RebuyBatch record);

    int insertSelective(RebuyBatch record);

    List<RebuyBatch> selectByExampleWithBLOBs(RebuyBatchExample example);

    List<RebuyBatch> selectByExample(RebuyBatchExample example);

    RebuyBatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RebuyBatch record, @Param("example") RebuyBatchExample example);

    int updateByExampleWithBLOBs(@Param("record") RebuyBatch record, @Param("example") RebuyBatchExample example);

    int updateByExample(@Param("record") RebuyBatch record, @Param("example") RebuyBatchExample example);

    int updateByPrimaryKeySelective(RebuyBatch record);

    int updateByPrimaryKeyWithBLOBs(RebuyBatch record);

    int updateByPrimaryKey(RebuyBatch record);
}