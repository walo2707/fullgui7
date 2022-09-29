/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NewClass;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class serviciofrase {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void contarvocales(NewClass Cadena){
        String frase1=Cadena.getFrase().toLowerCase();
        int contador=0;
        
        for (int i = 0; i < Cadena.getLongitud(); i++) {
            if ((frase1.charAt(i)=='a')||(frase1.charAt(i)=='e')||(frase1.charAt(i)=='i')||(frase1.charAt(i)=='o')||(frase1.charAt(i)=='u')){
               contador++; 
                
            }
        }
            System.out.println("La cantidad de vocales tiene su frase es: "+contador);
            
      
       }
     public void invertirfrase(NewClass Cadena){
          
         for (int i = Cadena.getLongitud()-1; i >= 0; i--) {
             
             System.out.print(Cadena.getFrase().charAt(i));
             
         }
         System.out.println("");
    
    }
    
     public void contarletras(NewClass Cadena, String letra){
        String frase1=Cadena.getFrase().toLowerCase();
                
        int contador=0;
        
        for (int i = 0; i < Cadena.getLongitud(); i++) {
            if ((frase1.charAt(i)== letra.charAt(0))){
               contador++; 
                
            }
        }
            System.out.println("La letra seleccionada se repite: "+contador+ " veces");
}
     public void compararlongitud(NewClass Cadena, String frase){
         
         if (Cadena.getLongitud()==frase.length()) {
             System.out.println("Las Cadenas tiene la misma longuitud");
         }else if(Cadena.getLongitud()< frase.length()){
             System.out.println("La frase nueva es mas larga que la anterior");
         }else { 
             System.out.println("La frase nueva es mas chica que la anterior");
     
             }
     }
         public void unirfrase(NewClass Cadena, String frase1){
               
             System.out.println(Cadena.getFrase() + " " + frase1);   
         }
         
         public void remplazarletra (NewClass Cadena, String frase1){
             
             System.out.println(Cadena.getFrase().replace("a", frase1));                 
             }
             
          public boolean contieneletra(NewClass Cadena, String frase1) {
              
              return Cadena.getFrase().contains(frase1);

          }  
         }

