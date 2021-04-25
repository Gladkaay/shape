package com.gladkaya.shape.observer.impl;

import com.gladkaya.shape.entity.Triangle;
import com.gladkaya.shape.observer.Observer;
import com.gladkaya.shape.observer.TriangleEvent;

public class TriangleObserver implements Observer {
    @Override
    public void parameterChanged(TriangleEvent event) {
        Triangle triangle = event.getSource();
    }
}
