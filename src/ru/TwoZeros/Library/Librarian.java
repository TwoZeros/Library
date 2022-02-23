package ru.TwoZeros.Library;

import ru.TwoZeros.Library.Interfaces.IBook;
import ru.TwoZeros.Library.Interfaces.ILibrarian;
import ru.TwoZeros.Library.Interfaces.ISupplier;

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
