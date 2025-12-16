package org.example.medicos;

public class Podologo extends Medicos{
    private String hospital;
    private int planta;

    public Podologo(String nombre, String apellidos, int numeroColegiado, String[] listaPacientes, String hospital, int planta) {
        super(nombre, apellidos, numeroColegiado, listaPacientes);
        this.hospital = hospital;
        this.planta = planta;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
}
