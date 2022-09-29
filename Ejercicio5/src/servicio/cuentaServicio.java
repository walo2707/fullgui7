/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class cuentaServicio {
    
    public Cuenta AltaCuenta(){
       Scanner leer = new Scanner(System.in);
       int cont=0;
       Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el DNI del titular");
        c1.setDNI(leer.nextInt());
        System.out.println("Ingres el monto de su deposito de Ingreso");
        c1.setSaldoActual(leer.nextInt());
        cont++;
        c1.setNuemeroCuenta(cont);
        System.out.println("Su nro de cuenta es:" + c1.getNuemeroCuenta() );
        
        return c1;
        
    }
    
     public void Ingreso(Cuenta c1){
        System.out.println("Igrese cuanto es lo que va a ingresar a su cuenta?");
         Scanner leer = new Scanner(System.in);
        int ing;
                ing = leer.nextInt();
                

  /*      int suma=0;
        suma= c1.getSaldoActual()+suma;
        c1.setSaldoActual(suma); */
        c1.setSaldoActual(c1.getSaldoActual()+ing);
        
     }
          public void Retiro(Cuenta c1){
               Scanner leer = new Scanner(System.in);
         System.out.println("Igrese cuanto es lo que va a retirar de su cuenta?");
        int ret;
        ret = leer.nextInt();
        if (c1.getSaldoActual()<ret){
            c1.setSaldoActual(0);
        }else{
        c1.setSaldoActual(c1.getSaldoActual()-ret);
        }
       
}
}