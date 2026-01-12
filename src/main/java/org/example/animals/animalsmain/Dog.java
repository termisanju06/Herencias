package org.example.animals.animalsmain;

public class Dog extends Animales{

    public Dog(int age, String raza) {
        super(age);
        this.raza = raza;
    }

    private String raza;

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public void talk(){
            System.out.println("Javi, Javi");
        }
        public void showInfo(){
            System.out.println("Edad: " + age + " raza: " + raza);
        }


}
