package ru.TwoZeros.Librory;


import ru.TwoZeros.Librory.Interfaces.IBook;
import ru.TwoZeros.Librory.Interfaces.IReader;

public class GoldReader extends User implements IReader {

    public GoldReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(IBook book) {
        System.out.println(getName() + " взял книгу " + book.getName());
    }

    @Override
    public void returnBook(IBook book) {
        System.out.println(getName() + " вернул книгу " + book.getName());
    }



}
