package com.gladkaya.shape.entity;


import com.gladkaya.shape.observer.Observable;
import com.gladkaya.shape.observer.Observer;
import com.gladkaya.shape.observer.TriangleEvent;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Side implements Observable {
    private int triangleId;
    private Side firstSide;
    private Side secondSide;
    private double angle;
    private List<Observer> observers = new ArrayList<>();

    public Triangle(Side firstSide, Side secondSide, double angle) {
        super();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    public Triangle(int triangleId) {
        super();
        this.triangleId = triangleId;
    }

    public Integer getTriangleId() {
        return triangleId;
    }


    public double getAngle() {
        return angle;
    }


    public void setAngle(double angle) {
        this.angle = angle;
        notifyObservers();
    }

    public Side getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(Side firstSide) {
        this.firstSide = firstSide;
        notifyObservers();
    }

    public Side getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Side secondSide) {
        this.secondSide = secondSide;
        notifyObservers();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TriangleEntity{");
        sb.append("triangleId=").append(triangleId);
        sb.append(", firstSide=").append(firstSide);
        sb.append(", secondSide=").append(secondSide);
        sb.append(", angle=").append(angle);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void attach(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        TriangleEvent event = new TriangleEvent(this);
        for (Observer observer : observers) {
            observer.parameterChanged(event);
        }
    }
}
