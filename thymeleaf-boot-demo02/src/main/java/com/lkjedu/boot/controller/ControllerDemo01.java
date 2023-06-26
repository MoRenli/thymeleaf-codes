package com.lkjedu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo01 {
    /**
     * 参数：Model:存放数据到request域中
     */
    @RequestMapping({"/index","/"})
    public String index(Model model){
        model.addAttribute("MyName","zhangsan");
        return "index";
    }
}
