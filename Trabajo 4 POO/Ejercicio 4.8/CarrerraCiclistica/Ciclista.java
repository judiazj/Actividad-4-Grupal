package CarrerraCiclistica;

public abstract class Ciclista {
    private int identificador, tiempoAcumulado = 0;
    private String nombre;
    
    //Constructor de la clase Ciclista

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    
    abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    protected int getPosicionGeneral(int posicionGeneral){
        return posicionGeneral;
    }
    
    protected void setPosicionGeneral(int posicionGeneral){
        posicionGeneral = posicionGeneral;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    
    protected void imprimir() {
        System.out.println("Ciclista{" + "Identificador=" + identificador 
                + ", nombre=" + nombre+ ", tiempoAcumulado=" + tiempoAcumulado  + '}'); 
    }
}
