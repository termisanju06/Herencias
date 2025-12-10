package org.example;

public class Cat extends Animales{
    public Cat(int age, String color) {
        super(age);
        this.color = color;
    }

    private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void talk(){
            System.out.println("Mateo Mateo..");
        }
        public void showInfo(){
            System.out.println("Edad: " + age + " color: " + color);
        }

}
