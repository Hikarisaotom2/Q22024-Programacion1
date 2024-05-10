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
            System.out.println("opcion 1 ");
            System.out.println("Opcion 2");
            System.out.println("Ingrese una opcion");
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
                    /*ejercicio numero 1*/
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Ingrese una cadena: ");
                    String cadena = entrada2.nextLine();
                    ejercicioString(cadena);
                    System.out.println("-----------");
                    ejercicioString("nuevo");

                }
                case 2 -> {
                    /*ejercicio numero 2*/
                    ejerciciosReplace();
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
