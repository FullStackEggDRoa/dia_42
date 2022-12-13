/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6.Entidades;

/**
 *
 * @author droa
 */
public class Cafetera {
    
    // Atributos
    
    private int capacidadMáxima=1000;
    private int cantidadActual=0;
    
    //Constructores

    public Cafetera() {
    }

    public Cafetera(int capacidadMáxima, int cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }
    
    //Métodos

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    // Métodos Propios
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMáxima;
        System.out.println("Cantidad Actual: "+this.cantidadActual+" ml");
    }
    
    public void vaciarCafetera(){
        this.cantidadActual=0;
        System.out.println("Cantidad Actual: "+this.cantidadActual+" ml");
    }
    
    public int servirTaza(int tamanio){
        int nivelTaza;
        if(tamanio<=this.cantidadActual){
            nivelTaza=tamanio;
            this.cantidadActual-=tamanio;
        }else{
            nivelTaza=this.cantidadActual;
           
        }
        System.out.println("Cantidad Actual: "+this.cantidadActual+" ml");
        return nivelTaza;
    }
    
    public void agregarCafe(int cantidad){
        if((this.cantidadActual+cantidad)>1000){
            System.out.println("Cafetera Casi llena, intentelo más tarde.");
        }else{
            this.cantidadActual+=cantidad;
        }
        System.out.println("Cantidad Actual: "+this.cantidadActual+" ml");
    }
    
}
