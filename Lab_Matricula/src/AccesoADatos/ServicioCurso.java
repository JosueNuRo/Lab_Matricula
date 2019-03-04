/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Curso;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Yenny
 */
public class ServicioCurso extends Servicio{
    private static final String AGREGAR_CURRSO = "call add_CURSOS(?,?,?,?)";
    private static final String MODIFICAR_CURRSO = "call act_CURSOS(?,?,?,?)";
    
    public void agregarCurso(Curso miCurso) throws GlobalException, NoDataException, SQLException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(AGREGAR_CURRSO);
            pstmt.setString(1,miCurso.getCodigo_curso());
            pstmt.setString(2,miCurso.getNombre_curso());
            pstmt.setInt(3,miCurso.getCreditos());
            pstmt.setInt(4,miCurso.getHoras_semanales());
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
    
    public void modificarCurso(Curso miCurso) throws GlobalException, NoDataException, SQLException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(MODIFICAR_CURRSO);
            pstmt.setString(1,miCurso.getCodigo_curso());
            pstmt.setString(2,miCurso.getNombre_curso());
            pstmt.setInt(3,miCurso.getCreditos());
            pstmt.setInt(4,miCurso.getHoras_semanales());
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
}
