package com.javalab.controller;

import com.javalab.services.MyInternalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MyInternalController {

    private MyInternalService myInternalService;

    public MyInternalController(MyInternalService myInternalService) {
        this.myInternalService = myInternalService;
    }

    @GetMapping(value = "/myInternalEndpoint")
    public String getInternal(){
        return myInternalService.printInternal();
    }
}
