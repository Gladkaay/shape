package com.gladkaya.shape.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Integer, Double> map;
    private static final Warehouse instance = new Warehouse();

    private Warehouse() {
        map = new HashMap<Integer, Double>();
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public Double getTriangle(int id) {
        return map.get(id);
    }

    public void putPerimeter(int id, double perimeter) {
        map.put(id, perimeter);
    }

    public void putArea(int id, double area) {
        map.put(id, area);
    }

    public Double removeTriangle(int id){
        return map.remove(id);
    }
}
