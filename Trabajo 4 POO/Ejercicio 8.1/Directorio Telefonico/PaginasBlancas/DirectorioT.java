/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaginasBlancas;

import java.util.Vector;

/**
 *
 * @author User
 */
public class DirectorioT {
    Vector DT;
    
    public DirectorioT(){
        DT = new Vector();
    }
    
    public void AgregarPersona(Persona P){
        DT.add(P);
    }
    
    public void EliminarPersona(int i){
        DT.removeElementAt(i);
    }
    
    public void BorrarDirectorio(){
    DT.removeAllElements();
    }
}
