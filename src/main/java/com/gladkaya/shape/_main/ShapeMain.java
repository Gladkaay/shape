package com.gladkaya.shape._main;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.exception.ShapeException;
import com.gladkaya.shape.factory.TriangleFactory;
import com.gladkaya.shape.parser.DataParser;
import com.gladkaya.shape.reader.DataReader;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.TriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;
import com.gladkaya.shape.service.impl.TriangleServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ShapeMain {
    private final static Logger logger = LogManager.getLogger();
    private final static String path = "src/main/resources/file/shapeDataFile.txt";
    public static void main(String[] args) throws ShapeException {
        DataReader dataReader = new DataReader();
        DataParser dataParser = new DataParser();
        TriangleFactory triangleFactory = new TriangleFactory();
        TriangleService triangleService = new TriangleServiceImpl();
        SizeTriangleService sizeTriangleService = new SizeTriangleServiceImpl();

        ArrayList<String> lines = dataReader.readData(path);
        for(String s : lines) {
            double[] correct = dataParser.parseTriangle(s);
            Triangle triangle = triangleFactory.buildTriangle(correct);
            double area = sizeTriangleService.areaOfTriangle(triangle);
            logger.log(Level.INFO, "Area of triangle: " + area);
            double perimeter = sizeTriangleService.perimeterOfTriangle(triangle);
            logger.log(Level.INFO, "Perimeter of triangle: " + perimeter);
            String viewOfTriangle = triangleService.viewOfTriangle(triangle);
            logger.log(Level.INFO, "View of triangle: " + viewOfTriangle);
        }
    }
}
