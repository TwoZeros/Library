package ru.TwoZeros.Library;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AdminLibrarian adminLibrarian = new AdminLibrarian("Сидор");
        GoldReader goldReader = new GoldReader("Иванов Иван");
        SupplierReader supplierReader = new SupplierReader("Андрей Торгашович");
        Book book = new Book("Война и мир");
        adminLibrarian.orderBook(book, supplierReader);
        supplierReader.bringBook(book);
        goldReader.takeBook(book);
        adminLibrarian.findBook(book);
        adminLibrarian.overDueNotification(goldReader, book);
        goldReader.returnBook(book);
        supplierReader.takeBook(book);

    }
}
