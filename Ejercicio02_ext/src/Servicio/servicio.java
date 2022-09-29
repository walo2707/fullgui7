/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicio {
    
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos p = new Puntos();
        System.out.println("Ingrese coordenadas de x del primer punto");
        p.setX1(leer.nextInt());
        System.out.println("Ingrese coordenadas de y del primer punto");
        p.setY1(leer.nextInt());
        System.out.println("Ingrese coordenadas de x del segundo punto");
        p.setX2(leer.nextInt());
        System.out.println("Ingrese coordenadas de y del segundo punto");
        p.setY2(leer.nextInt());
       return p;
    }
    
    public void calcularPuntos(Puntos p){
        System.out.println(Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2)+Math.pow(p.getY2()-p.getY1(), 2)));
    }
}

