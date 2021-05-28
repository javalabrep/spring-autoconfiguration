package com.javalab.autoconfigure;

import com.javalab.conditions.ConditionalOnMyPublicServiceEnabled;
import com.javalab.controller.MyInternalController;
import com.javalab.controller.MyPublicController;
import com.javalab.services.MyInternalServiceImpl;
import com.javalab.services.MyInternalService;
import com.javalab.services.MyPublicService;
import com.javalab.services.MyPublicServiceImpl;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingClass("com.javalab.conditions.MyConditionClass")
@ConditionalOnResource(resources = "classpath:application.yaml")
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "enable", name = "service.internal", havingValue = "true")
    public MyInternalService myInternalService(){
        return new MyInternalServiceImpl();
    }

    @Bean
    @ConditionalOnMyPublicServiceEnabled
    public MyPublicService myPublicService(){
        return new MyPublicServiceImpl();
    }

    @Bean
    public MyInternalController myInternalController(MyInternalService myInternalService){
        return new MyInternalController(myInternalService);
    }
    @Bean
    @ConditionalOnBean(MyPublicService.class)
    public MyPublicController myPublicController(MyPublicService myPublicService){
        return new MyPublicController(myPublicService);
    }
}
