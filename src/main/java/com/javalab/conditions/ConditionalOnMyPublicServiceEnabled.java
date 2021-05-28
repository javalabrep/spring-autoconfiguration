package com.javalab.conditions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ConditionalOnProperty(prefix = "enable", name = "service.public", havingValue = "true")
public @interface ConditionalOnMyPublicServiceEnabled {
}
