package claserepaso_18062024;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class ClaseRepaso_18062024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] [] tablero = new char [10] [10];
        
        tablero = llenarTablero(tablero);
        imprimir(tablero);
        boolean bandera = hayEnemigos(tablero);
        while (bandera) {
            tablero = movimientoJugador(tablero);
            imprimir(tablero);
           
            bandera = hayEnemigos(tablero);
        }
    }
    
    public static char [] [] llenarTablero( char [] [] tablero){
        int contEnemigos = 0;
        // pos al jugador 
        tablero[0][0] = 'Y';
        Random ran = new Random();
        //generando enemigos 
        while (contEnemigos<5) {
            int fila = ran.nextInt(10);
            int col = ran.nextInt(10);
            if (tablero[fila][col]=='Y'|| tablero[fila][col]=='E') {
                continue;
            }else{
                tablero[fila][col]= 'E';
                contEnemigos++;
            } 
        }
        //agregando espacios en los lugares vacios. 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j]!='Y'&& tablero[i][j]!='E') {
                    tablero[i][j] = ' ';
                }
            }
        }
       return tablero;
    }
    
    public static boolean hayEnemigos(char [] [] tablero){
        int cantEnemigos = 0;
        //rrecorriendo la matriz buscando enemigos 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j]=='E') { 
                    //se encuentra un enemigo y se aumenta el contador
                    cantEnemigos++;
                }
            }
        }
//        return cantEnemigos>0;
        //si hay enemigos,entonces retornamos true para seguir en el juego
        if (cantEnemigos>0) {
            return true;
        }else{
            return false;
        }
    }
    public static void imprimir(char [] [] tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[ "+tablero[i][j]+" ]");
            }
            System.out.println("");
        }
        
    }
    
    public static char [] [] movimientoJugador(char [] [] tablero){
        //buscar al jugador
        int filaJugador = 0;
        int colJugador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j]=='Y') {
                    //encontramos al jugador y salvamos en que fila y columna esta.
                    filaJugador = i;
                    colJugador = j;
                }
            }
        }
        System.out.println("Ingrese el tipo de movimiento");
        System.out.println("U: Arriba");
        System.out.println("D: Abajo");
        System.out.println("L: izquierda");
        System.out.println("R: Derecha");
        Scanner entrada = new Scanner(System.in);
        String movimiento = entrada.next();
        movimiento = movimiento.toLowerCase();

        char pos = movimiento.charAt(0);
        switch (pos) {
            case 'u'://arriba
                if(filaJugador-1>=0){
                    tablero[filaJugador][colJugador] =' ';
                    tablero[filaJugador-1][colJugador] ='Y';
                }else{
                    System.out.println("Movimiento invalido");
                }
                break;
            case 'd'://abajo
                 if(filaJugador+1<=9){
                    tablero[filaJugador][colJugador] =' ';
                    tablero[filaJugador+1][colJugador] ='Y';
                    
                }else{
                    System.out.println("Movimiento invalido");
                }
                break;
            case 'l': //izq
                  if(colJugador-1>=0){
                    tablero[filaJugador][colJugador] =' ';
                    tablero[filaJugador][colJugador-1] ='Y';
                }else{
                    System.out.println("Movimiento invalido");
                }
                break;
            case 'r': //derecha
                  if(colJugador+1<=9){
                    tablero[filaJugador][colJugador] =' ';
                    tablero[filaJugador][colJugador+1] ='Y';
                }else{
                    System.out.println("Movimiento invalido");
                }
                break;
            default:
                System.out.println("Movimiento invalido");
        }
        return tablero;
    }  
}
