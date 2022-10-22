package Inmuebles;

public class Inmueble {
    protected int identificadorInmobiliario, area;
    protected String direccion;
    protected double precioVenta;
    
    //Constructor de la clase Inmueble
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    //metodo calcularPrecioVenta de la clase Inmueble
    double calcularPrecioVenta(double valorArea){
        precioVenta  = area * valorArea;
        return precioVenta;
    }

    //metodo imprimir de la clase Inmueble
    public void imprimir() {
        System.out.println( "Inmueble{" + "Identificador inmobiliario= " + 
                identificadorInmobiliario + ", area= " + area + 
                ", direccion=" + direccion + ", precio de venta= $" + precioVenta + '}');
    }   
}
