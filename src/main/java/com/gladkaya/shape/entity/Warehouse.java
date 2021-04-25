package com.gladkaya.shape.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Integer, TriangleParameter> map;
    private static final Warehouse instance = new Warehouse();

    private Warehouse() {
        map = new HashMap<>();
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public TriangleParameter getTriangle(int id) {
        return map.get(id);
    }

    public TriangleParameter putPerimeter(int id, TriangleParameter perimeter) {
        return map.put(id, perimeter);
    }

    public TriangleParameter putArea(int id, TriangleParameter area) {
        return map.put(id, area);
    }

    public TriangleParameter removeTriangle(int id){
        return map.remove(id);
    }
}
