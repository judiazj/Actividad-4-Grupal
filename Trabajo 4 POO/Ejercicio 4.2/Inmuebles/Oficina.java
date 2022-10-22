package Inmuebles;

public class Oficina extends Local{
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
    //Constructor de la clase Oficina
    public Oficina(int identificadorInmobiliario,int area,String direccion,tipo tipoLocal,boolean esGobierno){
        //Constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    //metodo imprimir de la clase Oficina
    public void imprimir() {
        super.imprimir(); //metodo imprimir de la clase padre
        System.out.println("Oficina{" + "¿Es oficina gubernamental?=" + esGobierno + '}');
    }
}
