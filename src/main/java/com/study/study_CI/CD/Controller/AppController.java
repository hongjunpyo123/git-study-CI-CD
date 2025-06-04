package com.study.study_CI.CD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the CI/CD Application!";
    }
}


