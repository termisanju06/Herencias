package org.example.empleados;

public class ProductManager extends Empleado{
    private String proyecto;

    public ProductManager(String nif, String nombre, String apellido, int horasTrabajadas, String proyecto) {
        super(nif, nombre, apellido, horasTrabajadas);
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }
}
