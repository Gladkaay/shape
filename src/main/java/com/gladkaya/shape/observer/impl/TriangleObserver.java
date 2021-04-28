package com.gladkaya.shape.observer.impl;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.entity.Warehouse;
import com.gladkaya.shape.observer.TriangleEvent;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;

public class TriangleObserver implements com.gladkaya.shape.observer.TriangleObserver {
    @Override
    public void parameterChanged(TriangleEvent event) {
        Triangle triangle = event.getSource();
        int id = triangle.getTriangleId();
        Warehouse warehouse = Warehouse.getInstance();
        SizeTriangleService service = new SizeTriangleServiceImpl();
        double area = service.areaOfTriangle(triangle);
        double perimeter = service.perimeterOfTriangle(triangle);
        warehouse.putArea(id, area);
        warehouse.putPerimeter(id, perimeter);
    }
}
