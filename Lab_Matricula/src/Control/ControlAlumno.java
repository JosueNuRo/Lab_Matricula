/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioAlumno;
import LogicaDeNegocio.Alumno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlAlumno {
    ServicioAlumno servicioAlumno = new ServicioAlumno();
    Alumno alumno = new Alumno();

    public ControlAlumno() {
        this.servicioAlumno = new ServicioAlumno();
        this.alumno = new Alumno();
    }
    
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
}
