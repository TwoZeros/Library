package ru.TwoZeros.Library;


import ru.TwoZeros.Library.Interfaces.IBook;
import ru.TwoZeros.Library.Interfaces.IReader;

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
