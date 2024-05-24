/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_22052024;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_22052024 {

    /**
     * @param args the command line arguments
     */
    static int fila = 0;
    static int columna=0;
    public static void main(String[] args) {
        /*
                 Maze runner 
            cree un laberinto de tamano z * y
        
        genere, 5 obstaculos aleatorios dentro del tablero 
        posicionar al jugador en la pos de salida, 0,0, rpresente al jugado con un *
        permita al usuario moverse libremente por el tablero 
        si el jugador se quiere mover a una pos que tiene un obtaculo, debemos mostrarle un mensaje diciendole que el camino esta obstruido 
        el juego finaliza si el jugador sale del laberinto o si ub obstaculo esta en la salida. 
         */

        System.out.println("Ingrese las filas: ");
        int tamano_filas = leerYValidar();
        System.out.println("Ingrese las columnas");
        int tamano_columnas = leerYValidar();

        String[][] tablero = crearTablero(tamano_filas, tamano_columnas);
        tablero = llenarTablero(tablero);
        tablero = agregarPersonaje(tablero);
        tablero = generarobstaculos(tablero);
        boolean gano = false;
        while (!gano) {
           visualizarTablero(tablero); 
           int pos = leerPos();
           tablero=moverse(tablero,pos);
           boolean finalizo = ganar(tablero);
           if(finalizo){
               gano = true;
           }
        }

    }
    public static String[][] moverse(String[][] tablero, int pos){
            int tamanoFilas = tablero.length;
            int tamanoColumnas = tablero[0].length;
            // 0... tamano-1
             int filaTemp = fila;
             int columnaTemporal=columna;
            switch (pos) {
            case 1->{
                //arriba.
                if(filaTemp>0){
                    filaTemp--;
                }else{
                    System.out.println("No podemos movernos hacia arriba!");
                }
            }
            case 2->{
                //abajo
                  if(filaTemp<(tamanoFilas-1)){
                    filaTemp++;
                }else{
                    System.out.println("No podemos movernos hacia abajo!");
                }
            }
            case 3->{
                //izquierda
                if(columnaTemporal>0){
                    columnaTemporal--;
                }else{
                    System.out.println("No podemos movernos hacia la izquierda!");
                }
            } 
            case 4->{
                //derecha
                if(columnaTemporal<(tamanoColumnas-1)){
                    columnaTemporal++;
                }else{
                    System.out.println("No podemos movernos hacia la derecha!");
                }
            }
            default ->{
                fila=fila;
                columna=columna;
            }
        }
            if(tablero[filaTemp][columnaTemporal].equalsIgnoreCase("x")){
                System.out.println("Hay un obstaculo en el camino!");
            }else{
                tablero[filaTemp][columnaTemporal] ="*";
                tablero[fila][columna] =" ";
                 fila= filaTemp;
                 columna=columnaTemporal;
              
            }
            return tablero;
        
    }
    public static boolean ganar(String[][] tablero){
        int tamanoFilas = tablero.length;
        int tamanocolumnas= tablero[0].length;
        int ultFila = tamanoFilas-1;
        int ultCol =tamanocolumnas-1;
        
        if(tablero[tamanoFilas-1][ultCol].equalsIgnoreCase("*")){
            System.out.println("Esta cerca de ganar!");
            /*
            si cae en una trampa, y cambia de tablero. 
            generar el nuevo tablero.
            hacer que el metodo, regrese el nuevo tablero
            */
        }
        if(tablero[ultFila][ultCol].equalsIgnoreCase("x")){
            System.out.println("Hay un obstaculo en la salida!");
            return true;
            
        }
        
        if (tablero[ultFila][ultCol].equalsIgnoreCase("*")) {
            System.out.println("FELICIDADES! ESCAPO DEL LABERINTO");
            return true;
        }
        return false;
    }
    public static int leerPos (){
            /*
    1) pedimos las coordenadas : recomendacion a los estudiantes, 
    
        2) implementar un sistema de navegacion 
        arriba 
        abajoo
        izquierda
        derecha
    
    */
        System.out.println("1. arriba");
        System.out.println("2. abajo");
        System.out.println("3. izq");
        System.out.println("4. derecha");
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt();
        switch (pos) {
            case 1 -> { System.out.println("moviendose hacia arriba... ");}
            case 2 -> { System.out.println("moviendose hacia abajo... ");}
            case 3 -> { System.out.println("moviendose hacia la izquierda... ");}
            case 4 -> { System.out.println("moviendose hacia la derecha... ");}
            default ->{ System.out.println("pos Invalida... ");}
           
        }
        return pos;
        
    }
    public static String[][] agregarPersonaje(String[][] tablero){
        tablero[fila][columna]="*";
        return tablero;
    }
    public static String[][] generarobstaculos(String[][] tablero) {
        // fila, columna
        int tamFilas = tablero.length;
        int tamCol = tablero[0].length;
       int obsCreados = 0;
        while (obsCreados<5) {
            Random ran = new Random();
            int fila = ran.nextInt(0, tamFilas);
            int col = ran.nextInt(0, tamCol);
            
            if (tablero[fila][col].equalsIgnoreCase("x") ||tablero[fila][col].equalsIgnoreCase("*")) {
                System.out.println("pos repetida");
                continue;
            } else {
                System.out.println("pos vacia");
                tablero[fila][col] = "X";
                obsCreados++;
            }

        }
        return tablero;
    }

    public static String[][] llenarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) { //filas
            for (int j = 0; j < tablero[i].length; j++) {//columnas
                tablero[i][j] = " ";
            }
        }
        return tablero;
    }

    public static void visualizarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {//filas
            for (int j = 0; j < tablero[i].length; j++) {//columnas
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static String[][] crearTablero(int filas, int columnas) {
        String[][] tablero = new String[filas][columnas];
        return tablero;
    }

    public static int leerYValidar() {
        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        while (valor <= 0) {
            System.out.println("ingrese un valor positivo: ");
            valor = entrada.nextInt();
        }
        return valor;
    }

}
