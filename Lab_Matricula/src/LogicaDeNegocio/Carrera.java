/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;


public class Carrera {
    public String codigo_carrera, nombre_carrera, titulo;

    public Carrera() {
        codigo_carrera = new String();
        nombre_carrera = new String();
        titulo = new String();
    }

    public Carrera(String codigo_carrera, String nombre_carrera, String titulo) {
        this.codigo_carrera = codigo_carrera;
        this.nombre_carrera = nombre_carrera;
        this.titulo = titulo;
    }

    public String getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(String codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo_carrera=" + codigo_carrera + ", nombre_carrera=" + nombre_carrera + ", titulo=" + titulo + '}';
    }
    
}
