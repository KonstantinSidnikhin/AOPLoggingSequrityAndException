package com.sidnikhin.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")

public class Book {
    @Value("Федор Михайлович Достоевский")
    private String author;

    @Value("Преступление и наказание")
    private String name;

    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }

}
