package com.gladkaya.shape.service.impl;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.SizeTriangleService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SizeTriangleServiceImplTest {
    private final static Side firstSide = new Side(3.0);
    private final static Side secondSide = new Side(4.0);
    private final static Triangle triangle = new Triangle(firstSide,secondSide, Math.PI/2);

    @Test
    public void perimeterOfTriangleTest() {
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double perimeter = service.perimeterOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(perimeter, 12);
    }

    @Test
    public void areaOfTriangleTest() {
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double area = service.areaOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(area, 6);
    }
}
