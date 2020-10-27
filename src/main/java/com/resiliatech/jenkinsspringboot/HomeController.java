package com.resiliatech.jenkinsspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alfred on 27 October 2020
 */
@RestController
@RequestMapping("/jenkins")
public class HomeController {
    @GetMapping
    public String hello() {
        return "Hello from jenkins";
    }
}
