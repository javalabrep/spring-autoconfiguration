package com.javalab.controller;

import com.javalab.services.MyInternalSrevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MyInternalController {

    private MyInternalSrevice myInternalSrevice;

    public MyInternalController(MyInternalSrevice myInternalSrevice) {
        this.myInternalSrevice = myInternalSrevice;
    }

    @GetMapping(value = "/myInternalEndpoint")
    public String getInternal(){
        return myInternalSrevice.printInternal();
    }
}
