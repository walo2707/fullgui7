/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicoCafetera {

    Cafetera c1 = new Cafetera();
    Scanner leer = new Scanner((System.in));

    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La Cafetera esta llena");

    }

    public void servirTaza(Cafetera c1) {
        System.out.println("Ingrese el tamaño de su taza");
        System.out.println("1- Taza Chica (100ml)");
        System.out.println("2- Taza Mediazna (250ml)");
        System.out.println("1- Taza grande (400ml)");
        switch (leer.nextInt()) {
            case 1:
                System.out.println("Su taza chica");
                if (c1.getCantidadActual() > 100) {
                    c1.setCantidadActual(c1.getCantidadActual() - 100);
                    System.out.println("Su taza se lleno correctamente");
                } else {
                    System.out.println("no hay capacidad suficiente");
                    System.out.println("Se llenara con " + c1.getCantidadActual() + "ml");
                    c1.setCantidadActual(0);
                }
                break;
            case 2:
                System.out.println("Su taza mediana");
                if (c1.getCantidadActual() > 250) {
                    c1.setCantidadActual(c1.getCantidadActual() - 250);
                    System.out.println("Su taza se lleno correctamente");
                } else {
                    System.out.println("no hay capacidad suficiente");
                    System.out.println("Se llenara con " + c1.getCantidadActual() + "ml");
                    c1.setCantidadActual(0);
                    break;
                
        case 3:
                System.out.println("Su taza Grande");
                if (c1.getCantidadActual()>400){
                    c1.setCantidadActual(c1.getCantidadActual() - 400);
                System.out.println("Su taza se lleno correctamente");
                }else{
                    System.out.println("no hay capacidad suficiente");
                    System.out.println("Se llenara con "+ c1.getCantidadActual()+"ml");
                    c1.setCantidadActual(0);
                }
                    break;
                
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }         
                }        
         
    }
    public void VaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
    }
    public void agregarCafe(Cafetera c1){
        System.out.println("Ingrese la cantidad de cafe a agregar");
        int cafe = leer.nextInt();
        if (c1.getCantidadActual()+ cafe > c1.getCapacidadMaxima()){
            System.out.println("No se puede ingresar esa cantidad de cafe");
            System.out.println("Solo se puede agregar "+ (c1.getCapacidadMaxima() - c1.getCantidadActual()));
        }else{
            c1.setCantidadActual(c1.getCantidadActual() + cafe);
            System.out.println(" Se agrego correctamente el cafe, actualmente hay " + c1.getCantidadActual()+ "ml");
        }


}

}
