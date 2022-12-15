/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import ejercicio_7.Entidades.Persona;
import ejercicio_7.Servicio.servicioPersona;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
        servicioPersona sP=new servicioPersona();
        
        int[] registrosImc= new int [4];
        boolean [] registrosMayorEdad= new boolean[4];
        Persona [] grupoPersonas= new Persona [4];
        
        System.out.println("Ingrese la Información de cada Persona: ");
        for (int i=0;i<4;i++){
            System.out.println("Persona No.:"+(i+1));
            grupoPersonas[i]=sP.crearPersona();
            
            registrosImc[i]=sP.calcularImc(grupoPersonas[i]);
                
            registrosMayorEdad[i]=sP.esMayorDeEdad(grupoPersonas[i]);
            
        }
        
        System.out.println("Datos Estadísticos: ");
        int contador_pesoideal=0;
        int contador_sobrepeso=0;
        int contador_bajopeso=0;
        int contador_18plus=0;
        
        for(int i=0;i<4;i++){
            if(registrosImc[i]==0){
                contador_pesoideal++;
            }else if(registrosImc[i]==-1){
                contador_bajopeso++;
            }else if(registrosImc[i]==1){
                contador_sobrepeso++;
            }
            if(registrosMayorEdad[i]){
                contador_18plus++;
            }
        
        }
        System.out.println("Personas con Bajo Peso: "+(float) ((contador_bajopeso*100)/4)+"%");
        System.out.println("Personas con Peso Ideal: "+(float) ((contador_pesoideal*100)/4)+"%");
        System.out.println("Personas con Sobre Peso: "+(float) ((contador_sobrepeso*100)/4)+"%");
        System.out.println("Personas Mayores de Edad: "+(float) ((contador_18plus*100)/4)+"%");
        System.out.println("Personas Menoress de Edad: "+(float) (100-(contador_18plus*100)/4)+"%");
    }
    
}
