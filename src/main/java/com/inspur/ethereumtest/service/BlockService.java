package com.inspur.ethereumtest.service;

import com.alibaba.fastjson.JSONObject;
import com.inspur.ethereumtest.pojo.Blockbynumber;

import java.util.List;
import java.util.Map;

/**
 * @author mgl
 * @Description: ${todo}
 * @date 2022/1/21 22:46
 */
public interface BlockService {
    /**
     * 获取区块高度
     * @param map
     * @return
     */
    JSONObject getBlockMessage(Map<String,Object> map);



}
