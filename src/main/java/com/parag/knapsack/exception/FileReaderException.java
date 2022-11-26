package com.parag.knapsack.exception;

public class FileReaderException extends RuntimeException {

    public FileReaderException(String message, Exception exception) {
        super(message, exception);
    }
}
