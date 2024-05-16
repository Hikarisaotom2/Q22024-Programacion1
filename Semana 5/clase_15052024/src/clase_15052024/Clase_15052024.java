/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_15052024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_15052024 {
    /*Variables globales:
    Una variable que se puede utiliar en cualquier parte del programa.
    NOTA: Las variables globales no son una buena practica. 
    */
    static int contador = 0;
    public static void main(String[] args) {
         /*
        CRUD 
        C -> create
        R -> read 
        U -> update 
        D -> delete
        */
        
        /*
         1) La universidad ..... desea imp,ementar un sistema de matricula para sus clases. 
        la clase de programacion, tendra un espacio de x estudiantes, 
        el valor de x sera porporiconado por el jefe academico al inicoo del periodo (cuando el programa inicia).
        2) el programa debe permitirle a los estudiantes, inscribirse en la clase.  (update)
        3) los estudiantes pueden retirar la clase (delete). 
        4) el jefe academico puede visualizar los estudiantes inscritos en la clase cada vez que lo desee ( read)
        */
        menu();
        
    }
    public static void menu(){
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStrings = new Scanner(System.in);
        int tamano = -1;
        while (tamano<=0) {
            System.out.println("Bienvenido al sistema de matricula, ingrese la cantidad de alumnos que habran en la seccion");
            tamano = entrada.nextInt();
        }
        //fuera del while, sabemos que tamano tiene un valor >= 0
        String [] listaAlumnos= crearSeccion(tamano);
        while (bandera) {
            System.out.println("-------Matricula-------");
            System.out.println("1 -> Matricularse");
            System.out.println("2 -> Retirar clase");
            System.out.println("3 -> Visualizar matricula");
            System.out.println("4 -> Salir de la clase");
            System.out.println("ingrese la opcion:");
            int op = entrada.nextInt();
            switch (op) {
                case 1 ->{
                    System.out.println("Matricularse");
                    System.out.println("Ingrese el nombre del alumnos: ");
                    String nombre = entradaStrings.nextLine();
                    listaAlumnos= matricular(nombre,listaAlumnos);
                    imprimirListaAlumnos(listaAlumnos);
                }
                
                case 2->{
                    System.out.println("Retirar ");
                     System.out.println("Ingrese el nombre de alumno: ");
                    String nombre = entradaStrings.nextLine();
                    listaAlumnos=retirar(nombre,listaAlumnos);
                    imprimirListaAlumnos(listaAlumnos);
       
                }
                case 3 ->{
                    System.out.println("Visualizar");
                    imprimirListaAlumnos(listaAlumnos);
                }
                default ->{
                    System.out.println("Saliendo del sistema....");
                    bandera = false;
                }
            }// fin del switch 
        }// fin del while
    } // fin del menu
    
    public static String [] retirar(String nombreEstudiante, String [] seccion){
        /*
            1) indicando la posicon del alumno que se va a retirar //FACIL/ TRABAJO RECOMENDADO
            2) buscar alumnos por nombre y borrarlo
        */
        boolean encontro = false;
        for (int i = 0; i < seccion.length; i++) {
            String estudiante = seccion[i];
            if(estudiante.equalsIgnoreCase(nombreEstudiante)){
                seccion[i]= "";
                encontro=true;
                break;
            }
        }
        
        if (encontro) {
            System.out.println("Se elimino al estudiante");
        }else{
            System.out.println("No se encontro a ningun estudiante con ese nombre, no se elimino");
        }
        
        //despues del for, ya se actualizo la lista.
        return seccion;
        
    }
    public static String [] matricular(String nombreEstudiante, String [] seccion){
       /*
        1) autocontrol -> Complicado
        2) la persona selccione la posicon en la que desea matricular. FACIL/ TRABAJO RECOMENDADO
        */
       if(contador>=seccion.length || contador<0){
           //0.... (seccion.length-1)
           System.out.println("Ya no hay mas espacio en la seccion, no se puede matricular");
       }else{
           System.out.println("Matriculando alumno en la posicion "+contador);
           seccion[contador]= nombreEstudiante;
           contador++;
       }
       //fuera del if, ya actualizamos la lista, deberiamos regresar la lista actualizada
       return seccion;
    }
    
    public static void imprimirListaAlumnos(String [] lista){
        for (int i = 0; i < lista.length; i++) {
            String valor = lista[i];
            System.out.println(i+" ) "+valor);
        }
    }
    
    public static String [] crearSeccion(int tamano){
        String [] seccion = new String [tamano];
        System.out.println("Seccion creada!");
        return seccion;
    }
    
}//fin de la clase
