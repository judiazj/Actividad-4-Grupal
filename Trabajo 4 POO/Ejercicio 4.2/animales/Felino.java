
package com.mycompany.animales;

public abstract class Felino extends Animal {
}
public class Gato extends Felino {
/**
* Método que devuelve un String con el sonido de un gato
* @return Un valor String con el sonido de un gato: “Maullido”
*/
public String getSonido() {
return "Maullido";
}
/**
* Método que devuelve un String con los alimentos de un gato
* @return Un valor String con la alimentación de un gato: “Ratones”
*/
public String getAlimentos() {
return "Ratones";
}


 public String getHábitat() {
return "Doméstico";
}
/**
* Método que devuelve un String con el nombre científico de un gato
* @return Un valor String con el nombre científico de un gato:
* “Felis silvestris catus”
*/
public String getNombreCientífico() {
       return "Felis silvestris catus";
      }
}

public class León extends Felino {
/**
* Método que devuelve un String con el sonido de un león
* @return Un valor String con el sonido de un león: “Rugido”
*/
public String getSonido() {
return "Rugido";
}
/**
* Método que devuelve un String con los alimentos de un león
* @return Un valor String con la alimentación de un león: “Carnívoro”
*/
public String getAlimentos() {
return "Carnívoro";
}
/**
* Método que devuelve un String con el hábitat de un león
* @rturn Un valor String con el hábitat de un león: “Praderas”
*/
public String getHábitat() {
return "Praderas";
}
/**
* Método que devuelve un String con el nombre científico de un león
* @return Un valor String con el nombre científico de un león:
* “Panthera leo”
*/
    public String getNombreCientífico() {
     return "Panthera leo";
      }
}    
