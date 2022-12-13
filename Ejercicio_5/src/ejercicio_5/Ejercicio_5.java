/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import ejercicio_5.Entidades.Cuenta;
import ejercicio_5.Servicio.servicioCuenta;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        servicioCuenta sC = new servicioCuenta();
        System.out.println("Creación de Cuenta: ");
        Cuenta cuenta_dr= sC.crearCuenta();
        int option=-1;
        do{
            
            System.out.println("MENU");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Retiro Rápido");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            System.out.println("Elija una Opción: ");
            option = leer.nextInt();
        
            switch(option){
                case 1 -> sC.crearDeposito(cuenta_dr);
                case 2 -> sC.crearRetiro(cuenta_dr);
                case 3 -> sC.retiroRapido(cuenta_dr);
                case 4 -> sC.consultarSaldo(cuenta_dr); 
                case 5 -> sC.consultarDatos(cuenta_dr);          
            }
            
        }while(option > 0);
        
        
        
    }
    
}
