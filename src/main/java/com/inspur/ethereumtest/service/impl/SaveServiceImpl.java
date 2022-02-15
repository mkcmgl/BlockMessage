package com.inspur.ethereumtest.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.inspur.ethereumtest.service.SaveService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service("save")
public class SaveServiceImpl implements SaveService {

    private Map<String, Object> resultmap = new HashMap<>();
    @Override
    public Map<String, Object> saveMap(JSONObject blockByNumber) {
        JSONObject byhash = (JSONObject) blockByNumber.get("result");
        resultmap.put("height", Integer.parseInt(blockByNumber.getString("id")));
        resultmap.put("timestamp", byhash.get("timestamp"));
//        resultmap.put("transactions", byhash.get("transactions"));
        resultmap.put("miner", byhash.get("miner"));
        resultmap.put("uncles", byhash.getString("uncles"));
        resultmap.put("difficulty", byhash.get("difficulty"));
        resultmap.put("totalDifficulty", byhash.get("totalDifficulty"));
        resultmap.put("size", byhash.get("size"));
        resultmap.put("gasUsed", byhash.get("gasUsed"));
        resultmap.put("gasLimit", byhash.get("gasLimit"));
        resultmap.put("extraData", byhash.get("extraData"));
        resultmap.put("hash", byhash.get("hash"));
        resultmap.put("parentHash", byhash.get("parentHash"));
        resultmap.put("sha3Uncles", byhash.get("sha3Uncles"));
        resultmap.put("stateRoot", byhash.get("stateRoot"));
        resultmap.put("nonce", byhash.get("nonce"));
        resultmap.put("number", byhash.getString("number"));
        resultmap.put("transactionsRoot", byhash.getString("transactionsRoot"));
        return resultmap;
    }
}
