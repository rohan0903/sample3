package com.howtodoinjava.rest.controller;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController("sample")
@EnableAutoConfiguration
public class ExampleController {

   @RequestMapping("/home")
   public String home() {
        return "Hello World";
    }
}

