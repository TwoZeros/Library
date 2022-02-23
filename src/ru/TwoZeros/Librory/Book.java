package ru.TwoZeros.Librory;

import ru.TwoZeros.Librory.Interfaces.IBook;

public class Book implements IBook {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
