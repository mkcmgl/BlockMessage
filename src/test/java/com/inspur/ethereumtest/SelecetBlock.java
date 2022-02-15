package com.inspur.ethereumtest;

import com.inspur.ethereumtest.mapper.BlockSyncLogMapper;
import com.inspur.ethereumtest.mapper.BlockbynumberMapper;
import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.service.BlockSelecetService;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SelecetBlock {

    @Autowired
    private BlockSelecetService blockSelecetService;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void slecetByNumber(){
        String number="0xf4240";

        List<Blockbynumber> byNumber = blockSelecetService.findByNumber(number);
        log.info("Test 用Number查到的block信息为：{}",byNumber);

    }
    @Test
    public void  selectByHash(){
        String hash="0xf84adefd0ce12ab1bab13341206c106f5065bd7ff34fc7393d383d4d740ef0fc";
        List<Blockbynumber> byNumber = blockSelecetService.finByHash(hash);
       log.info("Test 用HASH查到的block信息为：{}", byNumber);
    }





}
