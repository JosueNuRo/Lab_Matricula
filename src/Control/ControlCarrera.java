/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioCarrera;
import LogicaDeNegocio.Carrera;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlCarrera {
    //Singleton
    private static ControlCarrera INSTANCE = null;
    
    ServicioCarrera servicioCarrera;
    Carrera carrera;
    boolean consulta = true;
    
    private ControlCarrera() {
        this.servicioCarrera = ServicioCarrera.getINSTANCE();
        this.carrera = Carrera.getINSTANCE();
    }
    
    public static ControlCarrera getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new ControlCarrera();
        }
        return INSTANCE;
    }
    
    public boolean ingresarCarrera(Carrera miCarrera) throws SQLException{      
        try {
            consulta = servicioCarrera.agregarCarrera(miCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean eliminarCarrera(String codigoCarrera){      
        try {
            consulta = servicioCarrera.eliminarCarrera(codigoCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean modificarCarrera(Carrera miCarrera) throws SQLException{      
        try {
            consulta = servicioCarrera.modificarCarrera(miCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public ArrayList listarCarrera() throws GlobalException, NoDataException{
        return (ArrayList) servicioCarrera.listarCarreras();
    }  
    
    public ArrayList buscarCarrera(String idBuscar) throws GlobalException, NoDataException{      
        return servicioCarrera.buscarCarrera(idBuscar);
    }
}
