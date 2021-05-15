package com.javalab.services;

public class MyPublicServiceImpl implements MyPublicService{

    @Override
    public String printPublic() {
        return "You are using the public API ....";
    }
}
