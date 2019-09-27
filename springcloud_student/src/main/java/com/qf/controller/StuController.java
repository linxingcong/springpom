package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stu")
public class StuController {
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return "返回";

    }

}
