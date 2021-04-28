package com.gladkaya.shape.repository.impl;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.repository.Specification;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;

public class TriangleAreaSpecification implements Specification {
    private double area;

    public TriangleAreaSpecification(double area) {
        this.area = area;
    }


    @Override
    public boolean specify(Triangle triangle) {
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double areaOfTriangle = service.areaOfTriangle(triangle);
        boolean result = areaOfTriangle > area;
        return result;
    }
}
