package org.example.vehicles.vhiclesreaders;

import org.example.vehicles.vehiclesmain.Camion;

import java.util.Scanner;

public class CamionReader {
    private final Scanner scanner;

    public CamionReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Camion read(){
        System.out.println("Cuantos kilómetros ha hecho el camión: ");
        int kilometros = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cual es su matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("Cual es su número de ejes: ");
        int numeroejes = scanner.nextInt();
        scanner.nextLine();

        return new Camion(kilometros, matricula, numeroejes);
    }
}
