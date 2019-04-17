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
    //Singleton
    private static ControlCurso INSTANCE = null;
    
    ServicioCurso servicioCurso;
    Curso curso;
    boolean consulta = true;
    
    private ControlCurso() {
        this.servicioCurso = ServicioCurso.getINSTANCE();
        this.curso = Curso.getINSTANCE();
    }
    
    public static ControlCurso getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new ControlCurso();
        }
        return INSTANCE;
    }
    
    public boolean ingresarCurso(Curso miCurso) throws SQLException{      
        try {
            consulta = servicioCurso.agregarCurso(miCurso);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean eliminarCurso(String codigoCurso){      
        try {
            consulta = servicioCurso.eliminarCurso(codigoCurso);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public boolean modificarCurso(Curso miCurso) throws SQLException{      
        try {
            consulta = servicioCurso.modificarCurso(miCurso);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    
    public ArrayList listarCurso() throws GlobalException, NoDataException{
        return (ArrayList) servicioCurso.listarCursos();
    }  
    
    public ArrayList buscarCurso(String idBuscar) throws GlobalException, NoDataException{      
        return servicioCurso.buscarCurso(idBuscar);
    }
}
