package ru.TwoZeros.Library.Interfaces;

public interface IAdministrator {
    void overDueNotification(IReader reader, IBook book);
    void findBook(IBook book);
    String getName();
}
