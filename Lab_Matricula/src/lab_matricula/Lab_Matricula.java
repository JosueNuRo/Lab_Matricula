/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_matricula;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Presentacion.Consola;
import Presentacion.Login;
import java.io.IOException;
import java.sql.SQLException;

public class Lab_Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException, NoDataException, GlobalException {
//        Consola miConsola = new Consola();
//        miConsola.menuPrincipal();
        
        Login miLogin = new Login();
        miLogin.setVisible(true);   
    
    }//fin main
}//fin class
