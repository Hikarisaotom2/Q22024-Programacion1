
package clase_29042024;

/**
 *
 * @author claudiacortes
 */
public class Clase_29042024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sexoBio =1;
        /*
           0 -> M 
           1 -> F 
           2 -> No se 
        */
        //forma 1: clasica 
        
        //a,e,i.o.u
        //b,c,d,f,g,hi,......
        char letra = 'a';
        switch (letra) {
            case 'a' :
            case 'e':
            case 'i':
            case 'o':
            case 'u': 
            {
            System.out.println("vocal.");
            break;
            }
            default:
               
        }
              
        switch (sexoBio) {
            case 0 :
            {
                System.out.println("Masculino");
                break;
            }
            case 1: {
                System.out.println("Femenino");
                break;
            }
            case 2 :{
                System.out.println("Prefiero no decirlo");
                break;
            }
            default :{
                System.out.println("Valor no valido o reconocido.");
            }
             
        }//fin del switch case
  
        
        //forma 2: rule swtich 
        switch (sexoBio){
            case 0 ->{
                System.out.println("Masculino dentro de rule switch");
            }
            case 1 ->{
                System.out.println("Femenino dentro del rule switch");
            }
            case 2 ->{
                System.out.println("Prefiero no decirlo dentro del rule switch");
            }
            default ->{
                System.out.println("Valor no valido dentro del rule switch");
            }
        }
    }
    
}
