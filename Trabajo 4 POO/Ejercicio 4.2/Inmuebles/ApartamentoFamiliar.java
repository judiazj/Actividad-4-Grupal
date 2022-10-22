package Inmuebles;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
    //Constructor de la clase ApartamentoFamiliar
    public ApartamentoFamiliar(int identificadorInmobiliario,int area,String direccion,int numeroHabitaciones,
            int numeroBaños,int valorAdministracion){
        //Constructor de la clase Padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
    
    //metodo imprimir de la clase ApartamentoFamiliar
    public void imprimir() {
        super.imprimir(); //llamamos al metodo imprimir de la clase padre
        System.out.println("ApartamentoFamiliar{" + "valorAdministracion= " + valorAdministracion + '}');
    }  
}
