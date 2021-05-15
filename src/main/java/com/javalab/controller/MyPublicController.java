package com.javalab.controller;

import com.javalab.services.MyPublicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MyPublicController {

    private MyPublicService myPublicService;

    public MyPublicController(MyPublicService myPublicService) {
        this.myPublicService = myPublicService;
    }

    @GetMapping(value = "/myPublicEndpoint")
    public String getPublic(){
        return myPublicService.printPublic();
    }
}
