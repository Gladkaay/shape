package com.gladkaya.shape.service.impl;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.TriangleService;

public class TriangleServiceImpl implements TriangleService {
    private final static String RIGHT_TRIANGLE = "Right triangle";
    private final static String ISOSCELES_TRIANGLE = "Isosceles triangle";
    private final static String EQUILATERAL_TRIANGLE = "Equilateral triangle";
    private final static String ACUTE_TRIANGLE = "Acute triangle";
    private final static String OBTUSE_TRIANGLE = "Obtuse triangle";
    String view = null;

    @Override
    public String viewOfTriangle(Side firstSide, Side secondSide, Triangle triangle) {
        double a = firstSide.getSide();
        double b = secondSide.getSide();
        double thirdSide = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(triangle.getAngle()));
        double secondAngle = Math.asin(a * Math.sin(triangle.getAngle()) / thirdSide);
        double thirdAngle = Math.PI - triangle.getAngle() - secondAngle;
        if (triangle.getAngle() == Math.PI/2 || secondAngle == Math.PI/2 || thirdAngle == Math.PI/2) {
            view = RIGHT_TRIANGLE;
        } else {
            if (triangle.getAngle() == Math.PI/3) {
                view = EQUILATERAL_TRIANGLE;
            } else {
                if (a == b || a == thirdSide || b == thirdSide) {
                    view = ISOSCELES_TRIANGLE;
                }
            }
        }
        if (view == null) {
            if (triangle.getAngle() > Math.PI/2 || secondAngle > Math.PI/2 || thirdAngle > Math.PI/2) {
                view = OBTUSE_TRIANGLE;
            } else {
                view = ACUTE_TRIANGLE;
            }
        }
        return view;
    }
}