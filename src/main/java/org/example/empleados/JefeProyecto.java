package org.example.empleados;

public class JefeProyecto extends Empleado{
    private String[] proyectos;

    public JefeProyecto(String nif, String nombre, String apellido, int horasTrabajadas, String[] proyectos) {
        super(nif, nombre, apellido, horasTrabajadas);
        this.proyectos = proyectos;
    }

    public boolean lodirige(String proyecto){
        for (int i = 0; i < proyecto.length(); i++) {
            if (proyectos[i].equals(proyecto)){
                return true;
            }
        }
        return false;
    }

    public String[] getProyectos() {
        return proyectos;
    }

    public void setProyectos(String[] proyectos) {
        this.proyectos = proyectos;
    }
}
