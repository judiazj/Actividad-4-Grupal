package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina, tieneCamposDeportivos;
    
    //Constructor de la clase CasaConjuntoCerrado
    public CasaConjuntoCerrado(int identificadorInmobiliario,int area,String direccion,
            int numeroHabitaciones,int numeroBaños, int numeroPisos, int valorAdministracion,
            boolean tienePiscina, boolean tieneCamposDeportivos){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    
    //metodo imprimir de la clase CasaConjuntoCerrado
    public void imprimir() {
        System.out.println( "CasaConjuntoCerrado{" + "valor de la administracion= " + valorAdministracion + 
                ", ¿Tiene Piscina?= " + tienePiscina + ", ¿tiene campos deportivos?= "
                + tieneCamposDeportivos + '}');
    }   
}
