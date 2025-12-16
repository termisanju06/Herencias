package org.example.formas;

public class Cuadrado extends Tipos{
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    protected double areaCuadrado(double lado, double area) {
        return super.areaCuadrado(lado, area);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
