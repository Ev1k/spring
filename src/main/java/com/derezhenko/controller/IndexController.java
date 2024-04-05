package com.derezhenko.controller;


import com.derezhenko.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping( "/index")
    public String index() {
        return "index";
    }
}
