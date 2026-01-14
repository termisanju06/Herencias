package org.example.vehicles.vhiclesreaders;

import org.example.vehicles.vehiclesmain.Moto;

import java.util.Scanner;

public class MotoReader {
    private final Scanner scanner;

    public MotoReader(Scanner scanner) {

        this.scanner = scanner;
    }
    public Moto read(){
        System.out.println("Cuantos kilómetros ha hecho el camión: ");
        int kilometros = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cual es su matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("Cual es su ciloindrada: ");
        int cilindrada = scanner.nextInt();
        scanner.nextLine();

        return new Moto(kilometros, matricula, cilindrada);
    }
}
