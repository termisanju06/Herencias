package org.example.medicos;

public class Podologo extends Medicos{
    private String hospital;
    private int planta;

    public Podologo(String nombre, String apellidos, int numeroColegiado, String[] listaPacientes, String hospital, int planta) {
        super(nombre, apellidos, numeroColegiado, listaPacientes);
        this.hospital = hospital;
        this.planta = planta;
    }

    @Override
    public boolean trabajaHospitalSiNo(String hospital) {
        return super.trabajaHospitalSiNo(hospital);
    }

    public void showInfoPodologo(){
        showInfoMedico();
        System.out.println(" Hospital: " + hospital + " planta: " + planta);
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
