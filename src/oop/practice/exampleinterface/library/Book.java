package oop.practice.exampleinterface.library;

public class Book implements Printable{
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
    }
    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.println("Book title: " + ((Book) p).getTitle());
            }
        }
    }
}
