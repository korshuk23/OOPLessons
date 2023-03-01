package oop.practice.exception.task16;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String s) {
        super(s);
    }

    public WrongPasswordException() {
        super();
    }
}
