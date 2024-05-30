/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29052024_miniregistro;

/**
 *
 * @author claudiacortes
 */
public class Clase_29052024_miniRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante alvaro = new Estudiante("Alvaro ",18,"Ing. sistemas",20221570);
        Estudiante [] alumnos  = new Estudiante[20];
        alumnos[0] = alvaro;
        listarAlumnos(alumnos);
        /*
        1) Listar estudiantes en el sistema
        2) agregar estudiantes al registro 
        3) agregar clases para los estudiantes 
        4) retrirar clases para los estudiantes. 
        5) buscar estudiantes. 
        6) actualizar informacion  estudiantes. 
        */
    }
    
    public static void listarAlumnos(Estudiante [] alumnos){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
    }
    
}
