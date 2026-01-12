package org.example.animals.readers;

import org.example.animals.animalsmain.Animales;
import org.example.animals.animalsmain.Cat;
import org.example.animals.animalsmain.Dog;
import org.example.animals.animalsmain.Pig;


import java.util.Scanner;

public class AnimalReader {
    private final Scanner sc;
    private final CatReader catReader;
    private final DogReader dogReader;
    private final PigReader pigReader;

    public AnimalReader(Scanner sc, CatReader catReader, DogReader dogReader, PigReader pigReader) {
        this.sc = sc;
        this.catReader = catReader;
        this.dogReader = dogReader;
        this.pigReader = pigReader;
    }

    public Animales read() {
        int a;
        do {
            System.out.println("Que animal vas a querer introducir: ");
            System.out.println("1. Gato");
            System.out.println("2. Perro");
            System.out.println("3. Cerdo");
            System.out.println("4. Ninguno");
            a = sc.nextInt();
            sc.nextLine();
            while (a >= 1 && a <= 3) {
                if (a == 1) {
                    Cat cat = catReader.read();
                    return cat;
                }
                if (a == 2) {
                    Dog dog = dogReader.read();
                    return dog;
                } else if (a == 3) {
                    Pig pig = pigReader.read();
                    return pig;
                } else {
                    System.out.println("Dame un numero valido: ");
                    a = sc.nextInt();
                    sc.nextLine();
                }
            }
        } while (a == 4);
        return null;
    }
}
