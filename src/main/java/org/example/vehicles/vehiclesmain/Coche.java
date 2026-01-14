package org.example.vehicles.vehiclesmain;

public class Coche extends Vehiculos {
    private int numeropuertas;
    private int caballos;

    public Coche(int kilometros, String matricula, int numeropuertas, int caballos) {
        super(kilometros, matricula);
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
    public void showInfo(){
        System.out.print("Numero de puertas: " + numeropuertas + " caballos: " + caballos);
        move();
    }
}
