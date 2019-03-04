/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_matricula;

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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class Lab_Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, GlobalException, NoDataException {
        // TODO code application logic here
        ServicioProfesor profesor = new ServicioProfesor();
        ServicioAlumno alumno = new ServicioAlumno();
        ServicioCarrera carrera = new ServicioCarrera();
        ServicioCurso curso = new ServicioCurso();
        Profesor prof = new Profesor();
        Alumno alum = new Alumno();
        Carrera carr = new Carrera();
        Curso cur = new Curso();
        
//        //MODIFICAR PROFESOR
//        prof = new Profesor ("207660575","Yenifer Lobo González","24442690","yenlobo.09@gmail.com","207660575");
//        try {
//            profesor.modificarProfesor(prof);
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }


//        //MODIFICAR ALUMNO
//        alum = new Alumno ("207650343","Yesy Lobo González","62830488","yesi-dey@gmail.com","16/02/1987","QUI012","207650343");
//        try {
//            alumno.modificarAlumno(alum);
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }


//        //MODIFICAR CARRERA
//        carr = new Carrera ("ING234","Ingles","Enfasis en traduccion");
//        try {
//            carrera.modificarCarrera(carr);
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        //MODIFICAR CURSO
//        cur = new Curso ("ING03","Quimica analitica",4,8);
//        try {
//            curso.modificarCurso(cur);
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//fin main
}//fin class
