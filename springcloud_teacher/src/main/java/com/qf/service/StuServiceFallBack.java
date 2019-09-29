package com.qf.service;

import org.springframework.stereotype.Component;

@Component
public class StuServiceFallBack implements IStuService {
    @Override
    public String list() {
        return "服务异常，请稍后在是";
    }
}
