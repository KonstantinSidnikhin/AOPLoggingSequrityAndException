package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;

@Component ("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("a reader is taking a book from Library");
    }
    public void returnBook(){
        System.out.println("a reader is returning a book to Library");
    }
    public void getMagazine(){
        System.out.println("a reader is taking a magazine from Library");
    }
    public void returnMagazine(){
        System.out.println("a reader is returning a book to Library");
    }

}
