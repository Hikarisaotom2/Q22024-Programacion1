/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29052024_miniregistro;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author claudiacortes
 */
public class Clase_29052024_miniRegistro {

    /**
     * @param args the command line arguments
     */
    public static int contadorAlumnos = 0;

    public static void main(String[] args) {
        Estudiante[] alumnos = new Estudiante[20];
        boolean bandera = true;
        while (bandera) {
            System.out.println("1. Listar alumnos ");
            System.out.println("2. agregar alumno");
            System.out.println("3. agregar clases al alumno");
            System.out.println("4.retirar clases de un alumno");
            System.out.println("5 buscar alumnos ");
            System.out.println("6. actualizar");

            Scanner entrada = new Scanner(System.in);
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    listarAlumnos(alumnos);
                    break;
                case 2:
                    alumnos = agregarEstudiante(alumnos);
                    break;
                case 3: 
                    alumnos= agregarClase(alumnos);
                    break;
                case 5:
                    buscarEstudiante(alumnos);
                    break;
                case 6:
                    alumnos = actualizarInformacion(alumnos);
                    break;
                default:
                    bandera = false;
            }
        }
        /*
        X 1) Listar estudiantes en el sistema
        x 2) agregar estudiantes al registro 
        X 3) agregar clases para los estudiantes 
        4) retrirar clases para los estudiantes. 
        x 5) buscar estudiantes. 
       X  6) actualizar informacion  estudiantes. 
         */
    }
    public static Estudiante[] agregarClase(Estudiante[] alumnos){
        listarAlumnos(alumnos);
        System.out.println("Ingrese la pos del alumno que desea modificar: ");
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt(); //ejercicio recomendado  validar que pos este dentro del rango de pos valido de un arreglo. 
        //pos 0 
        if(alumnos[pos]!=null){
            String []clases = alumnos[pos].getClases();
            System.out.println("Las clases de "+alumnos[pos].getNombre());
            for (int i = 0; i < clases.length; i++) {
                System.out.println(i+") "+clases[i]);
            }
                 System.out.println("ingrese el nombre de la clase");
                 entrada.nextLine();
                String clase = entrada.nextLine();
                System.out.println("ingrese la pos donde desea guardar la clase(0-3)");
                int posClase= entrada.nextInt();
                clases[posClase] =clase;
                alumnos[pos].setClases(clases);
        }
        return alumnos;
    }
    public static Estudiante[] actualizarInformacion(Estudiante[] alumnos) {
        /*
        1) preguntando la posicion del alumno 
        2) por medio del numero de cuenta // ejercicio recomendado 
         */
        listarAlumnos(alumnos);
        System.out.println("Ingrese la pos del alumno que desea modificar: ");
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt(); //ejercicio recomendado  validar que pos este dentro del rango de pos valido de un arreglo. 
        //pos 0 

        /*
         1) submenu para preguntar que valor se va a actualizar // ejercicio recomendado 
         2) actualizar . todos los valores */
        System.out.println("Ingrese el nombre");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese la carrera ");
        entrada.nextLine();
        String carrera = entrada.nextLine();
        System.out.println("Ingrese el nuevo promedio ");
        double prom = entrada.nextDouble();
        if (alumnos[pos] != null) {
            alumnos[pos].setCarrera(carrera);
            alumnos[pos].setEdad(pos);
            alumnos[pos].setNombre(nombre);
            alumnos[pos].setPromedio(prom);
            System.out.println("El estudiante se actualizo correctamente");
        } else {
            System.out.println("No hay ningun alumno en esa pos");
        }

        return alumnos;
    }

    public static void buscarEstudiante(Estudiante[] alumnos) {
        /*
       1. buscar por nombre 
        2. buscar por numero de cuenta
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        boolean encontro = false;
        for (int i = 0; i < alumnos.length; i++) {
            Estudiante temp = alumnos[i];

            if (temp != null && temp.getNombre().equalsIgnoreCase(nombre)) {
                encontro = true;
                break;
            }
        }
        if (encontro) {
            System.out.println("Si es estudiante de la universidad");
        } else {
            System.out.println("No se encontro el estudiante");
        }

    }

    public static Estudiante[] agregarEstudiante(Estudiante[] alumnos) {
        /*Crear estudiante*/
        Estudiante nuevoEstudiante = crearEstudiante();

        if (contadorAlumnos < alumnos.length) {
            alumnos[contadorAlumnos] = nuevoEstudiante;
            contadorAlumnos++;
        } else {
            System.out.println("Ya no hay espacio para atender a los alumnos...");
        }
        return alumnos;
    }

    public static Estudiante crearEstudiante() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese la carrera ");
        entrada.nextLine();
        String carrera = entrada.nextLine();
        System.out.println("ingrese el numero de cuenta ");
        int num = entrada.nextInt();
        //Estamos creando un objeto de la clase estudiante, 
        Estudiante nuevo = new Estudiante(nombre, edad, carrera, num);
        return nuevo;
    }

    public static void listarAlumnos(Estudiante[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(i+")"+alumnos[i]);
            if(alumnos[i]!=null){
                if(alumnos[i].getPromedio()>70){
                    System.out.println("nota: APB");
                }else{
                    System.out.println("nota: REP");
                }
            }
        }
    }

}
