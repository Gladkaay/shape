package com.gladkaya.shape.entity;



public class Side {
    private double side;


    public Side(double side) {
        this.side = side;
    }

    public Side() {

    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SideEntity{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Side side1 = (Side) o;

        return Double.compare(side1.side, side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }
}
