package com.sg.byeservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @GetMapping("/greet")
    public String greet() {
        return "Bye World!";
    }

}