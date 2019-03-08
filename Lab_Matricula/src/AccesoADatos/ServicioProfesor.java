/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Alumno;
import LogicaDeNegocio.Carrera;
import LogicaDeNegocio.Profesor;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import oracle.jdbc.internal.OracleTypes;



public class ServicioProfesor extends Servicio{
    private static final String AGREGAR_PROFESOR = "call add_PROFESORES(?,?,?,?,?)";
    private static final String MODIFICAR_PROFESOR = "call act_PROFESORES(?,?,?,?,?)";
    private static final String ELIMINAR_PROFESOR = "call del_PROFESOR(?)";
    private static final String MOSTRAR_PROFESOR = "{?=call list_PROFESORES()}";
        private static final String BUSCAR_PROFESOR = "{?=call buscar_PROFESOR(?)}";

    
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
    
    public Collection listarProfesores() throws GlobalException, NoDataException {
        try{
            conectar();
        }catch (ClassNotFoundException ex){
            throw new GlobalException("No se ha localizado el Driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Profesor miProfesor = null;
        CallableStatement pstmt = null;
        try
        {
                pstmt = conexion.prepareCall(MOSTRAR_PROFESOR);
                pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                pstmt.execute();
                rs = (ResultSet)pstmt.getObject(1);
                while (rs.next()){
                    miProfesor = new Profesor(rs.getString("id_profesor"),
                    rs.getString("nombre_profesor"),
                    rs.getString("telefono_profesor"),
                    rs.getString("email_profesor"),
                    rs.getString("usuarios_num_cedula"));
                    coleccion.add(miProfesor);
                    System.out.println(miProfesor.toString() + "\n--------------------------------------");
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
     
   public void eliminarProfesor(String id) throws GlobalException, NoDataException
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
                pstmt = conexion.prepareStatement(ELIMINAR_PROFESOR);
                pstmt.setString(1, id);
                int resultado = pstmt.executeUpdate();
                if (resultado != 0){
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
   
   public Profesor buscarProfesor(String idBusqueda) throws GlobalException, NoDataException{
        try{
            conectar();
        }catch (ClassNotFoundException e){
            throw new GlobalException("No se ha localizado el driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Profesor miProfesor = null;
        CallableStatement pstmt = null;
        try{
            pstmt = conexion.prepareCall(BUSCAR_PROFESOR);
            pstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            pstmt.setString(2, idBusqueda);
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1);
            while (rs.next()){
                miProfesor = new Profesor(rs.getString("id_profesor"),
                rs.getString("nombre_profesor"),
                rs.getString("telefono_profesor"),
                rs.getString("email_profesor"),
                rs.getString("usuarios_num_cedula"));
                coleccion.add(miProfesor);
                System.out.println(miProfesor.toString() + "\n--------------------------------------");
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
        return miProfesor;
    }

    public void modificarProfesor(Carrera miCarrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//FIN CLASS
