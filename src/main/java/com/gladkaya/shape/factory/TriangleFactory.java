package com.gladkaya.shape.factory;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleFactory {
    private final static Logger logger = LogManager.getLogger();
    public static Triangle buildTriangle(double[] triangleLine){
        Side firstSide = new Side((double) triangleLine[0]);
        Side secondSide = new Side((double) triangleLine[1]);
        Triangle triangle = new Triangle(firstSide, secondSide, triangleLine[2]);
        return triangle;
    }

    public static Triangle buildTriangle(Side firstSide, Side secondSide, double angle){
        Triangle triangle = new Triangle(firstSide, secondSide, angle);
        return triangle;
    }
}
