package org.example.vehicles;

import org.example.animals.Animales;

public class Coche extends Animales {
    private int numeropuertas;
    private int caballos;

    public Coche(int age, int numeropuertas, int caballos) {
        super(age);
        this.numeropuertas = numeropuertas;
        this.caballos = caballos;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
