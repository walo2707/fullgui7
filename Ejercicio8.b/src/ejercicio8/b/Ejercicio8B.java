/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.b;

import Entidad.NewClass;
import Servicio.serviciofrase;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NewClass Cadena = new NewClass();
        System.out.println("Ingrese la frase");
        Cadena.setFrase(leer.next());
        serviciofrase s1= new serviciofrase();
       // s1.contarvocales(Cadena);
      // s1.invertirfrase(Cadena);
       // System.out.println("Ingrese la letra que quiere buscar");
       // String letra= leer.next();
       // s1.contarletras(Cadena, letra);
     //   System.out.println("Ingrese la frase nueva para comparar");
     //  String frase = leer.next();
        //s1.compararlongitud(Cadena, frase);
       // s1.unirfrase(Cadena, frase);
       // System.out.println("Ingrese la letra por la que desea remplazar");
       // String Letra=leer.next();
       // s1.remplazarletra(Cadena, Letra);
       
        System.out.println("Ingrese la letra que desea buscar");
        String Letra1=leer.next();
        
        if (s1.contieneletra(Cadena, Letra1)) {
           System.out.println("La frase contiene la letra buscada");
            } else {
            System.out.println("La frase NO CONTIENE la letra buscada");
            }

            
        }
        


    }
    
}
