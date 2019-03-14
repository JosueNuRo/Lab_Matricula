/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioProfesor;
import LogicaDeNegocio.Profesor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlProfesor {
    ServicioProfesor servicioProfesor = new ServicioProfesor();
    Profesor profesor = new Profesor();

    public ControlProfesor() {
        this.servicioProfesor = new ServicioProfesor();
        this.profesor = new Profesor();
    }
    
    public void ingresarProfesor(Profesor miProfesor){      
        try {
            servicioProfesor.agregarProfesor(miProfesor);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarProfesor(String idProfesor){      
        try {
            servicioProfesor.eliminarProfesor(idProfesor);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void modificarProfesor(Profesor miProfesor){      
        try {
            servicioProfesor.modificarProfesor(miProfesor);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList listarProfesores() throws GlobalException, NoDataException{
        return (ArrayList) servicioProfesor.listarProfesores();
    }
    
    public ArrayList buscarProfesor(String idBuscar) throws GlobalException, NoDataException{      
        return servicioProfesor.buscarProfesor(idBuscar);
    }
}
