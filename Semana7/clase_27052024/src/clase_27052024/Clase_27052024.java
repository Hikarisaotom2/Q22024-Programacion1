
package clase_27052024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_27052024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Las clases son nuevos tipos de datos para java*/
      
        Scanner entrada = new Scanner(System.in);
        Persona [] usuarios = new Persona[5];
        Persona usuario = new Persona("Patricia",30,false,"cafe",1.70); 
        System.out.println("El nombre de la persona es: "+ usuario.nombre);
        
        Persona usuario2 = new Persona("Claudia",30,false,"cafe",1.87); 
        System.out.println("El nombre de la persona es: "+ usuario2.nombre);
        
        System.out.println(usuario);
        System.out.println(usuario2);
        
        usuario.calcularImc();
        usuario2.calcularImc();
        
        
        usuario.edad = 31;
        usuario.tipoImpresion = 1;
        System.out.println("tostring "+usuario);
         usuario.tipoImpresion = 2;
        System.out.println("tostring "+usuario);
        
        /* TipoDato nombre = ini;
        
        tipoDedato nombre;*/
        
       /*
       personas regstradas
        arreglo personas
        */
                
                
        
    }

    
}
