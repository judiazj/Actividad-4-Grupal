package Inmuebles;

public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3000000;
    
    //Constructor de la clase CasaIndependiente
    public CasaIndependiente(int identificadorInmobiliario,int area,String direccion,
            int numeroHabitaciones,int numeroBaños,int numeroPisos){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    
    //metodo imprimir de la clase CasaIndependiente
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
    } 
}
