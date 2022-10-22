package CarrerraCiclistica;

public class Escalador extends Ciclista{
    private double aceleracionPromedio, gradoRampa;

    //constructor clase Escalador
    public Escalador(double aceleracionPromedio, double gradoRampa, int identificador, String nombre) {
        //constructor clase padre
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Escalador{" + "Aceleracion promedio=" + aceleracionPromedio +
                ", grado de la rampa=" + gradoRampa + '}');
    }
    
    protected String imprimirTipo(){
        return "Es un escalador";
    }
}
