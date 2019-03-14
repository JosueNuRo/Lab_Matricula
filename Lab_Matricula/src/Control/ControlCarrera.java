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
    ServicioCarrera servicioCarrera = new ServicioCarrera();
    Carrera carrera = new Carrera();

    public ControlCarrera() {
        this.servicioCarrera = new ServicioCarrera();
        this.carrera = new Carrera();
    }
    
    public void ingresarCarrera(Carrera miCarrera) throws SQLException{      
        try {
            servicioCarrera.agregarCarrera(miCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCarrera(String codigoCarrera){      
        try {
            servicioCarrera.eliminarCarrera(codigoCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCarrera(Carrera miCarrera) throws SQLException{      
        try {
            servicioCarrera.modificarCarrera(miCarrera);
        } catch (GlobalException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(ControlCarrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList listarCarrera() throws GlobalException, NoDataException{
        return (ArrayList) servicioCarrera.listarCarreras();
    }  
    
    public ArrayList buscarCarrera(String idBuscar) throws GlobalException, NoDataException{      
        return servicioCarrera.buscarCarrera(idBuscar);
    }
}
