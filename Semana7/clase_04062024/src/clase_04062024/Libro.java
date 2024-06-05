/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04062024;

/**
 *
 * @author claudiacortes
 */
public class Libro {
    private String titulo;
    private int id;
    private String autor;
    private boolean reservado;

    public Libro(String titulo, int id, String autor) {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.reservado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        // (456) El quijote, autor: Miguel ....
        return   "(" + id + ") "+titulo+" , autor:" + autor ;
    }
    
}
