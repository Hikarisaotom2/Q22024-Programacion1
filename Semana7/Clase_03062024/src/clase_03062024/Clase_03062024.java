/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_03062024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_03062024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arraylist -> listas, de tamano variable 
        // pos validas.... 0.... tamano -1
      
        ArrayList inventario = new ArrayList<String>();
         
        /*a diferencia del arreglo (array) comun, 
        el arraylist no necesita un tamano inicial
        su tamano inicial va a ser 0.
        */
        
        int tamano = inventario.size();
        System.out.println("El tamano actual del arraylist es "+tamano);
        
        //agregar elementos 
       
        
        // 1) si utiliamos .add, los elementos se agregaran al final de la lista
        inventario.add("Juan ");
         System.out.println("El tamano actual del arraylist es "+inventario.size());
        //Primero
         inventario.add("pedro");
         System.out.println("El tamano actual del arraylist es "+inventario.size());
         //Primero, segundo
         inventario.add("Claudia");
         System.out.println("El tamano actual del arraylist es "+inventario.size());
        //Primero, segundo, tercero 
            imprimir(inventario);
       
            
            System.out.println("AGREGANDO EN POS ");
        //Preferencial,Primero, segundo, tercero 
        inventario.add(0,"Abuelita");
        inventario.add(2,"nino");
        
//        ArrayList segundo = new ArrayList<String>();
//        segundo.add("algo");
//        inventario.addAll(segundo);
        
          imprimir(inventario);
          
          
         System.out.println("ELIMINANDO");
        //eliminar 
        // eliminar pos 
        inventario.remove(2);
        imprimir(inventario);
       
        
        // eliminar por valor 
        inventario.remove("Abuelita"); //objetos 
        inventario.remove("Claudia");
        imprimir(inventario);        
        //char , int , boolean, strings....
        
        //modificar 
        inventario.set(0, "Nuevo juan");
        //imprimir(inventario); 
        
         System.out.println("IMPRIMIENDO DIRECTAMENTE EL ARRAYLIST");
        System.out.println(inventario);
        
        if(inventario.contains("pedro")){
            System.out.println("pedro esta en la lista");
        }else{
            System.out.println("pedro no esta");
        }
        // inventario.size()==0
        if (inventario.isEmpty()) {
            System.out.println("esta vacio");
        }else{
            System.out.println("No esta vacio");
        }
        
        //borra todos los elemtnos del arraylist
        inventario.clear();
       
       
        
    }
    
    public static void imprimir(ArrayList<String> lista){
        System.out.println("Imprimir el arreglo ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+")"+lista.get(i));
        }
    }
}
