package com.anthony.clases;

import java.util.ArrayList;

public class Student extends  User{

    private ArrayList<Book>  books= new ArrayList<>(); // El estudiante puede agregarse maximo 3 libros


    public Student(String name) {
        super(name);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {

        this.books = books;
    }
    public  void saveBook(Book book){
        try{
        if (this.books.size()<3)
            book.isLoan();
            this.books.add(book);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maxima cantidad de libros alcanzada");
        }
    }
    public void returnBook(Book book){
        if(!this.books.isEmpty()) {
            book.returnBook();
            this.books.remove(book);
        }else System.out.println("Ya no tienes libros para devolver!");
    }


    @Override
    public void displayInfo() {
        StringBuilder sb=new StringBuilder();

        if(!this.books.isEmpty()){
            if(this.books.size()>1){
            sb.append("El estudiante ").append(this.getName()).append(" tiene los siguientes libros: ");}
            sb.append("El estudiante ").append(this.getName()).append("tiene el siguiente libro: ");
        this.getBooks().forEach(e->{
            sb.append((Book)e);
        });
        System.out.println(sb.toString());}
        else System.out.println("El estudiante "+this.getName()+" no ha solicitado ningún libro");
    }
}
