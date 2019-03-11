/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioCurso;
import LogicaDeNegocio.Curso;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlCurso {
    ServicioCurso servicioCurso = new ServicioCurso();
    Curso curso = new Curso();

    public ControlCurso() {
        this.servicioCurso = new ServicioCurso();
        this.curso = new Curso();
    }
    
    public void ingresarCurso(Curso miCurso) throws SQLException{      
        try {
            servicioCurso.agregarCurso(miCurso);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCurso(String codigoCurso){      
        try {
            servicioCurso.eliminarCurso(codigoCurso);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCurso(Curso miCurso) throws SQLException{      
        try {
            servicioCurso.modificarCurso(miCurso);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlConsola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList listarCurso() throws GlobalException, NoDataException{
        return (ArrayList) servicioCurso.listarCursos();
    }  
    
    public ArrayList buscarCurso(String idBuscar) throws GlobalException, NoDataException{      
        return servicioCurso.buscarCurso(idBuscar);
    }
}
