/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02_ext;

import Entidad.Puntos;
import Servicio.servicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio02_ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicio s1 = new servicio();
        Puntos p1 = s1.crearPuntos();
        s1.calcularPuntos(p1);
        
    }
    
}
