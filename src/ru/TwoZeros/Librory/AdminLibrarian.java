package ru.TwoZeros.Librory;

import ru.TwoZeros.Librory.Interfaces.*;

public class AdminLibrarian extends User implements ILibrarian, IAdministrator {
    public AdminLibrarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(IBook book, ISupplier supplier) {
        System.out.println(super.getName() + " заказал у поставщика " + supplier.getName() + " книгу "
                            + book.getName());
    }

    @Override
    public void overDueNotification(IReader reader, IBook book) {
        System.out.println("Администратор библиотеки " + getName() + " попросил " + reader.getName()
                + " вернуть книгу "+ book.getName() );
    }

    @Override
    public void findBook(IBook book) {
        System.out.println("Администратор библиотеки " + getName() + " нашел книгу " + book.getName() + " в библиотеке");
    }
}
