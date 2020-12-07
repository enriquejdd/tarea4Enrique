/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.tarea4enrique;

/**
 *
 * @author adriv
 */
public class ej18 {
    public static void main(String[] args) {
        ClaseInventada fecha = new ClaseInventada(15, 8, 1999);
        
        ClaseInventada mundial = new ClaseInventada (27, 7, 2010);
        
        ClaseInventada fechaHoy = new ClaseInventada (7, 12, 2020);
        
        System.out.println("Fecha: " + fecha);
        System.out.println("Mundial : " + mundial);
        System.out.println("Fecha Hoy : " + fechaHoy);
    }
    
}
