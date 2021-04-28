package com.gladkaya.shape.service;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;

public interface SizeTriangleService {
    double areaOfTriangle(Triangle triangle);

    double perimeterOfTriangle(Triangle triangle);
}
