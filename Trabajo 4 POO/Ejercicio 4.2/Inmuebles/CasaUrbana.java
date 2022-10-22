package Inmuebles;

public class CasaUrbana extends Casa{
    
    //Constructor de la clase CasaUrbana
    public CasaUrbana(int identificadorInmobiliario,int area,String direccion,int numeroHabitaciones,
            int numeroBaños,int numeroPisos){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos); 
    }

    //metodo imprimir de la clase CasaUrbana
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
    }  
}
