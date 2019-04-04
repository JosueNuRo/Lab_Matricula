/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioLogin;
import LogicaDeNegocio.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yenny
 */
public class ControlLogin {
    ServicioLogin servicioLogin = new ServicioLogin();
    Login login = new Login();
    boolean consulta;

    public ControlLogin() {
        this.servicioLogin = new ServicioLogin();
        this.login = new Login();
    }
    
    public boolean login(String usuario, String contrasenna) throws SQLException{      
        try {
            consulta = servicioLogin.login(usuario, contrasenna);
        } catch (GlobalException | NoDataException ex) {
            Logger.getLogger(ControlCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
}
