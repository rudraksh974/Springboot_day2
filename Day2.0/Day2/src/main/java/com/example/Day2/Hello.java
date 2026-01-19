package com.example.Day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/contact")
    public String home(){
        return "contact";
    }
    @GetMapping("/about_us")
    public String about(){
        return "about_us";
    }
}