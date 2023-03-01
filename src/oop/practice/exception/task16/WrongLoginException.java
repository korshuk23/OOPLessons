package oop.practice.exception.task16;

public class WrongLoginException extends Exception {
    public WrongLoginException(String s) {
        super(s);
    }

    public WrongLoginException() {
        super();
    }
}
