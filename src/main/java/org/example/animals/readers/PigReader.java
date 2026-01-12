package org.example.animals.readers;

import org.example.animals.animalsmain.Pig;

import java.util.Scanner;

public class PigReader {
    private final Scanner sc;



    public PigReader(Scanner sc) {
        this.sc = sc;
    }

    public Pig read(){
        System.out.println("Dame la edad del cerdo: ");
        int age = sc.nextInt();

        System.out.println("Cuantos alimentos ingiere el cerdo: ");
        int a = sc.nextInt();
        sc.nextLine();

        String[] alimentacion = new String[a];
        for (int i = 0; i < alimentacion.length; i++) {
            alimentacion [i] = sc.nextLine();
        }

        return new Pig(age, alimentacion);
    }
}
