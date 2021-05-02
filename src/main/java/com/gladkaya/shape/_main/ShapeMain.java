package com.gladkaya.shape._main;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.entity.TriangleParameter;
import com.gladkaya.shape.entity.Warehouse;
import com.gladkaya.shape.exception.ShapeException;
import com.gladkaya.shape.factory.TriangleFactory;
import com.gladkaya.shape.observer.impl.TriangleObserverImpl;
import com.gladkaya.shape.parser.DataParser;
import com.gladkaya.shape.reader.DataReader;
import com.gladkaya.shape.repository.Repository;
import com.gladkaya.shape.repository.Specification;
import com.gladkaya.shape.repository.impl.TriangleIdSpecification;
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
        for (String s : lines) {
            double[] correct = dataParser.parseTriangle(s);
            Triangle triangle = TriangleFactory.buildTriangle(correct);
            double area = sizeTriangleService.areaOfTriangle(triangle);
            logger.log(Level.INFO, "Area of triangle: " + area);
            double perimeter = sizeTriangleService.perimeterOfTriangle(triangle);
            logger.log(Level.INFO, "Perimeter of triangle: " + perimeter);
            String viewOfTriangle = triangleService.viewOfTriangle(triangle);
            logger.log(Level.INFO, "View of triangle: " + viewOfTriangle);
            Triangle newTriangle = TriangleFactory.buildTriangle(correct);
            // newTriangle.attach(new TriangleObserverImpl());
        }
 /*       Repository repository = Repository.getInstance();
        for (Triangle triangle : repository.getTriangles()){
            logger.log(Level.INFO, triangle);
            Warehouse warehouse = Warehouse.getInstance();
            Integer triangleId = triangle.getTriangleId();
            Double triangleParameter = warehouse.getTriangle(triangleId);
            logger.log(Level.INFO, triangleParameter);
        }

        Specification specification = new TriangleIdSpecification(1);
        logger.log(Level.INFO, repository.query(specification));*/
    }
}
