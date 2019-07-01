package com.francis.docker.myfirstdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyFirstDockerApplication {


    @RequestMapping("/")
    public String sayHello() {
        return "Hello, my first dock demo!";
    }


    public static void main(String[] args) {
        SpringApplication.run(MyFirstDockerApplication.class, args);
    }

}
