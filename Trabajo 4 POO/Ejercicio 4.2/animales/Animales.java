

package com.mycompany.animales;


public class Animales {
    public class Prueba {

public static void main(String[] args) {
Animal[] animales = new Animal[4]; /* Define un array de cuatro
elementos de tipo Animal */
    final Animal[] animales = animales;
animales[0] = new Gato();
animales[1] = new Perro();
animales[2] = new Lobo();
animales[3] = new León();
for (int i = 0; i < animales.length; i++) { /* Recorre el array de
animales */
           System.out.println(animales[i].getNombreCientífico());
           System.out.println("Sonido: " + animales[i].getSonido());
           System.out.println("Alimentos: " + animales[i].getAlimentos());
           System.out.println("Hábitat: " + animales[i].getHábitat());
              System.out.println();
             }
         }
}


}