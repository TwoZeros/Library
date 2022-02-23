package ru.TwoZeros.Library;

import ru.TwoZeros.Library.Interfaces.IBook;
import ru.TwoZeros.Library.Interfaces.ISupplier;

public class Supplier extends User implements ISupplier {

    public Supplier(String name) {
        super(name);
    }


    @Override
    public void bringBook(IBook book) {
        System.out.println("Поставщик " + getName() + " принес книгу "+ book.getName() + " в библиотеку");
    }
}
