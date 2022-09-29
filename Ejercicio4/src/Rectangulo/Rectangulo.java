/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
  public void Crear(Rectangulo r1){
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese la base");
      r1.setBase(leer.nextInt());
      System.out.println("Ingrese la altura");
      r1.setAltura(leer.nextInt());
          
  } 
  public void calcularB(Rectangulo r1){
      System.out.println("La superficie del rectuangulo es:");
      System.out.println(r1.getBase()*r1.getAltura());
      
  }
  
   public void Perimetro(Rectangulo r1){
      System.out.println("El Perimetro del rectuangulo es:");
      System.out.println((r1.getBase()+r1.getAltura())*2);
      
  }
   
   public void Dibujar(Rectangulo r1){
       for (int i = 0; i < r1.getAltura(); i++) {
           for (int j = 0; j < r1.getBase(); j++) {
               if (i==0 || i==r1.getAltura()-1|| j==0 || j==r1.getBase()-1){
               System.out.print(" *");
               }else{
                   System.out.print("  ");
               }
              
           }
           System.out.println("");
       }
       
   }
   
}



