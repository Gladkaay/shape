package com.gladkaya.shape.comparator;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.service.SizeTriangleService;
import com.gladkaya.shape.service.impl.SizeTriangleServiceImpl;

import java.util.Comparator;

public class TriangleIdComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {

        int id1 = o1.getTriangleId();
        int id2
    }
}
