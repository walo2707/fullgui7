/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import entidad.Matematica;
import servicio.ServicioMatematica;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = Math.random() * 10;
        double num2 = Math.random() * 10;

        Matematica operacion = new Matematica(num1, num2);
        ServicioMatematica s1 = new ServicioMatematica();
        System.out.println(num1);
        System.out.println(num2);
       // s1.numeromayor(operacion);
       //s1.potencia(operacion);
       s1.raizcuadra(operacion);
    }

}
