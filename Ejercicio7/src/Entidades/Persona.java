/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String Nombre;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String Nombre, int dni, String sexo, double peso, double altura) {
        this.Nombre = Nombre="";
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }
    
        
    
}
