
package clase_14052024;
/**
 * @author claudiacortes
 */
public class Clase_14052024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Objetos
        Los objetos en java se comprtan diferencte a los tipos de datos primitivos
        */
        
        /*arreglo -> 
        1)pueden contener cualquier tipo de dato valido en java
        2) todos los valores dentro de un arreglo, deben pertenecer al mismo tipo de dato 
        3) para declarara un arreglo, debemos combinar  el tipo de dato + [] 
        4) los arreglos tienen un tamaño fijo que no se puede modificar. 
        */
        
        String [] listaAsistencia = new  String [9];
        
        //obtener el tamano de un arreglo. 
        int tamanoArreglo =listaAsistencia.length;
        System.out.println("El tamaño es: "+tamanoArreglo);
        
        //modificar/ agregar valores a un arreglo , PARA ESTO NECESITAMOS LA Posicon
        listaAsistencia[0]="Claudia Cortes";
        listaAsistencia[9]="Ana mejia";
        
       // imprimir/ visualizar/ read los datos de un arreglo 
        for (int i = 0; i < listaAsistencia.length; i++) {  
            String valor = listaAsistencia[i];
            System.out.println(i+") "+ valor);
        }
 
    }
    
}
