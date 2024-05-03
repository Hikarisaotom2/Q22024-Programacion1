
package clase_30042024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_30042024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En una institución de enseñanza de inglés necesitan un programa 
        que les permita cada día procesar observaciones sobre las clases de ese día.
        La institución dicta clases a estudiantes de distintos niveles; 
        cada nivel tiene clases en un día de la semana diferente. 
        Se debe indicar los días en la pantalla.
        
        Los lunes se dicta el nivel inicial, 
        los martes el nivel intermedio, 
        los miércoles el nivel avanzado,
        los jueves son para práctica hablada 
        y los viernes se dicta inglés para viajeros.

        Cada una de las opciones a seleccionar debe mostrar los niveles en pantalla.
        Se debe comenzar por solicitar al usuario que ingrese la fecha actual,
        primero sería el día y luego el ingreso de DD/MM,
        se debe mostrar en pantalla en el formato día, DD/MM,
        donde "día" es un día de la semana (palabra), 
        DD es el número de día y MM es el número de mes. 
        Si el usuario ingresa un día de la semana inexistente o una fecha cuyo día supere el 31 o el mes supere el número 12,
        finalizará el programa indicando que se produjo un error.

        Debe permitirse ingresar el día de la semana en minúsculas o mayúsculas indistintamente. 
        Una vez indicada la fecha, el usuario debe mencionar si ese día se aplican exámenes o no.
        */
        
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("strings");
        String texto = entrada.nextLine();
        
        System.out.println("numero");
        int numer = entrada.nextInt();
        

        while(bandera){
            System.out.println("Bienvenido al programa ");
            System.out.println("Los lunes se dicta el nivel inicial \n los martes el nivel intermedio \nlos miércoles el nivel avanzado");
            System.out.println("los jueves son para práctica hablada ");
            System.out.println("los viernes se dicta inglés para viajeros.");
            System.out.println("Ingrese los datos en formato dia,DD/MM");
            String valores = entrada.nextLine();
            //charAt(pos) -> caracter en una pos dada 
            // indexof(caracter) -> la pos en la que se encuentra
//            dia,DD/MM ->
            int posComa = valores.indexOf(',');
            int posPleca = valores.indexOf('/');

            // la teoria de conjuntos 
            int tamanofinal = valores.length();
            //                                  [inicio, final[
            
            String dia = valores.substring(0,posComa);
            String fechaString = valores.substring(posComa+1,posPleca);
           
            String mesString = valores.substring(posPleca+1,tamanofinal);
                
            //Casteo -> conv  
            // de string a numero 
            int fecha = Integer.parseInt(fechaString);
            int mes = Integer.parseInt(mesString);
            
            if(fecha<0 || fecha>31 || mes>12|| mes<0){
                bandera = false;
                System.out.println("Se produjo un error");
            }
            String diaMayuscula = dia.toUpperCase(); 
            String diaMinuscula = dia.toLowerCase();
//                Dia.equals("lunes")  Dia.equalsIgnoreCase("lunes")  Los strings no se comparan utiliando ==
            
            switch (diaMinuscula) {
                    case "lunes"->{}
                    case "martes"->{}
                    case "miercoles"->{}
                    case "jueves"->{}
                    case "viernes"->{}
                    default->{
                        System.out.println("Se produjo un error"); 
                        bandera = false;}
                }
            
            
        }
    }
    
}

  // 0  1 2 3
            // H o l a -> tama 4 
            //1ra -> 0
            //ultim- > 3
//            char letra= valores.charAt(5);
            


/**
 *          1) asumimos que siempre el mes/dia sera de dos digitos
 *          2) No sabemos cuantos digitos tendra e mes o el dia
 **/