/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Cafetera;
import Servicio.ServicoCafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        ServicoCafetera s1 = new ServicoCafetera();
        Scanner leer = new Scanner (System.in);
        int menu;
    
     do {
            System.out.println(" Menu ");
            System.out.println("01 Llenar Cafetera");
            System.out.println("02 Servir Cafe");
            System.out.println("03 Vaciar Cafetera");
            System.out.println("04 Agerar Cafe");
            System.out.println("05 Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    s1.llenarCafetera(c1);
                     break;
                case 2:
                    s1.servirTaza(c1);
                    break;
                case 3:
                    s1.VaciarCafetera(c1);
                    break;
                case 4:
                    s1.agregarCafe(c1);
                    break;
                default:
                    System.out.println("El numero ingresado no está todavia en nuestro programa");
            }
        } while (menu!= 5);
    
    }
    }
        
        // TODO code application logic here
   

