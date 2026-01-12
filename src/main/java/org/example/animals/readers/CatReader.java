package org.example.animals.readers;


import org.example.animals.animalsmain.Cat;

import java.util.Scanner;

public class CatReader {
    private final Scanner sc;

    public CatReader(Scanner sc) {
        this.sc = sc;
    }

    public Cat read(){
        System.out.print("Dame la edad del gato: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Dame el color de animales: ");
        String color = sc.nextLine();

        return new Cat(age, color);
    }

}
