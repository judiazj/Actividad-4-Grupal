package Inmuebles;

public class Casa extends InmuebleVivienda{
    protected int numeroPisos;
    
    //Constructor de la clase Casa
    public Casa(int identificadorInmobiliario,int area,String direccion,int numeroHabitaciones,
            int numeroBaños, int numeroPisos){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }
    
    //metodo imprimir de la clase Casa
    public void imprimir() {
        super.imprimir(); //llamamos al metodo imprimir de la clase padre
        System.out.println("Casa{" + "numero de pisos= " + numeroPisos + '}');
    }  
}
