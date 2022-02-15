package com.inspur.ethereumtest.controller;

import com.inspur.ethereumtest.pojo.Blockbynumber;
import com.inspur.ethereumtest.service.BlockSelecetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private BlockSelecetService blockSelecetService;
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/hello/thymeleaf")
    public String hello(HttpServletRequest req, HttpServletResponse resp,Model model)throws Exception {
//        model.addAttribute("msg", "springboot集成thymeleaf");
        req.setCharacterEncoding("utf-8");
        String number=req.getParameter("data");
        log.info("-------:{}",number);

//        String number="0xf4240";
        String a=number;
        if (number==null){
            return "test";
        }
//        if(0xffffff<Integer.parseInt( "0xf4240")) {
//            List<Blockbynumber> byNumber = blockSelecetService.findByNumber(number);
//            model.addAttribute("byNunmber", byNumber);
//        }
        else {
            List<Blockbynumber> byNumber = blockSelecetService.finByHash(number);
            model.addAttribute("byNunmber", byNumber);
        }

        return "test";

    }




}