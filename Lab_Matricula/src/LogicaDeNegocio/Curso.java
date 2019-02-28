/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

/**
 *
 * @author Yenny
 */
public class Curso {
    private String codigo_curso, nombre_curso;
    private int creditos, horas_semanales;

    public Curso() {
        codigo_curso = new String();
        nombre_curso = new String();
        creditos = 0;
        horas_semanales = 0;
    }

    public Curso(String codigo_curso, String nombre_curso, int creditos, int horas_semanales) {
        this.codigo_curso = codigo_curso;
        this.nombre_curso = nombre_curso;
        this.creditos = creditos;
        this.horas_semanales = horas_semanales;
    }

    public String getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(String codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras_semanales() {
        return horas_semanales;
    }

    public void setHoras_semanales(int horas_semanales) {
        this.horas_semanales = horas_semanales;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo_curso=" + codigo_curso + ", nombre_curso=" + nombre_curso + ", creditos=" + creditos + ", horas_semanales=" + horas_semanales + '}';
    }
    
}
