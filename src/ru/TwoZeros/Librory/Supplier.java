package ru.TwoZeros.Librory;

import ru.TwoZeros.Librory.Interfaces.IBook;
import ru.TwoZeros.Librory.Interfaces.ISupplier;

public class Supplier extends User implements ISupplier {

    public Supplier(String name) {
        super(name);
    }


    @Override
    public void bringBook(IBook book) {
        System.out.println("Поставщик " + getName() + " принес книгу "+ book.getName() + " в библиотеку");
    }
}
