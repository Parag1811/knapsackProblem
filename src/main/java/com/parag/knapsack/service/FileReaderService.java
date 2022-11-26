package com.parag.knapsack.service;

import com.parag.knapsack.constant.Constants;
import com.parag.knapsack.exception.FileReaderException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderService {

    /**
     * Reads the lines of a file with the given file path into a stream of strings.
     *
     * @param filePath The file path whose file is to be read.
     * @return A stream of strings.
     * @throws FileReaderException if an io exception occurs.
     */
    public Stream<String> readLines(String filePath) throws FileReaderException {
        try {
            return Files.lines(Path.of(filePath));
        } catch (IOException e) {
            throw new FileReaderException(Constants.READ_FILE_EXCEPTION_MESSAGE, e);
        }
    }

}