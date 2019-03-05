/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Carrera;
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
public class ServicioCarrera extends Servicio{
    private static final String AGREGAR_CARRERA = "call add_CARRERAS(?,?,?)";
    private static final String MODIFICAR_CARRERA = "call act_CARRERAS(?,?,?)";
    private static final String ELIMINAR_CARRERA = "{call del_CARRERA(?)}";
    private static final String MOSTRAR_CARRERA = "{?=call list_CARRERAS()}";

    
    public void agregarCarrera(Carrera miCarrera) throws GlobalException, NoDataException, SQLException{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(AGREGAR_CARRERA);
            pstmt.setString(1,miCarrera.getCodigo_carrera());
            pstmt.setString(2,miCarrera.getNombre_carrera());
            pstmt.setString(3,miCarrera.getTitulo());
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
    
    public void modificarCarrera(Carrera miCarrera) throws GlobalException, NoDataException, SQLException{
        System.out.println("2");
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        CallableStatement pstmt=null;
        
        try {
            pstmt = conexion.prepareCall(MODIFICAR_CARRERA);
            pstmt.setString(1,miCarrera.getCodigo_carrera());
            pstmt.setString(2,miCarrera.getNombre_carrera());
            pstmt.setString(3,miCarrera.getTitulo());
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
    
     public void eliminarCarrera(String id) throws GlobalException, NoDataException{
        try{
           conectar();
        }catch (ClassNotFoundException e){
            throw new GlobalException("No se ha localizado el driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        PreparedStatement pstmt = null;
        try{
            pstmt = conexion.prepareStatement(ELIMINAR_CARRERA);
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
     
    public Collection listarCarreras() throws GlobalException, NoDataException {
        try{
            conectar();
        }catch (ClassNotFoundException ex){
            throw new GlobalException("No se ha localizado el Driver");
        }catch (SQLException e){
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Carrera miCarrera = null;
        CallableStatement pstmt = null;
        try
        {
                pstmt = conexion.prepareCall(MOSTRAR_CARRERA);
                pstmt.registerOutParameter(1, OracleTypes.CURSOR);
                pstmt.execute();
                rs = (ResultSet)pstmt.getObject(1);
                while (rs.next()){
                    miCarrera = new Carrera(rs.getString("codigo_carrera"),
                    rs.getString("nombre_carrera"),
                    rs.getString("titulo"));
                    coleccion.add(miCarrera);
                    System.out.println(miCarrera.toString() + "\n--------------------------------------");
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
     
}//fin class
