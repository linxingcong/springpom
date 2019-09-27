package com.qf.springclound_erack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloundErackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloundErackApplication.class, args);
    }

}
