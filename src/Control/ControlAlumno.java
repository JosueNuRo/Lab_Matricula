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
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlAlumno {
    ServicioAlumno servicioAlumno = new ServicioAlumno();
    Alumno alumno = new Alumno();
    boolean consulta = true;

    public ControlAlumno() {
        this.servicioAlumno = new ServicioAlumno();
        this.alumno = new Alumno();
    }
    
    public boolean ingresarAlumno(Alumno miAlumno){      
        try {
            consulta = servicioAlumno.agregarAlumno(miAlumno);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean eliminarAlumno(String idAlumno){      
        try {
            consulta = servicioAlumno.eliminarAlumno(idAlumno);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean modificarAlumno(Alumno miAlumno){      
        try {
            consulta = servicioAlumno.modificarAlumno(miAlumno);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public ArrayList listarAlumnos() throws GlobalException, NoDataException{
        return servicioAlumno.listarAlumnos();
    }
    
    public ArrayList buscarAlumno(String idBuscar) throws GlobalException, NoDataException{      
        return servicioAlumno.buscarAlumno(idBuscar);
    }
}
