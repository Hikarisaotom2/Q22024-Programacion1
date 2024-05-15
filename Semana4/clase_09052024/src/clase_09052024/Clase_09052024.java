package clase_09052024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_09052024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Menu*/
        menu();

    }// fin del main 

    public static void menu() {
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);       
           
        while (bandera) {
            System.out.println("opcion 1 palabras reversa ");
            System.out.println("Opcion 2 replace ");
            System.out.println("opcion 3 generar calculos");
            System.out.println("Ingrese una opcion");
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
                    /*ejercicio numero 1*/
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Ingrese una cadena: ");
                    String oracion = entrada2.nextLine();
                    ejercicioString(oracion);
                    System.out.println("-----------");
                    ejercicioString("nuevo");

                }
                case 2 -> {
                    /*ejercicio numero 2*/
                    ejerciciosReplace();
                }
                
                case 3->{
                    /*ejercicio numero 3*/
                    int resp= ejercicioNumeros(10,20);
                    System.out.println("el resultado es: "+resp);
                }
                default -> {
                    System.out.println("Saliendo dle menu ");
                    bandera = false;
                }
            }

        }

    }// fin del menu 

    /*
        Parametros y argumentos
     */
    
    /*
    1) "estructura" de los metodos / llamados 
    2) como crear / donde declarar un metodo 
    3) que son los metodos void 
    4) Parametros y argumentos
    */
    
    public static int ejercicioNumeros(int numero1,int numero2){
        /*
        1) escriban el codigo normalmente
        2) organizar y revisar si podemos implementar parametros (opcional)
        3) identificar el valor que desean retornar/regresar/entregar
        4) agregar linea return valorARetornar
        5) identificar el tipo de dato del valorARetornar y ponerlo antes del nombre
        */
        int temp1 = numero1*2;
        int temp2 = numero2*9;
        int resp = temp1+temp2;
        
        return resp; 
    }
                    
    public static void ejercicioString(String cadena) {
        for (int i = cadena.length() - 1; i > 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println("");
    }

    public static void ejerciciosReplace() {
        String cadenaConEspacios = "hola mundo con espacios";
        String cadenaSinEspacios = cadenaConEspacios.replace(" ", "");
        System.out.println("Cadena sin espacios " + cadenaSinEspacios);
    }

}// fin de la clase
