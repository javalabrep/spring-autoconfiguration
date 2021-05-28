package com.javalab.services;

public class MyInternalServiceImpl implements MyInternalService {

    @Override
    public String printInternal(){
        return "You are using the internal API ...";
    }
}
