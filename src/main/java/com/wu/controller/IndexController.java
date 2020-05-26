package com.wu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


//在templates下文件只能通过controller跳转，相当于原来的WEB_INF
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }



    //以下是测试内容
    @RequestMapping("/index1")
    public String index1(Model model){
        model.addAttribute("msg","123");
        model.addAttribute("users", Arrays.asList("dsfs","fdsfasf"));
        return "index1";
    }
}
