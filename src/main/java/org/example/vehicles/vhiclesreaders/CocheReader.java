package org.example.vehicles.vhiclesreaders;

import org.example.vehicles.vehiclesmain.Coche;

import java.util.Scanner;

public class CocheReader {
    private final Scanner scanner;

    public CocheReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Coche read(){
        System.out.println("Cuantos kilómetros ha hecho el coche: ");
        int kilometros = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cual es su matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("Cual es su numero de puertas: ");
        int numeropuertas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Caules son sus caballos: ");
        int caballos = scanner.nextInt();
        scanner.nextLine();

        return new Coche(kilometros, matricula, numeropuertas, caballos);
    }
}
