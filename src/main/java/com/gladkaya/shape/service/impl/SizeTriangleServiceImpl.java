package com.gladkaya.shape.service.impl;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.SizeTriangleService;

public class SizeTriangleServiceImpl implements SizeTriangleService {

    @Override
    public double areaOfTriangle(Triangle triangle) {
        double a = triangle.getFirstSide().getSide();
        double b = triangle.getSecondSide().getSide();
        double area = 0.5 * a * b * Math.sin(triangle.getAngle());
        return area;
    }

    @Override
    public double perimeterOfTriangle(Triangle triangle) {
        double a = triangle.getFirstSide().getSide();
        double b = triangle.getSecondSide().getSide();
        double perimeter = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(triangle.getAngle()));
        return perimeter;
    }

}
