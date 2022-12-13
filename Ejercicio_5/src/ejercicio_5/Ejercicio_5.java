/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import ejercicio_5.Entidades.Cuenta;
import ejercicio_5.Servicio.servicioCuenta;
import java.io.IOException;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioCuenta sC = new servicioCuenta();
        
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
            System.out.print("Elija una Opción: ");
            option = leer.nextInt();
        
            clearScreen(); 
            switch(option){
                case 1 -> sC.crearDeposito(cuenta_dr);
                case 2 -> sC.crearRetiro(cuenta_dr);
                case 3 -> sC.retiroRapido(cuenta_dr);
                case 4 -> sC.consultarSaldo(cuenta_dr); 
                case 5 -> sC.consultarDatos(cuenta_dr);
                case 6 -> option=0;
                default -> System.out.print("Opción no Existente, Intenta nuevamente.");
            }
            
        }while(option > 0);
        
        
        
    }
    
    public static void clearScreen() {
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
    
        /*
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
        */
        
        /*
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
        }
        */
        
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }

    
}
