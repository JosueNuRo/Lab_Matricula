/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.ServicioAlumno;
import LogicaDeNegocio.Alumno;

/**
 *
 * @author Yenny
 */
public class ControlAlumno {
    ServicioAlumno servicioAlumno = new ServicioAlumno();
    Alumno alumno = new Alumno();

    public ControlAlumno() {
        this.servicioAlumno = new ServicioAlumno();
        this.alumno = new Alumno();
    }
}
