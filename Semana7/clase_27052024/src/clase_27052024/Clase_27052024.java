
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
        System.out.println("El nombre de la persona es: "+ usuario.getNombre());
        
        Persona usuario2 = new Persona("Claudia",30,false,"cafe",1.87); 
        System.out.println("El nombre de la persona es: "+ usuario2.getNombre());
        
        System.out.println(usuario);
        System.out.println(usuario2);
        
        usuario.calcularImc();
        usuario2.calcularImc();
        
        
        /* actualizar iformacion -> set*/
        usuario.setNombre("Bertha");
        
        /*Visualizar la informacion ->get*/
        String nombre = usuario.getNombre();
        
        System.out.println(usuario);
        
        
       
        
    }

    
}
