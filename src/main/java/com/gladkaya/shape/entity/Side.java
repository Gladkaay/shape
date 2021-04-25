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

}
