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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TriangleParameter that = (TriangleParameter) o;

        if (Double.compare(that.perimeter, perimeter) != 0) return false;
        return Double.compare(that.area, area) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(perimeter);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
