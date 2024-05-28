package com.scm.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PageController {

    @GetMapping("/home")
    public String home() {
        System.out.println("this is home paeg");
        return "this is working in vs code finalay i connect with the frontend and backend";
    }

    @GetMapping("/about")
    public String about() {
        return "about page is this";
    }

    @GetMapping("/services")
    public String services() {
        return new String("this is services");
    }

}
