package com.jxx.springstart.chap04.exception;

public class WrongIdPasswordException extends RuntimeException {
    public WrongIdPasswordException(String message) {
        super(message);
    }

    public WrongIdPasswordException() {
    }
}
