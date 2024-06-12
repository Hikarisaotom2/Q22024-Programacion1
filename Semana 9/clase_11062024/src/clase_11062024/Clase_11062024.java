/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11062024;

/**
 *
 * @author claudiacortes
 */
public class Clase_11062024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n =4;
        int facto = factorial(n);
        System.out.println("El resultado del factorial de "+n+" es "+facto);
    }
    
    public static int factorial(int numero){
        if(numero<=1){
            return 1 ;
        }else{
            int res= numero*factorial(numero-1);
            return res;
        }
    }
    
}
