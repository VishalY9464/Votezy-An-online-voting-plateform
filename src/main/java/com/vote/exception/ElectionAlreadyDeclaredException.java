package com.vote.exception;

public class ElectionAlreadyDeclaredException extends RuntimeException {
    public ElectionAlreadyDeclaredException(String message) {
        super(message);
    }
}
