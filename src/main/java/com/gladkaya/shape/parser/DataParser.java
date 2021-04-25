package com.gladkaya.shape.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class DataParser {
    private final static Logger logger = LogManager.getLogger();
    private final static String STRING_REGEXP = "\\s";

    public float[] parseTriangle(String correctLine) {
        String[] stringTriangle = correctLine.split(STRING_REGEXP);
        float[] triangleLine = new float[stringTriangle.length];
        for (int i = 0; i < stringTriangle.length; i++) {
            triangleLine[i] = Float.parseFloat(stringTriangle[i]);
        }
        logger.log(Level.INFO, "Correct line of triangle: " + Arrays.toString(triangleLine));
        return triangleLine;
    }
}