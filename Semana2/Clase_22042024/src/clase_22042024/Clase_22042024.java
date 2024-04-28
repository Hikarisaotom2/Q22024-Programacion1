package clase_22042024;

/**
 *
 * @author claudiacortes
 */
public class Clase_22042024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        If (SI)
        */
        
        //booleans booleanos = true o false 
        boolean variableDePrueba = true;
        boolean variableDePruebaFalsa = false;
        int edad = 10;
        /*El if en su versión base nos ayuda a evaluar unicamente el caso verdadero */
        if (edad>=18){
            System.out.println("Usted tiene 18 años, puede votar! ");
        } 

        
       /*Nos permite evaluar que sucede en el caso verdadero y en el caso falso*/
        if (edad>=18){ //bloque verdadero
           System.out.println("if else: Usted tiene 18 años, puede votar! ");
        } else { //bloque falso
            System.out.println("if else: Usted no tiene la edad para votar aun :( ");
        } 
        

        int nota = 70;
        /*
        nota >=0 nota <60 reprobrado 
        nota >=60 nota <70  bien 
        nota >=70 nota <80 muy bien 
        nota >=80 nota <101 excelente 
        cualquier cosa que no fuera eso, Nota no valida 
        */
        
        //3 formas de resolverlo 
        
        if (nota >= 0 && nota < 60) { //bloque verdadero  0....59
            System.out.println("Reporbado");
        } else { //bloque falso 
            if (nota >= 60 && nota < 70) {// bloque verdadero 60.....69
                System.out.println("Bien");
            } else { //bloque falso ?....?
                    if (nota >=70 && nota <80) {//bloque verdadero  70....79
                        System.out.println("Muy bien");
                } else {//bloque falso ....?...?
                        if (nota >=80 && nota <101) {
                            System.out.println("Excelente");
                        }else{
                            System.out.println("Nota no valida");
                        }
                }
            }// fin del else del rango 60...69
        }//fin del else del rango 0....59
        
       
        //Else if 
        
        if(nota >= 0 && nota < 60){ //bloque verdadero
            System.out.println("Reporbado");
        }else if(nota >= 60 && nota < 70){ //bloque verdadero de la condicion nota >= 60 && nota < 70
             System.out.println("Bien");
        }else if(nota >=70 && nota <80){ // bloque verdaderoi para la condicion nota >=70 && nota <80
            System.out.println("Muy bien");
        }else if (nota >=80 && nota <101){ //bloque verdaderto para la condicion nota >=80 && nota <101
             System.out.println("Nota no valida");
        } else{
            System.out.println("Nota no valida");
        }
  
        
    } // fin de main   
}// fin de la clase 
