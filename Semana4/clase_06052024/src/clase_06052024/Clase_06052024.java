package clase_06052024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_06052024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /*
        Figuras :
            *************
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamańo de la linea: ");
        int tamano = entrada.nextInt();

//        *******
        for (int i = 0; i < tamano; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("CUADRADO");

        //        *****
        //        *****
        //        *****
        //        *****
        //        *****
        for (int i = 0; i < tamano; i++) { //repita las lineas 
            //crear cada linea 
            for (int j = 0; j < tamano; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }//fin del for que reite las lineas 
        
         /*
         * * * * 
         *     *
         *     *
         * * * * 
        */
         System.out.println("Cuadrado vacio ");
         for (int i = 1; i <= tamano; i++) { //filas //repita las lineas 
            //crear cada linea 
            for (int j = 1; j <= tamano; j++) {//columnas 
                if(i ==tamano || i == 1){
                     System.out.print(" * ");
                }else if(j ==tamano || j == 1){
                     System.out.print(" * ");
                }
               
            }
            System.out.println("");

        }//fin del for que reite las lineas 
         

        //FILA != COLUMNAS 
        System.out.println("Ingrese la cantidas de las filas ");
        int filas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de las columnas ");
        int columnas = entrada.nextInt();
        for (int i = 0; i < filas; i++) {// filas
            for (int j = 0; j < columnas; j++) {// columnas 
                    System.out.print(" * ");
            }
            System.out.println("");
        }//fin del for 
        
        
       
        
        

    }

}
