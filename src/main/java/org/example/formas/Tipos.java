package org.example.formas;

public abstract class Tipos {
    protected String color;

    public Tipos(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected double areaCuadrado(double lado, double area){
        area = lado * lado;
        return area;
    }

}
