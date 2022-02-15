package com.inspur.ethereumtest.service;

import com.inspur.ethereumtest.pojo.Blockbynumber;

import java.util.List;
import java.util.Map;

/**
 * @author mgl
 * @Description: ${todo}
 * @date 2022/1/24 22:46
 */
public interface BlockByService {

    public void save(Map<String,Object> block);
    public void saveByNumber(Map<String,Object>block);
    public String getMaxId();

    public List<Blockbynumber> list();
    public List<Blockbynumber> selectById(String id);
    public void saveByHash(Map<String,Object> block);

    public void saveTransactionByHash(Map<String,Object> block);




}
