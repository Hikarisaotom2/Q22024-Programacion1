package clase_21052024;

/**
 *
 * @author claudiacortes
 */
public class Clase_21052024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamano = 3;
        int[] lista = new int[tamano];
        /*
        0 6
        1
        2
        */
        
        //matriz 
        int filas = 2;
        int columnas = 2;
        
        int [][] matriz = new int [filas][columnas];
        /*
          0 1
        0 9 20
        1 
        
        */
        
        //arreglo
        lista[0] = 6;
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        // matriz 
        matriz[0][0] = 9;
        matriz[0][1] = 2;
        
        int tamanoFilas=  matriz.length;
        int tamanoColumnas = matriz[0].length;
        
        for (int i = 0; i < tamanoFilas; i++) {//filas
            for (int j = 0; j < tamanoColumnas; j++) {//columnas
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        
        
        /*
                 Maze runner 
            cree un laberinto de tamano z * y
        
        genere, 5 obstaculos aleatorios dentro del tablero 
        posicionar al jugador en la pos de salida, 0,0, rpresente al jugado con un *
        permita al usuario moverse libremente por el tablero 
        si el jugador se quiere mover a una pos que tiene un obtaculo, debemos mostrarle un mensaje diciendole que el camino esta obstruido 
        el juego finaliza si el jugador sale del laberinto o si ub obstaculo esta en la salida. 
        */
        
        
    }
    
}
