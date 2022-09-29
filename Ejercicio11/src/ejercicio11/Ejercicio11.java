/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in); 
        System.out.println("Ingrese el año de su nacmiento");
        int anio=leer.nextInt();
        System.out.println("Ingrese el mes de su nacmiento");
        int mes= leer.nextInt();
        System.out.println("Ingrese el dia de su nacmiento");
        int dia=leer.nextInt();
        Date nacimiento = new Date(anio-1900,mes-1,dia);
        Date fActual= new Date();
        
       
        System.out.println(nacimiento.toLocaleString());
        
        if (fActual.getMonth()>=nacimiento.getMonth()){
            if(fActual.getDate()>=nacimiento.getDate()){
                          
           System.out.println("hay " + (fActual.getYear()- nacimiento.getYear())+ "años desde la fecha que ingreso a hoy");
            }else
             System.out.println("hay " + ((fActual.getYear()- nacimiento.getYear())-1) + "años desde la fecha que ingreso a hoy");
            
        }else
             System.out.println("hay " + ((fActual.getYear()- nacimiento.getYear())-1) + "años desde la fecha que ingreso a hoy");
            
        }
    
}
