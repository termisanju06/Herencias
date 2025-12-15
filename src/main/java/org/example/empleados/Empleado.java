package org.example.empleados;

public abstract class Empleado {
    protected String nif;
    protected String nombre;
    protected String apellido;
    protected int horasTrabajadas;

    public Empleado(String nif, String nombre, String apellido, int horasTrabajadas) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void showInfo(){
        System.out.println("NIF: " + nif + " Nombre: " + nombre + " Apellido: " + apellido);
        System.out.println("HOras Trabajadas: " + horasTrabajadas);
    }

    public void horasImputadas(int horas){
        horasTrabajadas += horas;
    }

//    public int horasImputadas(int horas){ //Ambas formas estarían bien
//        horasTrabajadas += horas;
//        return horasTrabajadas;
//    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
