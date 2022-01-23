package com.sidnikhin.spring.app.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ExceptionLogs {
    @Before("com.sidnikhin.spring.app.Aspects.MyPointCuts.allGetMethods()")
    public void exceptionLog(){
        System.out.println("log: exception log");
    }
}
