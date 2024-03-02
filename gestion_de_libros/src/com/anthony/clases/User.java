package com.anthony.clases;

abstract public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void displayInfo();
}
