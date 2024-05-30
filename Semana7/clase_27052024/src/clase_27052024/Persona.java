package clase_27052024;

/**
 *
 * @author claudiacortes
 */
public class Persona {
     /*Atributos*/
    //SON QUE VARIABLES GLOBALES
    private String nombre;
    private int edad;
    private boolean sexoBio;
    String colorCabello;
    private double altura; 
    private int tipoImpresion;
    private String contrasena;
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
        this.contrasena= "123hb.hdb";
    }
    
    /*Metodos*/
    public void calcularImc(){
        double imc = this.altura/2;
        System.out.println("el imc para "+this.nombre+" es "+imc);
    }
    
    
    /**SETTERS Y GETTERS**/
    /*Setter: actualizar el valor de un atributo*/
    public void  actualizarContrasena(String contrasena, int codigoBac){
        if(codigoBac ==5678){
            this.contrasena = contrasena;
        }else{
            System.out.println("No se puede realizar accion");
        }
    }
    
    /*Getters: nos regresan o nos dan acceso al valor de la variable*/
    
    public String obtenerContrasena(){
        return this.contrasena;
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexoBio() {
        return sexoBio;
    }

    public void setSexoBio(boolean sexoBio) {
        this.sexoBio = sexoBio;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getTipoImpresion() {
        return tipoImpresion;
    }

    public void setTipoImpresion(int tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
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
