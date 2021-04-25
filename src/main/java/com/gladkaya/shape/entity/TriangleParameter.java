package com.gladkaya.shape.entity;

public class TriangleParameter {
    private double perimeter;
    public double area;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TriangleParameter{");
        sb.append("perimeter=").append(perimeter);
        sb.append(", area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
