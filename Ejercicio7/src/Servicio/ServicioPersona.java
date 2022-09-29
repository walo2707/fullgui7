/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidades.Persona;

/**
 *
 * @author Usuario
 */
public class ServicioPersona {

    /*  Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void llenarPersona(){
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
         System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        String sexo="";
        do {
            System.out.println("Ingrese el Sexo (M/F/O)");
            sexo=leer.next().toLowerCase();
            } while (sexo!="M"||sexo!="F"||sexo!="O");
        System.out.println("ingrese el peso de la persona");
        double peso=leer.nextDouble();
         System.out.println("ingrese la altura de la persona");
        double altura=leer.nextDouble(); */

     (peso en
    

    kg/(altura^2 en mt2)).

public int Imc(Persona Vector[], int n) {
        int resultado=0;
        if ((Vector[n].getPeso() / Math.pow(Vector[n].getAltura(), 2)) < 20)
        {
            resultado = -1;
            return resultado;
        }else if (((Vector[n].getPeso()/Math.pow(Vector[n].getAltura(),2)) >= 20) && ((Vector[n].getPeso()/Math.pow(Vector[n].getAltura(),2)) <= 25))
        {
            resultado = 0;
            return resultado;

        }else if ((Vector[n].getPeso()/Math.pow(Vector[n].getAltura(),2)) > 25)
        {
            resultado = 1;
            return resultado;
        }
        return resultado;
    }


