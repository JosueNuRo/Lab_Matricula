/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Alumno;
import LogicaDeNegocio.Curso;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Yenny
 */
public class ServicioCurso extends Servicio{
    private static final String AGREGAR_CURSO = "call add_CURSOS(?,?,?,?)";
    private static final String MODIFICAR_CURSO = "call act_CURSOS(?,?,?,?)";
    private static final String MOSTRAR_CURSO = "{?=call list_CURSOS()}";
    private static final String ELIMINAR_CURSO = "{call del_CURSO(?)}";
        private static final String BUSCAR_CURSO = "{?=call buscar_CURSO(?)}";


    
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
            pstmt = conexion.prepareCall(AGREGAR_CURSO);
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
            pstmt = conexion.prepareCall(MODIFICAR_CURSO);
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
    
    public Collection listarCursos() throws GlobalException, NoDataException {
        try{
            conectar();
        }catch (ClassNotFoundException ex){
            throw new GlobalException("No se ha localizado el Driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Curso miCurso = null;
        CallableStatement pstmt = null;
        try
        {
                pstmt = conexion.prepareCall(MOSTRAR_CURSO);
                pstmt.registerOutParameter(1, OracleTypes.CURSOR);
                pstmt.execute();
                rs = (ResultSet)pstmt.getObject(1);
                while (rs.next()){
                    miCurso = new Curso(rs.getString("codigo_curso"),
                    rs.getString("nombre_curso"),
                    rs.getInt("creditos"),
                    rs.getInt("horas_semanales"));
                    coleccion.add(miCurso);
                    System.out.println(miCurso.toString() + "\n--------------------------------------");
                }
        }
        catch (SQLException e){
            e.printStackTrace();
            throw new GlobalException("Sentencia no valida");
        }
        finally {
            try {
                if (rs != null){
                        rs.close();
                }
                if (pstmt != null){
                        pstmt.close();
                }
                desconectar();
            }
            catch (SQLException e){
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.size() == 0){
                throw new NoDataException("No hay datos");
        }
        return coleccion;
    }
    
    public void eliminarCurso(String id) throws GlobalException, NoDataException
	{
            try{
               conectar();
            }catch (ClassNotFoundException e){
                throw new GlobalException("No se ha localizado el driver");
            }catch (SQLException e){
                throw new NoDataException("La base de datos no se encuentra disponible");
            }
            PreparedStatement pstmt = null;
            try{
                pstmt = conexion.prepareStatement(ELIMINAR_CURSO);
                pstmt.setString(1, id);
                int resultado = pstmt.executeUpdate();
                if (resultado == 0){
                    throw new NoDataException("No se realizo el borrado");
                }else{
                    System.out.println("\nEliminación Satisfactoria!");
                }
            }catch (SQLException e){
                throw new GlobalException("Sentencia no valida");
            }
            finally{
                try{
                    if (pstmt != null){
                        pstmt.close();
                    }
                    desconectar();
                }catch (SQLException e){
                   throw new GlobalException("Estatutos invalidos o nulos");
                }
            }
	}
    
    public Curso buscarCurso(String idBusqueda) throws GlobalException, NoDataException{
        try{
            conectar();
        }catch (ClassNotFoundException e){
            throw new GlobalException("No se ha localizado el driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Curso miCurso = null;
        CallableStatement pstmt = null;
        try{
            pstmt = conexion.prepareCall(BUSCAR_CURSO);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, idBusqueda);
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1);
            while (rs.next()){
                miCurso = new Curso(rs.getString("codigo_curso"),
                rs.getString("nombre_curso"),
                rs.getInt("creditos"),
                rs.getInt("horas_semanales"));
                coleccion.add(miCurso);
                System.out.println(miCurso.toString() + "\n--------------------------------------");
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new GlobalException("Sentencia no valida");
        }
        finally{
            try{
                if (rs != null){
                    rs.close();
                }
                if (pstmt != null){
                    pstmt.close();
                }
                desconectar();
            }catch (SQLException e){
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.size() == 0){
            throw new NoDataException("No hay datos");
        }
        return miCurso;
    }
}
