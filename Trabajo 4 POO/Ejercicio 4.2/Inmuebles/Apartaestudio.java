package Inmuebles;

public class Apartaestudio extends Apartamento{
    protected static double valorArea = 1500000;
    
    // Constructor de la clase Apartaestudio
    public Apartaestudio(int identificadorInmobiliario,int area,String direccion,
            int numeroHabitaciones,int numeroBaños){
        //llamamos al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, 1, 1); 
    }
    
    //metodo imprimir de la clase Apartaestudio
    public void imprimir() {
        super.imprimir(); // llamamos al metodo imprimir de la clase padre
    }
}
