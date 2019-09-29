package com.qf.controller;

import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tea")
public class TeacherController {
    @Autowired
    private IStuService stuService;
    @RequestMapping("/stu")
    @ResponseBody
    public String TeacherStudent(){
        String result=stuService.list();
        return "result:"+result;


    }
}
