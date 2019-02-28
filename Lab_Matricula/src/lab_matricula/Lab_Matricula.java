/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_matricula;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioProfesor;
import LogicaDeNegocio.Profesor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Lab_Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioProfesor addProfesor = new ServicioProfesor();
        try {
            addProfesor.agregarProfesor(new Profesor ("207490463","Joel Porras Lobo","24442690","joelpl@gmail.com","207490463"));
        } catch (GlobalException ex) {
            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(Lab_Matricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
