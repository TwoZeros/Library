package ru.TwoZeros.Librory;

public abstract class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }
}
