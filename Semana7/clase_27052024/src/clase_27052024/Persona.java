package clase_27052024;

/**
 *
 * @author claudiacortes
 */
public class Persona {
     /*Atributos*/
    //SON QUE VARIABLES GLOBALES
    String nombre;
    int edad;
    boolean sexoBio;
    String colorCabello;
    double altura; 
    int tipoImpresion;
   /*constructor*/ 
    
    //    Persona(String nuevoNombre, int nuevaEdad){
    //        /*se le da un valor inicial a los atributos.*/
    //        nombre = nuevoNombre;
    //        edad = nuevaEdad;  
    //        altura =0;
    //        colorCabello ="";
    //    }
    
    public Persona(String nombre, int edad, boolean sexoBio, String colorCabello, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexoBio = sexoBio;
        this.colorCabello = colorCabello;
        this.altura = altura;
        this.tipoImpresion = 0;
    }
    
    /*Metodos*/
    public void calcularImc(){
        double imc = this.altura/2;
        System.out.println("el imc para "+this.nombre+" es "+imc);
    }
    

    @Override 
    public String toString() {
        String resp = "";
        switch (this.tipoImpresion) {
            case 1:
                resp =this.nombre;
                break;
            default:
                resp = ""+this.edad;
        }
        return resp ;
    }


    
}
