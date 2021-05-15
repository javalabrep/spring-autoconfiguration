package com.javalab.services;

public class MyInternalServiceImpl implements MyInternalSrevice{

    @Override
    public String printInternal(){
        return "You are using the internal API ...";
    }
}
