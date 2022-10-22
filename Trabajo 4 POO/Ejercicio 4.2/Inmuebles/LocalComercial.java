package Inmuebles;

public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    //Constructor de la clase LocalComercial
    public LocalComercial(int identificadorInmobiliario,int area,String direccion,tipo tipoLocal,
            String centroComercial){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    //metodo imprimir de la clase LocalComercial
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
        System.out.println("LocalComercial{" + "Centro comercial=" + centroComercial + '}');
    }   
}
