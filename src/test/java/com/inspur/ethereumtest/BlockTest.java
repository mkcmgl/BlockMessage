//package com.inspur.ethereumtest;
//
//import com.alibaba.fastjson.JSONObject;
//import com.inspur.ethereumtest.service.BlockService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author gonggj
// * @Description: ${todo}
// * @date 2022/1/21 23:04
// */
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class BlockByNumber {
//    @Autowired
//    private BlockService blockService;
//    private Logger log = LoggerFactory.getLogger(this.getClass());
//
//
//    @Test
//    public void getBlockNumber() {
//        Map<String, Object> params = new HashMap<>();
//        params.put("jsonrpc", "2.0");
//        params.put("id", "1");
//        params.put("method", "eth_subscribe");
//        params.put("params", new String[]{"newHeads"});
//
//        log.info("传入信息::{}",params);
//
//        JSONObject blockNumber = blockService.getBlockMessage(params);
//
//        log.info("区块信息：:{}", blockNumber);
//
//        log.info(blockNumber.getString("result"));
//        log.info(blockNumber.getString("id"));
//
//    }
//
//}