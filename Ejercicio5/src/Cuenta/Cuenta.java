/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private int nuemeroCuenta;
    private int DNI;
    private int saldoActual;
    private int interes;
    Scanner leer= new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(int nuemeroCuenta, int DNI, int saldoActual, int interes) {
        this.nuemeroCuenta = nuemeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNuemeroCuenta() {
        return nuemeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setNuemeroCuenta(int nuemeroCuenta) {
        this.nuemeroCuenta = nuemeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(){
        
        
    }
    
   
    
            
    public double Retiro(){
         System.out.println("Igrese cuanto es lo que va a retirar de su cuenta?");
        int ret;
        ret = leer.nextInt();
        if (saldoActual<ret){
            saldoActual=0;
        }else{
        saldoActual=-ret;
        }
        return saldoActual;
        
    }
    public double Retirorap(){
         System.out.println("Igrese cuanto es lo que va a retirar de su cuenta?");
        int ret;
        ret = leer.nextInt();
        if ((saldoActual*0.20)<ret){
            System.out.println("Su saldo no es suficiente para este retiro");
        }else{
        saldoActual=-ret;
          }
        return saldoActual;
    }
    
}

