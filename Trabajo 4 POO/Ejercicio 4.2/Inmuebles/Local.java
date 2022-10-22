package Inmuebles;

public class Local extends Inmueble{
    enum tipo{INTERNO,CALLE};
    protected tipo tipolocal;
    
    //Constructor de la clase Local
    public Local(int identificadorInmobiliario,int area,String direccion,tipo tipoLocal){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.tipolocal = tipoLocal;
    }

    //metodo imprimir de la clase Local
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
        System.out.println("Local{" + "Tipo de local=" + tipolocal + '}');
    }
}
