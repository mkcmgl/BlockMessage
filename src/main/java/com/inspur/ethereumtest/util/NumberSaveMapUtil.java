package com.inspur.ethereumtest.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;





public class NumberSaveMapUtil {
    public Map<String, Object> saveMap(JSONObject blockNumber){
        Map<String, Object> resultmap = new HashMap<>();

        resultmap.put("id", blockNumber.getString("id"));
        resultmap.put("result", blockNumber.getString("result"));
        return resultmap;
    }

}
