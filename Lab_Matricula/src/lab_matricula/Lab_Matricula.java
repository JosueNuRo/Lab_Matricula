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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Lab_Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        ServicioProfesor profesor = new ServicioProfesor();
        ServicioAlumno alumno = new ServicioAlumno();
        ServicioCarrera carrera = new ServicioCarrera();
        ServicioCurso curso = new ServicioCurso();
        Profesor prof = new Profesor();
        Alumno alum = new Alumno();
        Carrera carr = new Carrera();
        Curso cur = new Curso();
        
//        //AGREGAR PROFESOR
//        try {
//            profesor.agregarProfesor(new Profesor ("207490463","Joel Porras Lobo","24442690","joelpl@gmail.com","207490463"));
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

//        prof = new Profesor ("207490463","Joel Porras Lobo","24442690","joelpl@gmail.com","207490463");
//         //ELIMINAR PROFESOR
//        try {
//            profesor.eliminarProfesor(prof.getId_profesor());
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

//        //AGREGAR ALUMNO
//        alum = new Alumno("204180827","Guiselle Gonzalez Barquero","24442690","guis0806@gmail.com","08/06/1965","EIF123","204180827");
//        try {
//            alumno.agregarAlumno(alum);
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }


//        //AGREGAR CARRERA
//        carr = new Carrera("QUI012","QUIMICA","ENFASIS EN PROCESOS BIOQUIMICOS");
//        try {
//            carrera.agregarCarrera(carr);
//        } catch (GlobalException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NoDataException ex) {
//            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
//        }


        //AGREGAR CURSO
        cur = new Curso("CUR08","Quimica organica",3,6);
        try {
            curso.agregarCurso(cur);
        } catch (GlobalException ex) {
            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//fin main
}//fin class
