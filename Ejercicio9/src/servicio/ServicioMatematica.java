/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Matematica;

/**
 *
 * @author Usuario
 */
public class ServicioMatematica {

    public void numeromayor(Matematica operacion) {

        if (operacion.getNum1() > operacion.getNum2()) {
            System.out.println("El " + operacion.getNum1() + " es mayor ");
        } else if (operacion.getNum1() < operacion.getNum2()) {
            System.out.println("El " + operacion.getNum2() + " es mayor ");
        } else {
            System.out.println("los numeros son iguales");
        }

    }
    
    public void potencia(Matematica operacion){
        double numero1= Math. round(operacion.getNum1());
        double numero2= Math. round(operacion.getNum2());
        
        if (numero1 < numero2) {
            
            System.out.println("La potencia es: " + Math.pow(numero2, numero1) );
        }else {
          System.out.println("La potencia es: " + Math.pow(numero1, numero2) );
        }

        
    }
    
     public void raizcuadra(Matematica operacion){
        double numero1= Math.abs(operacion.getNum1());
         double numero2= Math.abs(operacion.getNum2());
        
        if (numero1 < numero2) {
            
            System.out.println("La raiz cuadrada es: " + Math.sqrt(numero1));
        }else {
             System.out.println("La raiz cuadrada es: " + Math.sqrt(numero2) );
        }

        
    }

}
