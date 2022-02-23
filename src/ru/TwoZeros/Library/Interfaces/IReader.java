package ru.TwoZeros.Library.Interfaces;

public interface IReader {
    void takeBook(IBook book);
    void returnBook(IBook book);
    String getName();
}
