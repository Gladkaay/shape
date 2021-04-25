package com.gladkaya.shape.repository;

import com.gladkaya.shape.entity.Triangle;

@FunctionalInterface
public interface Specification {
    boolean specify(Triangle triangle);
}
