/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_04062024;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_04062024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1) permitir al usuario agrega libros 
        2) permitir eliminar libros
        3) modificar libros 
        4) buscar libros 
        5)listar todos los libros. 
        */
        
        
        boolean bandera = true;
        ArrayList biblioteca = new ArrayList <Libro>();
        while (bandera) {
            System.out.println("1) Agregar al usuario agrega libros \n" +
                    "2) permitir eliminar libros\n" +
                    "3) modificar libros \n" +
                    "4) buscar libros \n" +
                    "5)listar todos los libros. ");
          Scanner entrada = new Scanner(System.in);
           int op = entrada.nextInt();
            switch (op) {
                case 1://agregar
                    System.out.println("AGREGAR LIBROS ");
                    biblioteca = agregarlibro(biblioteca);
                    break;
                case 4: 
                    buscarLibro(biblioteca);
                    break;
                case 5: //listar 
                    imprimir(biblioteca);
                    break;
                default:
                    System.out.println("Saliendo....");
                    bandera = false;
            }
            
        }
    }// fin del main 
    public static void buscarLibro(ArrayList<Libro> lista){
        Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese el nombre del libro: ");
         String nombre = entrada.nextLine();
         //ERROR DE LOGICA 
         //1) netbeans no nos va a avisar
         boolean encontro = false;
         for (int i = 0; i <lista.size(); i++) {
             String titulo = lista.get(i).getTitulo();
            if(titulo.equalsIgnoreCase(nombre)){
                encontro= true;
                break;
            }
        }
         if (encontro) {
             System.out.println("Se encontro el libro");
        }else{
             System.out.println("No se encontro el libro :( ");
         }
    }
    public static  ArrayList<Libro> agregarlibro(ArrayList<Libro> lista){
         Libro nuevo = crearLibro();
         lista.add(nuevo);
         return lista; 
    }
    
    public static Libro crearLibro(){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese el nombre del libro: ");
         String nombre = entrada.nextLine();
         System.out.println("Ingrese el autor del libro ");
         String autor = entrada.nextLine();
         Random ran = new Random();
         int id = ran.nextInt(10, 150);
//         int primera_parte = new Date().getYear();
//          int segunda_parte  = ran.nextInt(10, 150);
//         String idGeneico = primera_parte+""+ segunda_parte +"";
//         System.out.println("id NUEVO: "+idGeneico);
         Libro nuevoLibro = new Libro(nombre,id,autor);
//         System.out.println("EL NUMERO DE IDENTIFICACION DE ESTE OBJETO ES: "+nuevoLibro.hashCode());
         return nuevoLibro;
    }
    public static void imprimir(ArrayList<Libro> lista){
        for (int i = 0; i < lista.size(); i++) {        
            //                         lista[i]
            System.out.println(i+") "+lista.get(i));
        }
    }
}// fin de la clase 
