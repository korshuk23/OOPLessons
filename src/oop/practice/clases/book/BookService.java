package oop.practice.clases.book;

public class BookService {
    private final Book[] books;

    public BookService(Book[] books) {
        this.books = books;
    }

    public Book[] booksByAuthor(String author) {
        Book[] booksByAuthor = new Book[books.length];
        for (Book book : books) {
            String[] authors = book.getAuthors();
            for (int i = 0; i < authors.length; i++) {
                if (authors[i].equals(author)) {
                    booksByAuthor[i] = book;
                }
            }
        }
        return booksByAuthor;
    }

    public Book[] booksByPublishHouse(String publishHouse) {
        int count = 0;
        Book[] booksByPublishHouse = new Book[books.length];
        for (Book book : books) {
            if (book.getPublishingHouse().equals(publishHouse)) {
                booksByPublishHouse[count++] = book;
            }
        }
        return booksByPublishHouse;
    }

    public Book[] booksByYear(int year) {
        int count = 0;
        Book[] booksByYear = new Book[books.length];
        for (Book book : books) {
            if (book.getYearOfPublish() > year) {
                booksByYear[count++] = book;
            }
        }
        return booksByYear;
    }
}
