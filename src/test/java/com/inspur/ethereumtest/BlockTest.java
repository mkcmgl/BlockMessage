package com.inspur.ethereumtest;

import com.alibaba.fastjson.JSONObject;
import com.inspur.ethereumtest.service.BlockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mgl
 * @Description: ${todo}
 * @date 2022/1/21 23:04
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BlockTest {
    @Autowired
    private BlockService blockService;
    private Logger log = LoggerFactory.getLogger(this.getClass());


    @Test
    public void getBlockNumber() {
        Map<String, Object> params = new HashMap<>();
        params.put("jsonrpc", "2.0");
        params.put("id", "1");
        params.put("method", "eth_blockNumber");
        params.put("params", new String[]{});
        JSONObject paramData = (JSONObject) JSONObject.toJSON(params);
        JSONObject blockNumber = blockService.getBlockMessage(paramData);
        log.info("区块信息：{}", blockNumber);

    }
}