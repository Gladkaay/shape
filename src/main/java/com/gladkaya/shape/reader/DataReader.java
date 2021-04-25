package com.gladkaya.shape.reader;

import com.gladkaya.shape.exception.ShapeException;
import com.gladkaya.shape.validator.DataValidator;
import com.gladkaya.shape.validator.ShapeValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReader {
    private final static Logger logger = LogManager.getLogger();

    public ArrayList<String> readData(String path) throws ShapeException {
        try {
            Stream<String> lineStream = Files.lines(Paths.get(path));
            ArrayList<String> correctLines = lineStream.filter(DataValidator::isDataValid)
                    .filter(ShapeValidator::isTriangle)
                    .collect(Collectors.toCollection(ArrayList::new));
            return correctLines;
        } catch (IOException e) {
            throw new ShapeException(e);
        }
    }
}
