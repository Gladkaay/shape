package com.gladkaya.shape.repository.impl;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.repository.Specification;

public class IdSpecification implements Specification {
    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(Triangle triangle) {
        boolean result = triangle.getTriangleId() == id;
        return result;
    }
}
