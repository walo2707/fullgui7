/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Servicio {
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void crearPersona(Persona  p1){
        int anio, mes, dia;
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el año de nacimiento");
        anio=leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes=leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        dia=leer.nextInt();
        Date fecha= new Date(anio-1900,mes-1,dia);
        p1.setFechaNacimiento(fecha);
        
              
    }
    
    public void calcularEdad(Persona p1){
        Date fActual = new Date(); 
        
         if (fActual.getMonth()>=p1.getFechaNacimiento().getMonth()){
            if(fActual.getDate()>=p1.getFechaNacimiento().getDate()){
                          
            p1.setEdad((fActual.getYear()- p1.getFechaNacimiento().getYear()));
            }else
             p1.setEdad((fActual.getYear()- p1.getFechaNacimiento().getYear())-1);
            
        }else {
              p1.setEdad(((fActual.getYear()- p1.getFechaNacimiento().getYear())-1));
            
        }
        
        
    }
 public boolean menorQue(Persona p1)  {
     boolean resultado= false;
     System.out.println("Igrese la edad de la persona a comparar");
     int edad = leer.nextInt();
     
     if (p1.getEdad()<edad){
         resultado=true;
     }else {
         resultado=false;
     }
         return resultado;
   
 } 
public void mostrarPersona(Persona p1){
    System.out.println(p1.toString());
}
}
    
    

