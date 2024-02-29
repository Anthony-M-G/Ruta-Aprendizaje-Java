package com.anthony.clases;

import com.anthony.interfaz.Loanable;

public class Book implements Loanable {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isLoaned;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isLoaned = false;
    }

    public String getTitle() {
        return title;
    }



    public String getAuthor() {
        return author;
    }



    public int getPublicationYear() {
        return publicationYear;
    }


    public boolean bookStatus(){
        return this.isLoaned == isLoan();
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder(this.getTitle()+" autor "+this.getAuthor()+" fecha de publicación "+this.getPublicationYear());
       return sb.toString();

    }

    @Override
    public boolean isLoan() {
        return this.isLoaned=true;
    }

    @Override
    public boolean returnBook() {
        return this.isLoaned=false;
    }
}
