package com.gladkaya.shape.comparator;

import com.gladkaya.shape.entity.Triangle;


import java.util.Comparator;

public class TriangleAngleComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle o1, Triangle o2) {
        double angle1 = o1.getAngle();
        double angle2 = o2.getAngle();
        return Double.compare(angle1, angle2);
    }
}
