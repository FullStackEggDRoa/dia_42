/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5.Servicio;

import ejercicio_5.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicioCuenta {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        System.out.println("Creación Cuenta");
        System.out.print("Ingrese Número de Cuenta: ");
        int cuenta = leer.nextInt();
        System.out.print("Ingrese Número DNI: ");
        long dni = leer.nextLong();
        System.out.print("Ingrese Saldo Inicial: ");
        float saldoactual = leer.nextFloat();
        int interes=0;
        
        return new Cuenta(cuenta,dni,saldoactual,interes);
    }
    
    public void crearDeposito(Cuenta cuenta){
        System.out.println("Depósito");
        System.out.print("Digite la cantidad a Depositar: ");
        float deposito = (float)leer.nextDouble();
        float auxSaldoActual=cuenta.getSaldoActual();
        auxSaldoActual+=deposito;
        cuenta.setSaldoActual(auxSaldoActual);
        
    }
    
    public void crearRetiro(Cuenta cuenta){
        System.out.println("Retiro");
        System.out.print("Digite la cantidad a Retirar: ");
        float retiro = (float)leer.nextDouble();
        float auxSaldoActual=cuenta.getSaldoActual();
        if(retiro <= auxSaldoActual){
            auxSaldoActual-=retiro;
        }else{
            auxSaldoActual=0;
        }
        cuenta.setSaldoActual(auxSaldoActual);
    }
    public void retiroRapido(Cuenta cuenta){
        System.out.println("Retiro Rápido");
        float auxSaldoActual=cuenta.getSaldoActual();
        System.out.print("Digite la cantidad a Retirar (Predeterminado = "+(auxSaldoActual*0.20f)+" USD): ");
        float retiro = (float)leer.nextDouble();
        
        if(retiro <= (auxSaldoActual*0.20f)){
            auxSaldoActual-=retiro;
        }else{
            System.out.println("Excedes la cantidad Predeterminada.");
        }
        cuenta.setSaldoActual(auxSaldoActual);
    }
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Saldo Actual: "+cuenta.getSaldoActual());
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("Datos del Cliente:");
        System.out.println("Número de Cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI: "+cuenta.getDni());
        System.out.println("Saldo Actual: "+cuenta.getSaldoActual());
        System.out.println("Interés Aprobado: "+cuenta.getInteres());
    }
}
