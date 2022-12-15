/*
    EJERCICIO 6
    Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
    cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
    métodos:
     Constructor predeterminado o vacío
     Constructor con la capacidad máxima y la cantidad actual
    Métodos getters y setters.
     Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    máxima.
     Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
     Método vaciarCafetera(): pone la cantidad de café actual en cero.
     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.

 */
package ejercicio_6;

import ejercicio_6.Entidades.Cafetera;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera c1 = new Cafetera();
         
        int option=-1;
        do{
            
            System.out.println("<<---MENU--->>");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Café");
            System.out.println("5. Salir");
            System.out.print("Elija una Opción: ");
            option = leer.nextInt();
        
            //clearScreen(); 
            switch(option){
                case 1:
                    c1.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Ingrese el Tamaño de la Taza (ml): ");
                    int tamanioTaza=leer.nextInt();
                    if(c1.servirTaza(tamanioTaza)==tamanioTaza){
                        System.out.println("Taza Completa !!");
                    }else{
                        System.out.println("Taza Incompleta. "+c1.getCantidadActual()+"ml de "+tamanioTaza+"ml.");
                    }
                    break;
                case 3:
                    c1.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese la Cantidad de Café vertir en la Cafetera (ml): ");
                    c1.agregarCafe(leer.nextInt());
                    break;
                       
                case 5:
                    option=0;
                    break;
                default:
                    System.out.print("Opción no Existente, Intenta nuevamente.");
            }
            
        }while(option > 0);
        
        
    }
    
    public static void clearScreen(){
    
        
        try{
            //System.out.println("Presione enter para continuar...");
            //new java.util.Scanner(System.in).nextLine();

            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_WINDOWS);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_WINDOWS);
            limpiar.keyRelease(KeyEvent.VK_L);
            
        }  catch (AWTException e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
  
}
