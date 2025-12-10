package org.example;

public class Pig {
    class pig extends Animales{
        public pig(int age) {
            super(age);
        }
        private String[] alimentacion;

        public String[] getAlimentacion() {
            return alimentacion;
        }

        public void setAlimentacion(String[] alimentacion) {
            this.alimentacion = alimentacion;
        }
        public void talk(){
            System.out.println("Gema gemita");
        }
        public void showInfo(){
            System.out.println("Edad. " + age);
            for (int i = 0; i < alimentacion.length; i++) {
                System.out.println(alimentacion[i]);
            }
        }
    }
}
