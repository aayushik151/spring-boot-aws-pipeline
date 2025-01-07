package com.example.springbootcicd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldAPI {

    @GetMapping
    public String HelloWorld(){
        return "Hello World";
    }
}
