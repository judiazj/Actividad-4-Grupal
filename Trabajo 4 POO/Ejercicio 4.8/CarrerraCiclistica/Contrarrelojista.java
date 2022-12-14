package CarrerraCiclistica;

public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

    public Contrarrelojista(double velocidadMaxima, int identificador, String nombre) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Contrarrelojista{" + "Velocidad maxima=" + velocidadMaxima + '}');
    }
    
    @Override
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
