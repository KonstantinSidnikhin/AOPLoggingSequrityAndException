package com.sidnikhin.spring.app.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class Logging {






    @Before("com.sidnikhin.spring.app.Aspects.MyPointCuts.libraryGetMethods()")
        public void libraryLogInfo(){
            System.out.println("log: an item is taken from Library");
        }

    @Before("com.sidnikhin.spring.app.Aspects.MyPointCuts.uniLabraryGetMethods()")
    public void uniLibraryLogInfo(){
        System.out.println("log: an item is taken from UniLabrary");
    }







}
