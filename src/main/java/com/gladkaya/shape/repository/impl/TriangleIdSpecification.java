package com.gladkaya.shape.repository.impl;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.repository.Specification;

public class TriangleIdSpecification implements Specification {
    private int id;

    public TriangleIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(Triangle triangle) {
        boolean result = triangle.getTriangleId() == id;
        return result;
    }
}
