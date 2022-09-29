/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cuantas personas quiere agregar");
        int n = leer.nextInt();
        String Nombre;
     int dni;
     String sexo;
     double peso;
     double altura;
        Persona Vector[] = new Persona [n];
        for (int i = 0; i < n; i++) {
               System.out.println("Intruduzca el nombre de la persona nro: "+(i+1));
              Nombre=leer.next();
              System.out.println("Introduzca el DNI");
              dni=leer.nextInt();
              System.out.println("Introduzca el Peso");
              peso=leer.nextDouble();
              System.out.println("Introduzca la altura");
              altura=leer.nextDouble();
              do {
            System.out.println("Ingrese el Sexo (M/F/O)");
            sexo=leer.next().toLowerCase();
            } while (sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("F")||sexo.equalsIgnoreCase("O"));
            
              Vector[i]= new Persona(Nombre, dni, sexo, peso, altura);
        }
        
        
        
    }
    
}
