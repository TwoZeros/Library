package ru.TwoZeros.Library;

public abstract class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }
}
