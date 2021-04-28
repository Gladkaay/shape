package com.gladkaya.shape.entity;


import com.gladkaya.shape.observer.Observable;
import com.gladkaya.shape.observer.TriangleObserver;
import com.gladkaya.shape.observer.TriangleEvent;
import com.gladkaya.shape.util.GeneratorId;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Side implements Observable {
    private int triangleId;
    private double angle;
    private Side firstSide;
    private Side secondSide;
    private List<TriangleObserver> triangleObservers = new ArrayList<>();

    public Triangle(Side firstSide, Side secondSide, double angle) {
        super();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    public Triangle(int triangleId, Side firstSide, Side secondSide, double angle) {
        super();
        int id = GeneratorId.generateId();
        this.triangleId = id;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    public Integer getTriangleId() {
        return triangleId;
    }


    public double getAngle() {
        double angleInRadian = Math.toRadians(angle);
        return angleInRadian;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (triangleId != triangle.triangleId) return false;
        if (Double.compare(triangle.angle, angle) != 0) return false;
        if (firstSide != null ? !firstSide.equals(triangle.firstSide) : triangle.firstSide != null) return false;
        if (secondSide != null ? !secondSide.equals(triangle.secondSide) : triangle.secondSide != null) return false;
        return triangleObservers != null ? triangleObservers.equals(triangle.triangleObservers) : triangle.triangleObservers == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + triangleId;
        result = 31 * result + (firstSide != null ? firstSide.hashCode() : 0);
        result = 31 * result + (secondSide != null ? secondSide.hashCode() : 0);
        temp = Double.doubleToLongBits(angle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (triangleObservers != null ? triangleObservers.hashCode() : 0);
        return result;
    }

    @Override
    public void attach(TriangleObserver triangleObserver) {
        triangleObservers.add(triangleObserver);
    }

    @Override
    public void detach(TriangleObserver triangleObserver) {
        triangleObservers.remove(triangleObserver);
    }

    @Override
    public void notifyObservers() {
        TriangleEvent event = new TriangleEvent(this);
        for (TriangleObserver triangleObserver : triangleObservers) {
            triangleObserver.parameterChanged(event);
        }
    }
}
