package com.gladkaya.shape.repository;

import com.gladkaya.shape.entity.Triangle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {
    private List<Triangle> triangles;
    private static Repository instance;

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public List<Triangle> getTriangles(){
        return new ArrayList<>(triangles);
    }

    public boolean add(Triangle triangle) {
        return triangles.add(triangle);
    }

    public boolean remove(Object o) {
        return triangles.remove(o);
    }

    public boolean addAll(Collection<? extends Triangle> c) {
        return triangles.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return triangles.removeAll(c);
    }

    public Triangle get(int index) {
        return triangles.get(index);
    }

    public Triangle set(int index, Triangle element) {
        return triangles.set(index, element);
    }

    public List<Triangle> query(Specification specification) {
        List<Triangle> list = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (specification.specify(triangle)) {
                list.add(triangle);
            }
        }
        return list;
    }

    public List<Triangle> queryStream(Specification specification) {
       List<Triangle> list = triangles.stream().filter(specification::specify).collect(Collectors.toList());
        return list;
    }
}
