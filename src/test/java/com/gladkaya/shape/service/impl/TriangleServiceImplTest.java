package com.gladkaya.shape.service.impl;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.TriangleService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleServiceImplTest {

    @Test
    public void viewOfRightTriangleTest() {
        Side firstSide = new Side(3.0);
        Side secondSide = new Side(4.0);
        Triangle triangle = new Triangle(firstSide,secondSide, Math.PI/2);
        TriangleService service = new TriangleServiceImpl();
        String view = service.viewOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(view, "Right triangle");
    }

    @Test
    public void viewOfIsoscelesTriangleTest() {
        Side firstSide = new Side(5.0);
        Side secondSide = new Side(5.0);
        Triangle triangle = new Triangle(firstSide,secondSide, Math.PI/6);
        TriangleService service = new TriangleServiceImpl();
        String view = service.viewOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(view, "Isosceles triangle");
    }

    @Test
    public void viewOfEquilateralTriangleTest() {
        Side firstSide = new Side(4.0);
        Side secondSide = new Side(4.0);
        Triangle triangle = new Triangle(firstSide,secondSide, Math.PI/3);
        TriangleService service = new TriangleServiceImpl();
        String view = service.viewOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(view, "Equilateral triangle");
    }

    @Test
    public void viewOfObtuseTriangleTest() {
        Side firstSide = new Side(3.0);
        Side secondSide = new Side(4.0);
        Triangle triangle = new Triangle(firstSide,secondSide, Math.PI*4/5);
        TriangleService service = new TriangleServiceImpl();
        String view = service.viewOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(view, "Obtuse triangle");
    }

    @Test
    public void viewOfAcuteTriangleTest() {
        Side firstSide = new Side(3.0);
        Side secondSide = new Side(4.0);
        Triangle triangle = new Triangle(firstSide,secondSide, Math.PI/4);
        TriangleService service = new TriangleServiceImpl();
        String view = service.viewOfTriangle(firstSide, secondSide, triangle);
        Assert.assertEquals(view, "Acute triangle");
    }
}
