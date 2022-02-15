package com.inspur.ethereumtest.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.service.BlockByService;
import com.inspur.ethereumtest.service.BlockSelecetService;
import com.inspur.ethereumtest.service.BlockService;
import com.inspur.ethereumtest.service.SaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.inspur.ethereumtest.util.NumberSaveMapUtil;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@ResponseBody
@RequestMapping("/block")

public class BlockController {
    @Autowired
    private BlockService blockService;
    @Autowired
    private BlockByService blockByService;
    @Autowired
    private SaveService saveService;
    @Autowired
   private BlockSelecetService blockSelecetService;
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/get")
    public Object getBlockNumber(@RequestBody Map<String, Object> map) {
        JSONObject blockNumber = blockService.getBlockMessage(map);
        log.info("block信息为::{}", blockNumber);

        Map<String, Object> resultmap = new HashMap<>();
        resultmap.put("id", Integer.parseInt(blockNumber.getString("id")));
        resultmap.put("result", blockNumber.getString("result"));
        blockByService.save(resultmap);


       log.info("成功");
        return blockNumber;
    }

    @GetMapping("/ByNumber")
    public Object saveBlockByNumber(@RequestBody Map<String, Object> map) {
        JSONObject blockByNumber = blockService.getBlockMessage(map);
        //if判断前台实现
        Map<String, Object> saveMap = saveService.saveMap(blockByNumber);
        blockByService.saveByNumber(saveMap);
        log.info("block信息为::{}", blockByNumber);
        log.info("成功");
        return blockByNumber;
    }

    @GetMapping("/savenumber")
    public void saveBlockByNumber() throws InterruptedException {
            String id;
        while (true) {
            String maxId = blockByService.getMaxId();
            if (maxId == null) {
                id = 1+"";
            } else {
                id =Integer.parseInt( maxId)+ 1+"";
            }

            Map<String, Object> params = new HashMap<>();
            Map<String, Object> map = new HashMap<>();
            map.put("jsonrpc", "2.0");
            map.put("id", id);
            map.put("method", "eth_blockNumber");
            map.put("params", new String[]{});
            log.info("map{}", map);

            JSONObject blockNumber = blockService.getBlockMessage(map);
            String result = blockNumber.getString("result");
            Map<String, Object> saveIdMap = new HashMap<>();
            saveIdMap.put("id", Integer.parseInt(blockNumber.getString("id")));
            saveIdMap.put("result", blockNumber.getString("result"));
            log.info("result {}", saveIdMap);

            blockByService.save(saveIdMap);
            System.out.println("id成功save");


            params.put("id", id);
            params.put("jsonrpc", "2.0");
            params.put("method", "eth_getBlockByNumber");
            params.put("params", new Object[]{result, true});

            JSONObject blockByNumber = blockService.getBlockMessage(params);
            log.info("获取的block信息：{}",blockByNumber);
            //if判断id前台实现
            if (blockByNumber!=null){
                Map<String, Object> saveMap = saveService.saveMap(blockByNumber);
                blockByService.saveByNumber(saveMap);
                log.info("block成功save");
                log.info("block信息为::{}", blockByNumber);
                TimeUnit.MILLISECONDS.sleep(10);
            }else {
                blockByService.saveByNumber(saveIdMap);
                log.info("++++获取有错+++++++++++++++++++++++++获取有错+++++++++++++++++++++++++++++获取有错+++++++++++++++++++++++++++++++++");
                TimeUnit.MILLISECONDS.sleep(10);
            }


        }

    }
}


