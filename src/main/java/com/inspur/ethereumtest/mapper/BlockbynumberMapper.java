package com.inspur.ethereumtest.mapper;

import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.pojo.BlockbynumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlockbynumberMapper {
    int countByExample(BlockbynumberExample example);

    int deleteByExample(BlockbynumberExample example);

    int deleteByPrimaryKey(String height);

    int insert(Blockbynumber record);

    int insertSelective(Blockbynumber record);

    List<Blockbynumber> selectByNumber(String number);

    List<Blockbynumber> selectByHash(String hash);

    Blockbynumber selectByPrimaryKey(String height);

    int updateByExampleSelective(@Param("record") Blockbynumber record, @Param("example") BlockbynumberExample example);

    int updateByExample(@Param("record") Blockbynumber record, @Param("example") BlockbynumberExample example);

    int updateByPrimaryKeySelective(Blockbynumber record);

    int updateByPrimaryKey(Blockbynumber record);
}