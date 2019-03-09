/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioAlumno;
import AccesoADatos.ServicioCarrera;
import AccesoADatos.ServicioCurso;
import AccesoADatos.ServicioProfesor;
import LogicaDeNegocio.Alumno;
import LogicaDeNegocio.Carrera;
import LogicaDeNegocio.Curso;
import LogicaDeNegocio.Profesor;
import Presentacion.Consola;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlConsola {
    //Atributos
    ServicioAlumno servicioAlumno = new ServicioAlumno();
    Alumno alumno = new Alumno();
    
    ServicioProfesor servicioProfesor = new ServicioProfesor();
    Profesor profesor = new Profesor();
    
    ServicioCarrera servicioCarrera = new ServicioCarrera();
    Carrera carrera = new Carrera();
    
    ServicioCurso servicioCurso = new ServicioCurso();
    Curso curso = new Curso();

    public ControlConsola(){
        this.servicioAlumno = new ServicioAlumno();
        this.alumno = new Alumno();
        this.servicioProfesor = new ServicioProfesor();
        this.profesor = new Profesor();
        this.servicioCarrera = new ServicioCarrera();
        this.carrera = new Carrera();
        this.servicioCurso = new ServicioCurso();
        this.curso = new Curso();

    }
    //Alumno
    public void ingresarAlumno(Alumno miAlumno){      
        try {
            servicioAlumno.agregarAlumno(miAlumno);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAlumno(String idAlumno){      
        try {
            servicioAlumno.eliminarAlumno(idAlumno);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarAlumno(Alumno miAlumno){      
        try {
            servicioAlumno.modificarAlumno(miAlumno);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList listarAlumnos() throws GlobalException, NoDataException{
        return servicioAlumno.listarAlumnos();
    }
    
    public ArrayList buscarAlumno(String idBuscar) throws GlobalException, NoDataException{      
        return servicioAlumno.buscarAlumno(idBuscar);
    }
    
    //Profesor
    public void ingresarProfesor(Profesor miProfesor){      
        try {
            servicioProfesor.agregarProfesor(miProfesor);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarProfesor(String idProfesor){      
        try {
            servicioProfesor.eliminarProfesor(idProfesor);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarProfesor(Profesor miProfesor){      
        try {
            servicioProfesor.modificarProfesor(miProfesor);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarProfesores(){
        try {
            servicioProfesor.listarProfesores();
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarProfesor(String idBuscar){      
        try {
            servicioProfesor.buscarProfesor(idBuscar);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    //Carrera
    public void ingresarCarrera(Carrera miCarrera) throws SQLException{      
        try {
            servicioCarrera.agregarCarrera(miCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCarrera(String codigoCarrera){      
        try {
            servicioCarrera.eliminarCarrera(codigoCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCarrera(Carrera miCarrera) throws SQLException{      
        try {
            servicioCarrera.modificarCarrera(miCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarCarreras(){
        try {
            servicioCarrera.listarCarreras();
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarCarrera(String idBuscar){      
        try {
            servicioCarrera.buscarCarrera(idBuscar);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Curso
    public void ingresarCurso(Curso miCurso) throws SQLException{      
        try {
            servicioCurso.agregarCurso(miCurso);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCurso(String codigoCurso){      
        try {
            servicioCurso.eliminarCurso(codigoCurso);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCurso(Curso miCurso) throws SQLException{      
        try {
            servicioCurso.modificarCurso(miCurso);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listarCurso(){
        try {
            servicioCurso.listarCursos();
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarCurso(String idBuscar){      
        try {
            servicioCurso.buscarCurso(idBuscar);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
