package org.example.vehicles;

public class Moto extends Vehiculos {
    private int cilindrada;

    public Moto(int kilometros, String matricula, int cilindrada) {
        super(kilometros, matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void showInfo(){
        System.out.println("Cilindrada: " + cilindrada + " kilometros: " + kilometros + " matricula: " + matricula);
    }
}
