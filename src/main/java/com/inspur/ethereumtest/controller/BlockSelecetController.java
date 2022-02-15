package com.inspur.ethereumtest.controller;



import com.inspur.ethereumtest.pojo.Blockbynumber;

import com.inspur.ethereumtest.service.BlockByService;
import com.inspur.ethereumtest.service.BlockSelecetService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;


@RestController
@ResponseBody
@RequestMapping("/selecet")
public class BlockSelecetController {

    @Autowired
    private BlockByService blockByService;
    @Autowired
    private BlockSelecetService blockSelecetService;


    private Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Blockbynumber> list = blockByService.list();
        modelAndView.addObject("blockList",list);
        modelAndView.setViewName("block-list");
        return modelAndView;
    }

    @GetMapping("/number")
    public void getBlockByNumber() {
    String number="0xf4240";
        List<Blockbynumber> byNumber = blockSelecetService.findByNumber(number);

        List<Blockbynumber> list = blockByService.list();

        log.info("查到信息：{}",byNumber.toString());


    }








}
