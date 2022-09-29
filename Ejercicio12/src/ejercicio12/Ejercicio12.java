/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Servicio.Servicio;
import entidad.Persona;

/**
 *
 * @author Usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Servicio s1 = new Servicio();
        
        s1.crearPersona(p1);
        s1.calcularEdad(p1);
        if (s1.menorQue(p1)){
            System.out.println("la persona nueva es mayor");
            
        }else{
            System.out.println("la nueva persona es menor");
        }
        
        s1.mostrarPersona(p1);
        // TODO code application logic here
    }
    
}
