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
        visualizarTablero(tablero);
//        boolean gano = false;
//        while (!gano) {
//           visualizarTablero(tablero); 
//            
//        }

    }
    public static String[][] agregarPersonaje(String[][] tablero){
        tablero[0][0]="*";
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
