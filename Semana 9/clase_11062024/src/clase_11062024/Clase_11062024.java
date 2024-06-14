/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11062024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_11062024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int n = 200000;
//        int facto = factorial(n);
//        System.out.println("El resultado del factorial de "+n+" es "+facto);
        
        /*
        Vamos a tener un lista de libros ( arrayList) , se le preguntara al usuario sobre el nombre de un libro que desee buscar. 
        debe crear un metodo recursivo que regrese un booleano, verdadero en caso de que encontremos el libro, falso en caso de que no se encuentre,
        */
        
        ArrayList<Libro> libros = new ArrayList<Libro>();
        
        libros.add(new Libro("Quijote",1));
        libros.add(new Libro("Como programar en java",2));
        libros.add(new Libro("Quijote 2",3));
//        boolean encontro = buscar_NoRecursivo(libros,"Quijote");
//        if (encontro) {
//            System.out.println("Se encontro el libro");
//        }else{
//            System.out.println("No se encontro el libro");
//        }
        
        
        boolean encontro_recursivo = buscar_recursivo(libros,"hola",0);
            if (encontro_recursivo) {
            System.out.println("Se encontro el libro");
        }else{
            System.out.println("No se encontro el libro");
        }
        
        
        
    }
    
    public static int factorial(int numero){
        if(numero<=1){
            return 1 ;
        }else{
            int res= numero*factorial(numero-1);
            return res;
        }
    }
    
    /*
    Metodos recursivo que buscara libros por nombre 
    */
    public static boolean buscar_NoRecursivo(ArrayList<Libro> lista, String nombre){
        boolean bandera = false;
        for (int i = 0; i <lista.size(); i++) {
            if  (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                bandera = true;
                break;
            }   
        }
        
        // recorrer el arreglo 
        //comporbar los nombre de los libros que vayamos recorriendo.
        // si ya encontramos el libro, ya no necesitamos seguir recorriendo el arreglo. 
        // si recorremos todo el arreglo y no encontramos nada, pues el libro no esta. 
        return bandera;
    }
    
    public static  boolean buscar_recursivo(ArrayList<Libro> lista, String nombre, int i){
        /*
        1) caso recursivo: es el que genera el ciclo o  la recursion , se caracteriza por que es donde hacemos el llamado al metodo 
        2) Caso base: Es la condicion que nos permite terminar el ciclo, generalmente se hace un retorno sin necesidad de calculo
        NOTA; se puede tener mas de un caso base o mas de un caso recursivo si es necesario.
        */
        
        if(lista.size()== i){ // caso base 2
            return false;
        }else if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {// caso base 1
            return true;
        }else{ // caso recursivo 
            //actualizamos y aumentamos la variable en 1
            i = i+1;
            // por cada vez que hacemos el llamado a la funcion, es como si volvieramos a ejecutar la funcion, 
            boolean encontro = buscar_recursivo(lista,nombre, i);
            return encontro;
//            return buscar_recursivo(lista,nombre);
        }
    }
    
    
}
