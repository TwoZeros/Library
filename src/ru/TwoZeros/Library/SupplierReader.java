package ru.TwoZeros.Library;

import ru.TwoZeros.Library.Interfaces.IBook;
import ru.TwoZeros.Library.Interfaces.IReader;
import ru.TwoZeros.Library.Interfaces.ISupplier;

public class SupplierReader extends User implements ISupplier, IReader {

    public SupplierReader(String name) {
        super(name);
    }


    @Override
    public void bringBook(IBook book) {
        System.out.println("Поставщик " + getName() + " принес книгу "+ book.getName() + " в библиотеку");
    }

    @Override
    public void takeBook(IBook book) {
        System.out.println("Читатель " +getName() + " взял книгу " + book.getName());
    }

    @Override
    public void returnBook(IBook book) {
        System.out.println("Читатель " + getName() + " вернул книгу " + book.getName());
    }

}
