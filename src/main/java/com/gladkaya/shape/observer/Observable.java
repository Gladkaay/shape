package com.gladkaya.shape.observer;

public interface Observable {
    void attach(TriangleObserver triangleObserver);
    void detach(TriangleObserver triangleObserver);
    void notifyObservers();
}
