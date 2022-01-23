package com.sidnikhin.spring.app;

import org.springframework.stereotype.Component;
@Component("uniLibraryBean")
public class UniLibrary {


        public void getBook(){
            System.out.println("a reader is taking a book from UniLibrary");
        }
        public void returnBook(){
            System.out.println("a reader is returning a book from UniLibrary");
        }
        public void getMagazine(){
            System.out.println("a reader is taking a magazine from UniLibrary");
        }
        public void returnMagazine(){
            System.out.println("a reader is returning a book from UniLibrary");
        }


    }
