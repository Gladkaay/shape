package com.gladkaya.shape.service.impl;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.SizeTriangleService;

public class SizeTriangleServiceImpl implements SizeTriangleService {

    @Override
    public double perimeterOfTriangle(Side firstSide, Side secondSide, Triangle triangle) {
        double a = firstSide.getSide();
        double b = secondSide.getSide();
        double perimeter = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(triangle.getAngle()));
        return perimeter;
    }

    @Override
    public double areaOfTriangle(Side firstSide, Side secondSide, Triangle triangle) {
        double area = 0.5*firstSide.getSide()*secondSide.getSide()*Math.sin(triangle.getAngle());
        return area;
    }

}
