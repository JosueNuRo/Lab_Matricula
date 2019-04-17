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
    //Singleton
    private static ControlProfesor INSTANCE = null;
    
    ServicioProfesor servicioProfesor;
    Profesor profesor;
    boolean consulta = true;
    
    private ControlProfesor() {
        this.servicioProfesor = ServicioProfesor.getINSTANCE();
        this.profesor = Profesor.getINSTANCE();
    }
    
    public static ControlProfesor getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new ControlProfesor();
        }
        return INSTANCE;
    }
    
    public boolean ingresarProfesor(Profesor miProfesor){      
        try {
            consulta = servicioProfesor.agregarProfesor(miProfesor);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean eliminarProfesor(String idProfesor){      
        try {
            consulta = servicioProfesor.eliminarProfesor(idProfesor);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
     public boolean modificarProfesor(Profesor miProfesor){      
        try {
            consulta = servicioProfesor.modificarProfesor(miProfesor);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public ArrayList listarProfesores() throws GlobalException, NoDataException{
        return (ArrayList) servicioProfesor.listarProfesores();
    }
    
    public ArrayList buscarProfesor(String idBuscar) throws GlobalException, NoDataException{      
        return servicioProfesor.buscarProfesor(idBuscar);
    }
}
