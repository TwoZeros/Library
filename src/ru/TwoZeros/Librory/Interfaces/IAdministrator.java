package ru.TwoZeros.Librory.Interfaces;

public interface IAdministrator {
    void overDueNotification(IReader reader, IBook book);
    void findBook(IBook book);
    String getName();
}
