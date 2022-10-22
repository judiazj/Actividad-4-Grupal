package CarrerraCiclistica;

public class PruebaCarreraCiclistica {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        Velocista velocista1 = new Velocista(320,25 ,
                123979, "Geraint Thomas");
        Escalador escalador1 = new Escalador(25, 10,
                123980, "Egan Bernal");
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(120, 123981,
                "Jonathan Castroviejo");
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);
        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
}
