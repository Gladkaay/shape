package com.gladkaya.shape.repository.impl;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.repository.Specification;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;

public class TrianglePerimeterSpetification implements Specification {
    private double perimeter;

    public TrianglePerimeterSpetification(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean specify(Triangle triangle) {
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double perimeterOfTriangle = service.perimeterOfTriangle(triangle);
        boolean result = perimeterOfTriangle < perimeter;
        return result;
    }
}
