package com.gladkaya.shape.service;

import com.gladkaya.shape.entity.Side;
import com.gladkaya.shape.entity.Triangle;

public interface TriangleService {
    String viewOfTriangle(Side firstSide, Side secondSide, Triangle triangle);

}
