package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {


    @RequestMapping("/")

    public String index ()
    {
        return "index";
    }


    @RequestMapping("/welcome")

    public String welcome ()
    {
        return "welcome";
    }

}
