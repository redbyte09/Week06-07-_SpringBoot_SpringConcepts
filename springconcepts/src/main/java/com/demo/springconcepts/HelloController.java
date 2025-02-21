package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //Correct SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    //UC1: Simple Hello World
    @GetMapping("/uc1")
    public String sayHelloUC1() {
        return "Hello from BridgeLabz";
    }

    //UC2: Hello World with Logging
    @GetMapping("/uc2")
    public String sayHelloUC2() {
        logger.info("GET request received at /hello/uc2");
        return "Hello from BridgeLabz with Logging";
}
}