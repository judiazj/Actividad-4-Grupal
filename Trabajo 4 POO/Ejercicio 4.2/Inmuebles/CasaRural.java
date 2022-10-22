package Inmuebles;

public class CasaRural extends Casa{
    protected static double valorArea = 1500000;
    protected int distanciaCabecera, altitud;
    
    //Constructor de la clase CasaRural
    public CasaRural(int identificadorInmobiliario,int area,String direccion,int numeroHabitaciones,
            int numeroBaños, int numeroPisos, int distanciaCabecera, int altitud){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }
    
    //metodo imprimir de la clase CasaRural
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
        System.out.println( "CasaRural{" + "distancia a la cabecera municipal= " +
                distanciaCabecera + ", altitud= " + altitud + '}');
    }   
}
