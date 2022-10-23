
package Cuentas;

import java.util.Scanner;


       
    public class CuentaAhorros extends Cuenta {
/* Atributo que identifica si una cuenta está activa; lo está si su saldo
es superior a 10000 */
private boolean activa;

Scanner input = new Scanner(System.in); // ingresamos los datos por teclado



  System.out.println("Ingrese el saldo de la cuenta: ");
        saldo = input.nextLine();
  System.out.println("Ingrese la tasa anual: ");
        tasaAnual = input.nextLine();

public CuentaAhorros(float saldo, float tasa) {
super(saldo, tasa);
if (saldo < 10000) /* Si el saldo es menor a 10000, la cuenta no
se activa */
activa = false;
else
    System.out.println("Ingrese el saldo a retirar de la cuenta: ");
       cantidad = input.nextLine();
activa = true;
}


public void retirar(float cantidad) {
if (activa == true)
   
 
    
// Si la cuenta está activa, se puede retirar dinero
super.retirar(cantidad); /* Invoca al método retirar de la clase
padre */
}

public void consignar(float cantidad) {
if (activa) // Si la cuenta está activa, se puede consignar dinero
    super.consignar(cantidad); /* Invoca al método consignar de
la clase padre */
}
/**
* Método que genera el extracto mensual de una cuenta de ahorros
*/
public void extractoMensual() {
/* Si la cantidad de retiros es superior a cuatro, se genera una
comisión mensual */
if (númeroRetiros > 4) {
comisiónMensual += (númeroRetiros - 4) * 1000;
}
super.extractoMensual(); // Invoca al método de la clase padre
/* Si el saldo actualizado de la cuenta es menor a 10000, la
cuenta no se activa */
if ( saldo < 10000 )
activa = false;
}
/**
* Método que muestra en pantalla los datos de una cuenta de
ahorros
*/
public void imprimir() {
System.out.println("Saldo = $ " + saldo);
System.out.println("Comisión mensual = $ " +comisiónMensual);
System.out.println("Número de transacciones = " +(númeroConsignaciones + númeroRetiros));
System.out.println();
}
}



