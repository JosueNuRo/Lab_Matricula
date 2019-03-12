/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Alumno;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;


public class ServicioAlumno extends Servicio{
    private static final String AGREGAR_ALUMNO = "call add_ALUMNOS(?,?,?,?,?,?,?)";
    private static final String MODIFICAR_ALUMNO = "call act_ALUMNOS(?,?,?,?,?,?,?)";
    private static final String BUSCAR_ALUMNO = "{?=call buscar_ALUMNO(?)}";
    private static final String MOSTRAR_ALUMNO = "{?=call list_ALUMNOS()}";
    private static final String ELIMINAR_ALUMNO = "{call del_ALUMNO(?)}";

    public ServicioAlumno() {
    }

    public void agregarAlumno(Alumno miAlumno) throws GlobalException, NoDataException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(AGREGAR_ALUMNO);
            pstmt.setString(1,miAlumno.getId_alumno());
            pstmt.setString(2,miAlumno.getNombre_alumno());
            pstmt.setString(3,miAlumno.getTelefono_alumno());
            pstmt.setString(4,miAlumno.getEmail_alumno());
            pstmt.setString(5,miAlumno.getNuevaFecha());
            pstmt.setString(6,miAlumno.getCarreras_cod_carr());
            pstmt.setString(7,miAlumno.getUsuarios_num_ced());
            boolean resultado = pstmt.execute();
            if (resultado == true){
                throw new NoDataException("No se realizo la agregación");
            }else{
                System.out.println("\nAgregación satisfactoria!");
                JOptionPane.showMessageDialog(null, "Alumno agregado correctamente!");
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
    
    public void modificarAlumno(Alumno miAlumno) throws GlobalException, NoDataException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        try {
            pstmt = conexion.prepareCall(MODIFICAR_ALUMNO);
            pstmt.setString(1,miAlumno.getId_alumno());
            pstmt.setString(2,miAlumno.getNombre_alumno());
            pstmt.setString(3,miAlumno.getTelefono_alumno());
            pstmt.setString(4,miAlumno.getEmail_alumno());
            pstmt.setString(5,miAlumno.getNuevaFecha());
            pstmt.setString(6,miAlumno.getCarreras_cod_carr());
            pstmt.setString(7,miAlumno.getUsuarios_num_ced());
            int resultado = pstmt.executeUpdate();
            if (resultado != 0){
                throw new NoDataException("No se realizo la actualización");
            }else{
                System.out.println("\nModificación Satisfactoria!");
                JOptionPane.showMessageDialog(null, "Modificación Satisfactoria!");
            }
        }
        catch (SQLException e){
            throw new GlobalException("Sentencia no valida");
        }  
        finally {
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
    
    public ArrayList listarAlumnos() throws GlobalException, NoDataException {
        try{
            conectar();
        }catch (ClassNotFoundException ex){
            throw new GlobalException("No se ha localizado el Driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Alumno miAlumno = null;
        CallableStatement pstmt = null;
        try
        {
                pstmt = conexion.prepareCall(MOSTRAR_ALUMNO);
                pstmt.registerOutParameter(1, OracleTypes.CURSOR);
                pstmt.execute();
                rs = (ResultSet)pstmt.getObject(1);
                while (rs.next()){
                    miAlumno = new Alumno(rs.getString("id_alumno"),
                    rs.getString("nombre_alumno"),
                    rs.getString("telefono_alumno"),
                    rs.getString("email_alumno"),
                    rs.getDate("fecha_nacimiento"),
                    rs.getString("carreras_codigo_carrera"),
                    rs.getString("usuarios_num_cedula"));
                    coleccion.add(miAlumno);
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
    
    public ArrayList buscarAlumno(String idBusqueda) throws GlobalException, NoDataException{
        try{
            conectar();
        }catch (ClassNotFoundException e){
            throw new GlobalException("No se ha localizado el driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Alumno miAlumno = null;
        CallableStatement pstmt = null;
        try{
            pstmt = conexion.prepareCall(BUSCAR_ALUMNO);
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.setString(2, idBusqueda);
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1);
            while (rs.next()){
                miAlumno = new Alumno(rs.getString("id_alumno"),
                rs.getString("nombre_alumno"),
                rs.getString("telefono_alumno"),
                rs.getString("email_alumno"),
                rs.getDate("fecha_nacimiento"),
                rs.getString("carreras_codigo_carrera"),
                rs.getString("usuarios_num_cedula"));
                coleccion.add(miAlumno);
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
        return coleccion;
    }
    
    public void eliminarAlumno(String id) throws GlobalException, NoDataException
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
                pstmt = conexion.prepareStatement(ELIMINAR_ALUMNO);
                pstmt.setString(1, id);
                int resultado = pstmt.executeUpdate();
                if (resultado == 0){
                    throw new NoDataException("No se realizo el borrado");
                }else{
                    System.out.println("\nEliminación Satisfactoria!");
                    JOptionPane.showMessageDialog(null, "Eliminación Satisfactoria!");
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
    
}//fin class
