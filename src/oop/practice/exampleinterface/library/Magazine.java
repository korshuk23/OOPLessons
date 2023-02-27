package oop.practice.exampleinterface.library;

public class Magazine implements Printable {
    private final String title;
    private final String publisher;

    public Magazine(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void print() {
        System.out.println("Magazine title: " + title);
        System.out.println("Magazine publisher: " + publisher);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                System.out.println("Magazine title: " + ((Magazine) p).getTitle());
            }
        }
    }
}
