/*
 *d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioOperaciones {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion(Operacion o1) {
        System.out.println("Ingrese el valor del numero 1");
        o1.setNumero1(leer.nextDouble());
        System.out.println("Ingrese el valor del numero 2");
        o1.setNumero2(leer.nextDouble());
        return o1;
    }

    public void sumar(Operacion o1) {
        System.out.println(o1.getNumero1() + o1.getNumero2());

    }

    public void restar(Operacion o1) {
        System.out.println(o1.getNumero1() - o1.getNumero2());

    }

    public void multiplicar(Operacion o1) {
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0) {
            System.out.println("Uno de los valores es 0 por lo cual su resultado es 0");
        } else {

            System.out.println(o1.getNumero1() * o1.getNumero2());

        }
    }

    public void dividir(Operacion o1) {
        if (o1.getNumero1() != 0 && o1.getNumero2() != 0) {
            if (o1.getNumero1() < o1.getNumero2()) {
                System.out.println(o1.getNumero2() / o1.getNumero1());
            } else {
                System.out.println(o1.getNumero1() / o1.getNumero2());
            }
        } else {

            System.out.println("Uno de los valores es 0 por lo cual su resultado es 0");
        }
    }
}
