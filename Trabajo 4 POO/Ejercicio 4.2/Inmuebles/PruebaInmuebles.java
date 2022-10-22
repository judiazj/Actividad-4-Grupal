package Inmuebles;

public class PruebaInmuebles {
    public static void main(String[] args) {
        //Creamos una instancia de la clase Apartamento Familiar
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120,
                "Avenida Santander 45-45", 3,2, 200000);
        
        //Imprimimos los datos de la instancia por consola
        System.out.println("Datos apartamento");
        System.out.println("El precio de venta del apartamento es: " + 
                apto1.calcularPrecioVenta(apto1.valorArea));
        apto1.imprimir();
        System.out.println();
        
        //Creamos una instancia de la clase Apartaestudio
        Apartaestudio aptestudio1 = new Apartaestudio(12354, 50,
                "Avenida Caracas 30-15", 1, 1);
        
        //Imprimimos los datos de la instancia por consola
        System.out.println("Datos Apartaestudio");
        System.out.println("El precio de venta del apartaestudio es: " +
                aptestudio1.calcularPrecioVenta(aptestudio1.valorArea));
        aptestudio1.imprimir();
        System.out.println();
        
        //Creamos una instancia de la clase Local
        Local localUno = new Local(13579, 70, "Avenida 80 30-55",
                Local.tipo.INTERNO);
        
        ////Imprimimos los datos de la instancia por consola
        System.out.println("Datos Local");
        localUno.imprimir();
    }
}
