/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.ServicioCurso;
import LogicaDeNegocio.Curso;

/**
 *
 * @author Yenny
 */
public class ControlCurso {
    ServicioCurso servicioCurso = new ServicioCurso();
    Curso curso = new Curso();

    public ControlCurso() {
        this.servicioCurso = new ServicioCurso();
        this.curso = new Curso();
    }
}
