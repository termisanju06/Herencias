package org.example.medicos;

public class Cirujano extends Medicos{
    private String hospital;
    private int numeroVox;

    public Cirujano(String nombre, String apellidos, int numeroColegiado, String[] listaPacientes, String hospital, int numeroVox) {
        super(nombre, apellidos, numeroColegiado, listaPacientes);
        this.hospital = hospital;
        this.numeroVox = numeroVox;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNumeroVox() {
        return numeroVox;
    }

    public void setNumeroVox(int numeroVox) {
        this.numeroVox = numeroVox;
    }
}
