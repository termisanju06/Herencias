package org.example.medicos;

import javax.sound.midi.Soundbank;

public abstract class Medicos {
    protected String nombre;
    protected String apellidos;
    protected int numeroColegiado;
    protected String[] listaPacientes;

    public Medicos(String nombre, String apellidos, int numeroColegiado, String[] listaPacientes) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.listaPacientes = listaPacientes;
    }

    public void showInfoMedico(){
        System.out.print("Nombre: " + nombre + " Apellidos: " + apellidos);
        System.out.println(" Nº Colegiado: " + numeroColegiado);
        System.out.print("Lista de pacientes: ");
        for (int i = 0; i < listaPacientes.length; i++) {
            System.out.println(listaPacientes[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String[] getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(String[] listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
}
