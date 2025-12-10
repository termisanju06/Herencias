package org.example.vehicles;

import org.example.animals.Animales;

public class Moto extends Animales {
    private int cilindrada;

    public Moto(int age, int cilindrada) {
        super(age);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
