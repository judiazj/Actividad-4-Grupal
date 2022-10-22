package CarrerraCiclistica;

public class Velocista extends Ciclista{
    private double potenciaPromedio, velocidadPromedio;
    
    //Constructor de la clase Velocista
    public Velocista(double potenciaPromedio, double velocidadPromedio, int identificador, String nombre) {
        //Constructor de la clase padre
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Velocista{" + "Potencia promedio=" + potenciaPromedio +
                ", velocidad promedio=" + velocidadPromedio + '}');
    }
    
    @Override
    protected String imprimirTipo(){
        return "Es un velocista";
    }  
}
