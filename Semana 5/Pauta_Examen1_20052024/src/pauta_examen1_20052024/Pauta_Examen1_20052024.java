package pauta_examen1_20052024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Pauta_Examen1_20052024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que dese ejecutar");
        int op = entrada.nextInt();
        if (op == 1) {
            ejercicio1();
        } else {
            ejercicio2();
        }
    }
    
    public static void ejercicio1() {
             /*
        1) papel
        Lea una cadena de tamaño par (debe realiar esta validación),
        deberá divir la cadena en dos partes e 
        intercalara las letras de cada mitad se paradas por un - , 
        adicionalmente  reemplace las vocales con números (a=1, e=2, i=3, o=4, u=5).
        Se permite el uso de los métodos, charAt,indexof,replace,replaceall,contains,etc.
        Ejemplo: camiseta
        primera mitad de la cadena: cami 
        segunda mitad de la cadena: seta
        Cadena semifinal : c-s-a-e-m-t-i-a

        Cadena Final: c-s-2-1-m-t-3-4



        Realice un método para:

        1) Realizar todo el ejercicio

        2) Obtener la primera mitad de la cadena

        3) Obtener la segunda mitad de la cadena.

        4)  Obtener la cadena semifinal

        5) Obtener la cadena final
        
        
        2) computadora
         */
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        while (bandera) {
            System.out.println("ingrese una cadena ");
            cadena = entrada.next();
            if (cadena.length() % 2 == 0) {
                bandera = false;
            }
        }
        String primeraMitad = primeraMitad(cadena);
        String segundamitad = segundaMitad(cadena);
        String semiFinal = semiFinal(primeraMitad, segundamitad);
        String cadenaFinal = cadenaFinal(semiFinal);
        System.out.println("primera " + primeraMitad);
        System.out.println("Segunda " + segundamitad);
        System.out.println("Semi final: " + semiFinal);
        System.out.println("cadena final: " + cadenaFinal);

    }

    public static String primeraMitad(String cadena) {
//        for (int i = 0; i < cadena.length()/2; i++) {
//            
//        }
        String mitad = cadena.substring(0, cadena.length() / 2);
        return mitad;

    }

    public static String segundaMitad(String cadena) {
//         for (int i = cadena.length()/2; i < cadena.length(); i++) {
//             
//         }

        String mitad = cadena.substring(cadena.length() / 2, cadena.length());
        return mitad;
    }

    public static String semiFinal(String primera, String segunda) {
        String semi = "";
        for (int i = 0; i < primera.length(); i++) {
            semi += primera.charAt(i) + "-" + segunda.charAt(i) + "-";
        }
        return semi;
    }

    public static String cadenaFinal(String semiFinal) {
//        for (int i = 0; i < semiFinal.length(); i++) {
//        }
        semiFinal = semiFinal.replaceAll("a", "1");
        semiFinal = semiFinal.replaceAll("e", "2");
        semiFinal = semiFinal.replaceAll("i", "3");
        semiFinal = semiFinal.replaceAll("o", "4");
        semiFinal = semiFinal.replaceAll("u", "5");

        return semiFinal;

    }

    public static void ejercicio2() {
        /*
        Al iniciar el programa, se solicitará al usuario que ingrese la cantidad de números que desea ingresar.
        Se creará un arreglo del tamaño especificado por el usuario.

        Se mostrará un menú con las siguientes opciones:

        Opción 1: Ingresar números al arreglo. El usuario podrá ingresar los números uno por uno y se almacenarán en el arreglo.
        Opción 2: Imprimir el arreglo. Se mostrarán en pantalla los números almacenados en el arreglo.
        Opción 3: Visualizar el mayor número dentro del arreglo. Se identificará y mostrará el mayor número contenido en el arreglo.
        El programa continuará ejecutándose hasta que el usuario decida salir.

        Debe crear como minimo, un método para cada opción del menú
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cuantos numeros desea");
        int tamano = entrada.nextInt();
        boolean bandera = true;
        int[] numeros = new int[tamano];
        while (bandera) {
            System.out.println("1 ingresar");
            System.out.println("2 imprimir");
            System.out.println("3 mayor");
            int op = entrada.nextInt();
            switch (op) {
                case 1 -> {
                    numeros = ingresar(numeros);
                    System.out.println("______________________________");
                }
                case 2 -> {
                    imprimir(numeros);
                    System.out.println("______________________________");
                }
                case 3 -> {
                    int mayor = mayor(numeros);
                    System.out.println("El mayor de los numeros es " + mayor);
                    System.out.println("______________________________");
                }
                default -> {
                    System.out.println("Saliendo... ");
                    bandera = false;
                    System.out.println("______________________________");
                }

            }
        }

    }

    public static int[] ingresar(int[] numeros) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese el numero para la pos " + i);
            int numero = entrada.nextInt();
            numeros[i] = numero;
        }
        return numeros;

    }

    public static void imprimir(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[i];
            System.out.println(i + ") " + valor);
        }
    }

    public static int mayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
}
