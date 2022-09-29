/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    

    public double getRadio() {
        return radio;
    }


    public void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el radio de la circuanferencia");
        radio=leer.nextInt();
          
    }
    
    public void area(){
        System.out.println(+(3.14* Math.pow(radio, 2)));
    }
    
    public void perimetro(){
        System.out.println(+(2*3.14* radio));
    }
}
