package com.gladkaya.shape.observer;

import com.gladkaya.shape.entity.Triangle;

import java.util.EventObject;

public class TriangleEvent extends EventObject {

    public TriangleEvent(Object source) {
        super(source);
    }

    public Triangle getSource() {
        return (Triangle) super.getSource();
    }
}
