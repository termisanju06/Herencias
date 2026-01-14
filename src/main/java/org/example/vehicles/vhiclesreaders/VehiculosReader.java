package org.example.vehicles.vhiclesreaders;

import org.example.animals.animalsmain.Animales;
import org.example.animals.animalsmain.Cat;
import org.example.animals.animalsmain.Dog;
import org.example.animals.animalsmain.Pig;
import org.example.vehicles.vehiclesmain.Camion;
import org.example.vehicles.vehiclesmain.Coche;
import org.example.vehicles.vehiclesmain.Moto;
import org.example.vehicles.vehiclesmain.Vehiculos;

import java.util.Scanner;

public class VehiculosReader {

    private final Scanner scanner;
    private final CamionReader camionReader;
    private final CocheReader cocheReader;
    private final MotoReader motoReader;

    public VehiculosReader(Scanner scanner, CamionReader camionReader, CocheReader cocheReader, MotoReader motoReader) {
        this.scanner = scanner;
        this.camionReader = camionReader;
        this.cocheReader = cocheReader;
        this.motoReader = motoReader;
    }
    public Vehiculos read() {
        int a;
        do {
            System.out.println("Que vehiculo vas a querer introducir: ");
            System.out.println("1. Camion");
            System.out.println("2. Coche");
            System.out.println("3. Moto");
            System.out.println("4. Ninguno");
            a = scanner.nextInt();
            scanner.nextLine();
            while (a >= 1 && a <= 3) {
                if (a == 1) {
                    Camion camion = camionReader.read();
                    return camion;
                }
                if (a == 2) {
                    Coche coche = cocheReader.read();
                    return coche;
                } else if (a == 3) {
                    Moto moto = motoReader.read();
                    return moto;
                } else {
                    System.out.println("Dame un numero valido: ");
                    a = scanner.nextInt();
                    scanner.nextLine();
                }
            }
        } while (a == 4);
        return null;
    }
}
