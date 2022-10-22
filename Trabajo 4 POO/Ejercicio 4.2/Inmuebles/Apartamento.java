package Inmuebles;

public class Apartamento extends InmuebleVivienda {
    //constructor de la clase Apartamento
    public Apartamento(int identificadorInmobiliario, int area, String direccion,
            int numeroHabitaciones, int numeroBaños) {
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    //metodo imprimir de la clase Apartamento
    public void imprimir() {
        super.imprimir(); //llamamos al metodo imprimir de la clase padre
    }
}
