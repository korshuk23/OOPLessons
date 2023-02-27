package oop.practice.exampleinterface.library;

public class Runner {
    public static void main(String[] args) {
        Printable[] printable = new Printable[]{
                new Book("Shadow of the Mountain", "George R. R. Martin"),
                new Magazine("National Geographic", "National Geographic Society"),
                new Book("The Master and Margarita", "Mikhail Bulgakov"),
                new Magazine("Vogue", "Condé Nast.")};
        for (Printable p : printable) {
            p.print();
            System.out.println();
        }

        Magazine.printMagazines(printable);

        Book.printBooks(printable);
    }
}
