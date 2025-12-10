package org.example;

public class Cat {
    class cat extends Animales{
        public cat(int age) {
            super(age);
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
}
