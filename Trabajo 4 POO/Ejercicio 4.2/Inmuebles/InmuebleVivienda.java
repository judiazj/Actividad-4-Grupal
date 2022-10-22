package Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numeroHabitaciones, numeroBaños;
    
    //Constructor de la clase InmuebleVivienda
    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion,
            int numeroHabitaciones, int numeroBaños){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    //metodo imprimir de la clase InmuebleVivienda
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
        System.out.println( "InmuebleVivienda{" + "numeroHabitaciones=" + numeroHabitaciones +
                ", numero de baños=" + numeroBaños + '}');
    } 
}
