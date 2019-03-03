/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Carrera;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Yenny
 */
public class ServicioCarrera extends Servicio{
    private static final String AGREGAR_CARRERA = "call add_CARRERAS(?,?,?)";
    
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
}
