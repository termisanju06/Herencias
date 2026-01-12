package org.example.animals.readers;

import org.example.animals.animalsmain.Dog;

import java.util.Scanner;

public class DogReader {
    private final Scanner sc;

    public DogReader(Scanner sc) {
        this.sc = sc;
    }
    public Dog read(){
        System.out.println("Dame la edad del perro: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Dame la raza del perro: ");
        String raza = sc.nextLine();

        return new Dog(age, raza);
    }
}
