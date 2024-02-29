package com.anthony;



import com.anthony.clases.*;
import java.util.Scanner;

public class mainMenu {

    public static void main(String[] args) {
        // Crear algunos libros
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);

        // Crear un stack y agregar libros
        Stack stack = new Stack();
        stack.addBook(book1).addBook(book2).addBook(book3);

        // Crear un estudiante
        Student student = new Student("John");

        Scanner scanner = new Scanner(System.in);

        // Menú principal
        while (true) {
            System.out.println("\n===== Menú Principal =====");
            System.out.println("1. Solicitar un libro");
            System.out.println("2. Devolver un libro");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            switch (choice) {
                case 1:
                    // Mostrar los libros disponibles en el stack
                    System.out.println("\nLibros disponibles:");
                    for (Book book : stack.getBks()) {
                        System.out.println(book);
                    }
                    // Pedir al estudiante que elija un libro
                    System.out.print("\nEscribe el título del libro que deseas seleccionar : ");
                    String input = scanner.nextLine();

                    // Procesar la solicitud del estudiante
                    boolean bookFound = false;
                    for (Book book : stack.getBks()) {
                        if (book.getTitle().equalsIgnoreCase(input)) {
                            bookFound = true;
                            if (book.bookStatus()==book.isLoan()) {
                                System.out.println("\n¡Lo siento! El libro \"" + book.getTitle() + "\" ya está prestado.");
                            } else {
                                book.isLoan(); // Marcar el libro como prestado
                                student.saveBook(book);  // Agregar el libro al estudiante
                                stack.getBks().remove(book);  // Eliminar el libro del stack
                                System.out.println("\nHas solicitado el libro \"" + book.getTitle() + "\".");
                                student.displayInfo();
                            }
                            break;
                        }
                    }
                    if (!bookFound) {
                        System.out.println("\n¡Lo siento! El libro especificado no está disponible.");
                    }
                    break;
                case 2:
                    // Mostrar los libros prestados al estudiante
                    System.out.println("\nLibros prestados al estudiante " + student.getName() + ":");
                    student.displayInfo();

                    // Pedir al estudiante que devuelva un libro
                    System.out.print("\nEscribe el título del libro que deseas devolver : ");
                    input = scanner.nextLine();

                    // Procesar la devolución del libro
                    bookFound = false;
                    for (Book book : student.getBooks()) {
                        if (book.getTitle().equalsIgnoreCase(input)) {
                            bookFound = true;
                            book.returnBook(); // Marcar el libro como devuelto
                            student.returnBook(book);  // Devolver el libro al stack
                            stack.addBook(book);  // Agregar el libro de nuevo al stack
                            System.out.println("\n¡Has devuelto el libro \"" + book.getTitle() + "\"!");
                            break;
                        }
                    }
                    if (!bookFound) {
                        System.out.println("\n¡Lo siento! No tienes prestado el libro especificado.");
                    }
                    break;
                case 3:
                    System.out.println("\n¡Hasta luego!");
                    stack.info();
                    return;  // Salir del programa
                default:
                    System.out.println("\n¡Opción inválida! Por favor, selecciona una opción válida.");

            }

        }

    }
}

