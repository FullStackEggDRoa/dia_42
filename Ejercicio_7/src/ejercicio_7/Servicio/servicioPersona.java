/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7.Servicio;

import ejercicio_7.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicioPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        char sexo='A';
        
        System.out.print("Ingrese el Nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese la Edad: ");
        int edad = leer.nextInt();
        do{
            System.out.print("Ingrese el Sexo: ");
            sexo = leer.next().charAt(0);
        }while(sexo != 'H' && sexo != 'M' && sexo != 'O');
        
        System.out.print("Ingrese el Peso (Kg): ");
        float peso=leer.nextFloat();
        System.out.print("Ingrese la Altura (m): ");
        float altura = leer.nextFloat();
        
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public int calcularImc(Persona individuo){
        int respuesta=-2;
        float imc=0;
        
        imc=(float) (individuo.getPeso()/Math.pow(individuo.getAltura(),2));
        
        if(imc<20f){
            respuesta=-1;
        }else if (imc>=20f || imc<=25f){
            respuesta=0;
        }else if (imc>25f){
            respuesta=1;
        }
            
        return respuesta;
    }
    public boolean esMayorDeEdad(Persona individio){
        boolean mayoredad=false;
        if(individio.getEdad()>=18){
            mayoredad=true;
        }else{
            mayoredad=false;
        }
            
        return mayoredad;  
    }
    
}
