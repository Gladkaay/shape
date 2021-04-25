package com.gladkaya.shape.service;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;

public interface SizeTriangleService {
    double perimeterOfTriangle(Side firstSide, Side secondSide, Triangle triangle);
    double areaOfTriangle(Side firstSide, Side secondSide, Triangle triangle);
}
