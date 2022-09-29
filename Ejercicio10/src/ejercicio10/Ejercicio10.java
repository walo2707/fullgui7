/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double arregloA[] = new double [50]; 
       double arregloB[] = new double [20];
       
        for (int i = 0; i < 50; i++) {
            arregloA[i]= (double) Math.random();
            System.out.print("["+arregloA[i]+"]");
        }
        System.out.println(" ");
        
        Arrays.sort(arregloA);
        // Arrays.fill(arregloB, 10, 20, 0.5); sirve para reemplazar valores en una posicion determinada del vector
        for (int i = 0; i < 20; i++) {
            if (i<10) {
               arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.5;
            }
            System.out.print("["+arregloB[i]+"]");
        }
        
         
    }
    
