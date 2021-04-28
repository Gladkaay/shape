package com.gladkaya.shape.comparator;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;

import java.util.Comparator;

public class TriangleAreaComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double area1 = service.areaOfTriangle(o1);
        double area2 = service.areaOfTriangle(o2);
        return Double.compare(area1, area2);
    }
}
