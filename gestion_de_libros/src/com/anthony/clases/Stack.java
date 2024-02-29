package com.anthony.clases;

import java.util.ArrayList;


public class Stack {
    private ArrayList<Book> bks=new ArrayList<>();



    public Stack addBook(Book book){
        bks.add(book);
        return this;
    }

    public ArrayList<Book> getBks() {
        return this.bks;
    }
    public void info(){

        for (Book b: getBks()){
            System.out.println(b);
        }
    }

}
