/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_matricula;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioAlumno;
import AccesoADatos.ServicioCarrera;
import AccesoADatos.ServicioCurso;
import AccesoADatos.ServicioProfesor;
import Control.ControlAlumno;
import Control.ControlConsola;
import LogicaDeNegocio.Alumno;
import LogicaDeNegocio.Carrera;
import LogicaDeNegocio.Curso;
import LogicaDeNegocio.Profesor;
import Presentacion.Consola;
import Presentacion.Login;
import Presentacion.MantenimientoAlumno;
import Presentacion.MantenimientoCurso;
import Presentacion.MenuMatricula;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;


public class Lab_Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, GlobalException, NoDataException, IOException {
//        Consola miConsola = new Consola();
//        miConsola.menuPrincipal();
        
        Login miLogin = new Login();
        miLogin.setVisible(true);   
        
//        Control.ControlAlumno ca = new ControlAlumno();
//        Alumno al = new Alumno("201111111","Marta","60979646","yulissa@gmail.com","20/10/1997","EIF001","201111111");
//        
//        ca.modificarAlumno(al);
    
    }//fin main
}//fin class
