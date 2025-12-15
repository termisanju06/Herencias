package org.example.empleados;

public class Programador extends Empleado{
    private String lenguajeProgramacion;
    private String proyecto;

    public Programador(String nif, String nombre, String apellido, int horasTrabajadas, String lenguajeProgramacion, String proyecto) {
        super(nif, nombre, apellido, horasTrabajadas);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.proyecto = proyecto;
    }

    public boolean lenguajeProgramacion(String lenguaje){
        if (lenguajeProgramacion.equals(lenguaje)){
            System.out.println("Lo conoce");
            return true;
        }
        else {
            System.out.println("No lo conoce");
            return false;
        }

    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
}
