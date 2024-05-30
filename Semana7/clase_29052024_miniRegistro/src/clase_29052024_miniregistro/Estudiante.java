/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_29052024_miniregistro;

/**
 *
 * @author claudiacortes
 */
public class Estudiante {
    
    /*Atributos*/
    private String nombre;
    private int edad; 
    private String carrera;
    private String [] clases;
    private double promedio;
    private int numeroCuenta;
    
    /*Metodos*/
    public Estudiante(String nombre, int edad, String carrera, int numeroCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.promedio = 0.0;
        this.clases = new String [4];
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String[] getClases() {
        return clases;
    }

    public void setClases(String[] clases) {
        this.clases = clases;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
/* Ocultando el setter del numero de cuenta, por que no nos interesa que este se pueda actualizar*/
//    public void setNumeroCuenta(int numeroCuenta) {
//        this.numeroCuenta = numeroCuenta;
//    }

    @Override
    public String toString() {
        return numeroCuenta+" - "+ nombre + " (" + carrera + " ) -" + promedio +" %";
    }
    
    
    
    
}
