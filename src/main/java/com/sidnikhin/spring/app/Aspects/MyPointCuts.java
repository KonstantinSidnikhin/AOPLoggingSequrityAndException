package com.sidnikhin.spring.app.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(public void com.sidnikhin.spring.app.Library.get*(..))")
    public void libraryGetMethods(){}

    @Pointcut("execution(public void com.sidnikhin.spring.app.UniLibrary.get*(..))")
    public void uniLabraryGetMethods(){}
    @Pointcut("libraryGetMethods()||uniLabraryGetMethods()")
    public void allGetMethods(){}
}
