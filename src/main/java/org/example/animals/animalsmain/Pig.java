package org.example.animals.animalsmain;

public class Pig extends Animales{

    public Pig(int age, String[] alimentacion) {
        super(age);
        this.alimentacion = alimentacion;
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
