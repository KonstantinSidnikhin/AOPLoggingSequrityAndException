package com.sidnikhin.spring.app.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityLogs {
    @Before("com.sidnikhin.spring.app.Aspects.MyPointCuts.allGetMethods()")
    public void allMethodsSecurityLog(){
        System.out.println("log: security check (all get methods)");
    }
}
