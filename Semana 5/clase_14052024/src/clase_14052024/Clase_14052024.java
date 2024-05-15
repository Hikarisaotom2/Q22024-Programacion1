
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
       
        /*
        CRUD 
        C -> create
        R -> read 
        U -> update 
        D -> delete
        */
        
        /*
         1) La universidad ..... desea imp,ementar un sistema de matricula para sus clases. 
        la clase de programacion, tendra un espacio de x estudiantes, 
        el valor de x sera porporiconado por el jefe academico al inicoo del periodo (cuando el programa inicia).
        2) el programa debe permitirle a los estudiantes, inscribirse en la clase.  (update)
        3) los estudiantes pueden retirar la clase (delete). 
        4) el jefe academico puede visualizar los estudiantes inscritos en la clase cada vez que lo desee ( read)
        */
                
        
        
    }
    
}
