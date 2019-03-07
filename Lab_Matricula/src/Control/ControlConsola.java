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
import Presentacion.Consola;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yenny
 */
public class ControlConsola {
    ServicioAlumno servicioAlumno = new ServicioAlumno();
    Alumno alumno = new Alumno();

    public ControlConsola(){
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
}
