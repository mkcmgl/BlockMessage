package com.inspur.ethereumtest.mapper;

import com.inspur.ethereumtest.pojo.Blockbynumber;

import java.util.List;
import java.util.Map;

public interface BlockSyncLogMapper {



    List<Blockbynumber> findAll();

    String getMaxId();


    int insert(Map<String,Object> block);

//    Blockbynumber selectById(String id);

    int insertByNumber(Map<String,Object> block);

    int insertByHash(Map<String,Object> block);

}
