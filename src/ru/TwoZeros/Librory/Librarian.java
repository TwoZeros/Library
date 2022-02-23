package ru.TwoZeros.Librory;

import ru.TwoZeros.Librory.Interfaces.IBook;
import ru.TwoZeros.Librory.Interfaces.ILibrarian;
import ru.TwoZeros.Librory.Interfaces.ISupplier;

public class Librarian extends User implements ILibrarian {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(IBook book, ISupplier supplier) {
        System.out.println(super.getName() + " заказал у поставщика " + supplier.getName() + " книгу "
                            + book.getName());
    }

}
