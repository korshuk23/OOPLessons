package oop.practice.clases;

import oop.practice.clases.book.BindingType;
import oop.practice.clases.book.Book;
import oop.practice.clases.bus.Bus;
import oop.practice.clases.patient.Patient;
import oop.practice.clases.person.Person;
import oop.practice.clases.phone.Phone;

public class InitData {

    public static Book[] initBooks() {
        Book[] books = new Book[4];
        books[0] = new Book(1, "Java", new String[]{"Sergei", "Egor", "Nikita"}, "Piter",
                2012, 560, BindingType.SOFT);
        books[1] = new Book(2, "Python", new String[]{"Ivan", "Egor", "Nikita"}, "Moskva",
                2016, 560, BindingType.SOFT);
        books[2] = new Book(3, "Golang", new String[]{"Andrei", "Egor", "Nikita"}, "Minsk",
                2012, 560, BindingType.SOFT);
        books[3] = new Book(4, "JavaScript", new String[]{"Alexandr", "Egor", "Nikita"}, "Piter",
                2017, 560, BindingType.SOFT);
        return books;
    }

    public static Patient[] initPatients() {
        Patient[] patients = new Patient[6];
        patients[0] = new Patient("Alexei", "Sergeev", "Nikolaevich",
                "Kopievicha,6", "+375295458340", 1, "cold");
        patients[1] = new Patient("Egor", "Ivanov", "Vitalievich",
                "Oginskogo,8", "+375294453340", 2, "flu");
        patients[2] = new Patient("Ivan", "Nikitenko", "Vladimirovich",
                "Budenogo,9", "+375295442440", 4, "cold");
        patients[3] = new Patient("Andrei", "Alexandrov", "Sergeevich",
                "Koshevogo,4", "+375293458340", 5, "inflammation");
        patients[4] = new Patient("Alexandr", "Alexeev", "Egorovich",
                "Vaneeva,3", "+375294453340", 3, "cold");
        patients[5] = new Patient("Nikita", "Egorov", "Alexandrovich",
                "Scherbakova,34", "+375295258540", 6, "inflammation");
        return patients;
    }

    public static Bus[] initBuses() {
        Bus[] buses = new Bus[6];
        buses[0] = new Bus("Zybenko M.P.", 33, 2, "BMW",
                2010, 333000);
        buses[1] = new Bus("Petrov S.N.", 24, 6, "Mercedes",
                2020, 15000);
        buses[2] = new Bus("Vasnetsov V.S.", 19, 3, "BMW",
                2009, 388000);
        buses[3] = new Bus("Sergeev E.A.", 9, 8, "Mazda",
                2018, 180000);
        buses[4] = new Bus("Ivanov A.A.", 56, 8, "Mazda",
                2016, 202000);
        buses[5] = new Bus("Kireichik V.K.", 39, 1, "BMW",
                2012, 304000);
        return buses;
    }

    public static void initPhone() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("Anatoliy");
        phone2.receiveCall("Sergei");
        phone3.receiveCall("Valeriy");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Anatoliy", "+375291234567");
    }

    public static void initPerson() {
        Person person1 = new Person();
        Person person2 = new Person("Zybenko M.P.", 35);
        person2.move();
        person2.talk();
    }
}
