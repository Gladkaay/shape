package com.gladkaya.shape.comparator;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;

import java.util.Comparator;

public class TrianglePerimeterComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double perimeter1 = service.perimeterOfTriangle(o1);
        double perimeter2 = service.perimeterOfTriangle(o2);
        return Double.compare(perimeter1, perimeter2);
    }
}
