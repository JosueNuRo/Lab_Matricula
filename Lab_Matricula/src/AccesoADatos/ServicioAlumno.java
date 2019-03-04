/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Alumno;
import java.awt.List;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Yenny
 */
public class ServicioAlumno extends Servicio{
    private Alumno miAlumno = new Alumno();
    private static final String AGREGAR_ALUMNO = "call add_ALUMNOS(?,?,?,?,?,?,?)";
    private static final String MODIFICAR_ALUMNO = "call act_ALUMNOS(?,?,?,?,?,?,?)";
    private static final String MOSTRAR_ALUMNO = "call show_ALUMNOS()";

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
            pstmt.setString(5,miAlumno.getFechaNacimiento());
            pstmt.setString(6,miAlumno.getCarreras_cod_carr());
            pstmt.setString(7,miAlumno.getUsuarios_num_ced());
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
            pstmt.setString(5,miAlumno.getFechaNacimiento());
            pstmt.setString(6,miAlumno.getCarreras_cod_carr());
            pstmt.setString(7,miAlumno.getUsuarios_num_ced());
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
    
    public ArrayList<Alumno> listarAlumno() throws SQLException
    {
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();


        CallableStatement pstmt = null;
        pstmt = conexion.prepareCall(MOSTRAR_ALUMNO);
        ResultSet rs;
        pstmt.execute();
        rs = (ResultSet) pstmt.getObject(1);
       
        while (rs.next())
        {
            miAlumno.setId_alumno(rs.getString(1));
            miAlumno.setNombre_alumno(rs.getString(2));
            miAlumno.setTelefono_alumno(rs.getString(3));
            miAlumno.setEmail_alumno(rs.getString(4));
            miAlumno.setFechaNacimiento(rs.getString(5));
            miAlumno.setCarreras_cod_carr(rs.getString(6));
            miAlumno.setUsuarios_num_ced(rs.getString(7));
            listaAlumnos.add(miAlumno);
        }
        return listaAlumnos;
    }
}
