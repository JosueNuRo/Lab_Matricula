/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.ServicioProfesor;
import LogicaDeNegocio.Profesor;


public class ControlProfesor {
    ServicioProfesor servicioProfesor = new ServicioProfesor();
    Profesor profesor = new Profesor();

    public ControlProfesor() {
        this.servicioProfesor = new ServicioProfesor();
        this.profesor = new Profesor();
    }
    
}
