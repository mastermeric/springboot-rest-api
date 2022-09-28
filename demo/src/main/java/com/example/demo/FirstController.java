package com.example.demo;

import java.time.LocalDate;

import org.apache.logging.log4j.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {    
    
    Logger myLogger = LogManager.getLogger(FirstController.class);    

    @GetMapping("test")
    public String test() {                
        
        myLogger.log(Level.INFO, "--------------------------------");
        myLogger.log(Level.INFO, "--------------------------------");
        myLogger.log(Level.INFO, "TESTTTTT");
        myLogger.log(Level.INFO, "TESTTTTT");
        myLogger.log(Level.INFO, "TESTTTTT");
        myLogger.log(Level.INFO, "--------------------------------");
        myLogger.log(Level.INFO, "--------------------------------");
        
        return "OK... Done : " + LocalDate.now();

    }
}
