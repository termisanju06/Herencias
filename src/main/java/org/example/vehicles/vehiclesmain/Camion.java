package org.example.vehicles.vehiclesmain;

public class Camion extends Vehiculos{
    private int numeroejes;

    public Camion(int kilometros, String matricula, int numeroejes) {
        super(kilometros, matricula);
        this.numeroejes = numeroejes;
    }

    public int getNumeroejes() {
        return numeroejes;
    }

    public void setNumeroejes(int numeroejes) {
        this.numeroejes = numeroejes;
    }
    public void showInfo(){
        System.out.println("Numero de ejes: " + numeroejes);
        move();
    }
}
