package clase_08052024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_08052024 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*          Metodos ->  
            1) Reutilizables (recicler
            2) programacion modular ->  dividir el codigo (modulos) 
            3) organizacion -> 
        */
        
        ///llamado / invocacion 
        // "molde de los llamados de los metodos" - > nombredelMetodo (*);
            mensaje();

         if (true) {
             System.out.println("Hola mundo");
        }
            mensaje();

        
        /*
        IMPORTANTE!: 
            1) Los metodos NO SON ESTRUCTURAS DE CONTROL.
            2) NO SE PUEDE ANIDAR UN METODO DENTRO DE OTRO 
            3) si se puede Agregarle estructuras de control 
            4) TODOS LOS METODOS TIENEN NOMBRE 
            5) Los metodos NO se usan automaticamente
            6) los metodos primero se definen y luego se llaman 
        */
        
        /*
        nombres de varibles / metodos :
        1) deben comenzar con letras 
        2) se pueden utilizar numeros en el cueroo de la variable, _
        3) idealmente deben tener nomres significativos 
        */

    }// fin del main
    /*
    Nota: 
        Los metodos se crean FUERA DE MAIN pero DENTRO DE LA CLASE.
        Vamos a programar en los metodos como lo haciamos en el main 
    */
   //"molde de un metodo" -> public*  static*  void*  nombreDelMetodo (*){}
    public static void mensaje (){
        /*CUERPO -> funciona igual que el main*/
        System.out.println("Hola mundo! metodos");
    }
    
}// fin de la clase 

