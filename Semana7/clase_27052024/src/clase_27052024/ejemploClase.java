/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_27052024;

/**
 *
 * @author claudiacortes
 */
public class ejemploClase {
    
    Persona [] registro;

    public ejemploClase(Persona[] registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        for (int i = 0; i < registro.length; i++) {
            System.out.println(registro[i]); 
        }
        return "ejemploClase{" + "registro=" + registro + '}';
    }
    
    
}
