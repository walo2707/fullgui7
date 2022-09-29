/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Cuenta.Cuenta;
import java.util.Scanner;
import servicio.cuentaServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cta1 = new Cuenta();
        Scanner leer = new Scanner(System.in);
       cuentaServicio s1 = new cuentaServicio();
        Cuenta c1 = s1.AltaCuenta();
        int menu;
        
        do {
            System.out.println(" Menu ");
            System.out.println("01 Crear Cuenta");
            System.out.println("02 Ingresar dinero");
            System.out.println("03 Retirar dinero");
            System.out.println("04 Retirar dinero Rapido");
            System.out.println("05 Consultar Saldo");
            System.out.println("06 Consultar Datos");
            System.out.println("07 Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                     break;
                case 2:
                    s1.Ingreso(c1);
                    break;
                case 3:
                    System.out.println(+cta1.Retiro());
                    break;
                case 4:
                    System.out.println(+cta1.Retirorap());
                    break;
                case 5:
                    System.out.println(+cta1.getSaldoActual());
                    break;
                case 6:
                    System.out.println(+cta1.getNuemeroCuenta());
                    System.out.println(+cta1.getDNI());
                    break;

                default:
                    System.out.println("El numero ingresado no está todavia en nuestro programa");
            }
        } while (menu != 7);

    }
}