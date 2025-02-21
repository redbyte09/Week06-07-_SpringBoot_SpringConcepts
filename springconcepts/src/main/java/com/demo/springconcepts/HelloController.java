package com.demo.springconcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //UC1
    @GetMapping
    public String sayHelloUC1() {
        return "Hello from BridgeLabz";
}
}
