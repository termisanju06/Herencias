package org.example.animals;

import org.example.animals.animalsmain.Animales;
import org.example.animals.readers.AnimalReader;
import org.example.animals.readers.CatReader;
import org.example.animals.readers.DogReader;
import org.example.animals.readers.PigReader;

import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CatReader catReader = new CatReader(sc);
        DogReader dogReader = new DogReader(sc);
        PigReader pigReader = new PigReader(sc);
        AnimalReader animalReader = new AnimalReader(sc, catReader, dogReader, pigReader);

        Animales animales = animalReader.read();
        animales.showInfo();




    }
}
