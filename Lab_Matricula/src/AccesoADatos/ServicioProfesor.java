/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Profesor;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.internal.OracleTypes;


/**
 *
 * @author Yenny
 */
public class ServicioProfesor extends Servicio{
    private static final String AGREGAR_PROFESOR = "call add_PROFESORES(?,?,?,?,?)";
    private static final String MODIFICAR_PROFESOR = "call act_PROFESORES(?,?,?,?,?)";
    private static final String ELIMINAR_PROFESOR = "call del_PROFESOR(?)";
    private static final String MOSTRAR_PROFESORES = "call show_PROFESORES()";
    
    public void agregarProfesor(Profesor miProfesor) throws GlobalException, NoDataException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(AGREGAR_PROFESOR);
            pstmt.setString(1,miProfesor.getId_profesor());
            pstmt.setString(2,miProfesor.getNombre_profesor());
            pstmt.setString(3,miProfesor.getTelefono_profesor());
            pstmt.setString(4,miProfesor.getEmail_profesor());
            pstmt.setString(5,miProfesor.getUsuario_num_ced());
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la insercion");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }
    
     public void modificarProfesor(Profesor miProfesor) throws GlobalException, NoDataException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(MODIFICAR_PROFESOR);
            pstmt.setString(1,miProfesor.getId_profesor());
            pstmt.setString(2,miProfesor.getNombre_profesor());
            pstmt.setString(3,miProfesor.getTelefono_profesor());
            pstmt.setString(4,miProfesor.getEmail_profesor());
            pstmt.setString(5,miProfesor.getUsuario_num_ced());
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException("No se realizo la actualizacion");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }
    
   
}//FIN CLASS
