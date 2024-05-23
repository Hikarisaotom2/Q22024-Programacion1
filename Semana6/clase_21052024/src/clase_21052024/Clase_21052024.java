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
        //0... tamanoFilas-1
        int tamanoColumnas = matriz[0].length;
        // 0....tamanoColumnas-1
        for (int i = 0; i < tamanoFilas; i++) {//filas
            for (int j = 0; j < tamanoColumnas; j++) {//columnas
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }      
        
    }
    
}
