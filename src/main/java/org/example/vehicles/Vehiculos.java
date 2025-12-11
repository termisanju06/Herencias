package org.example.vehicles;

public abstract class Vehiculos {
    protected int kilometros;
    protected String matricula;

    public Vehiculos(int kilometros, String matricula) {
        this.kilometros = kilometros;
        this.matricula = matricula;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void move(){
        System.out.println("Recorridos " + kilometros + " km");
    }
}
