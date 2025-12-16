package org.example.medicos;

public class DeFamilia extends Medicos{
    private String centrodeSalud;

    public DeFamilia(String nombre, String apellidos, int numeroColegiado, String[] listaPacientes, String centrodeSalud) {
        super(nombre, apellidos, numeroColegiado, listaPacientes);
        this.centrodeSalud = centrodeSalud;
    }

    public String getCentrodeSalud() {
        return centrodeSalud;
    }

    public void setCentrodeSalud(String centrodeSalud) {
        this.centrodeSalud = centrodeSalud;
    }
}
