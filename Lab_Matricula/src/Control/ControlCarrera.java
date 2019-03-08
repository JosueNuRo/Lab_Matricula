/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.ServicioCarrera;
import LogicaDeNegocio.Carrera;


public class ControlCarrera {
    ServicioCarrera servicioCarrera = new ServicioCarrera();
    Carrera carrera = new Carrera();

    public ControlCarrera() {
        this.servicioCarrera = new ServicioCarrera();
        this.carrera = new Carrera();
    }
}
