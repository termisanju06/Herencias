package org.example;

public class Dog {
    class dog extends Animales{

        public dog(int age) {
            super(age);
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
            System.out.println("Edad: " + age + " raza. " + raza);
        }

    }
}
