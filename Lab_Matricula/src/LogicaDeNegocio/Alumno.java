/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import oracle.sql.DATE;


public class Alumno {
    public String id_alumno, nombre_alumno, telefono_alumno, email_alumno, carreras_cod_carr, usuarios_num_ced;
    public String fechaNacimiento;

    public Alumno(){
        id_alumno = new String();
        nombre_alumno = new String();
        telefono_alumno = new String();
        email_alumno = new String();
        fechaNacimiento = new String();
        carreras_cod_carr = new String();
        usuarios_num_ced = new String();
    }

    public Alumno(String id_alumno, String nombre_alumno, String telefono_alumno, String email_alumno, String fechaNacimiento, String carreras_cod_carr, String usuarios_num_ced) {
        this.id_alumno = id_alumno;
        this.nombre_alumno = nombre_alumno;
        this.telefono_alumno = telefono_alumno;
        this.email_alumno = email_alumno;
        this.fechaNacimiento = fechaNacimiento;
        this.carreras_cod_carr = carreras_cod_carr;
        this.usuarios_num_ced = usuarios_num_ced;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getTelefono_alumno() {
        return telefono_alumno;
    }

    public void setTelefono_alumno(String telefono_alumno) {
        this.telefono_alumno = telefono_alumno;
    }

    public String getEmail_alumno() {
        return email_alumno;
    }

    public void setEmail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }

    public String getCarreras_cod_carr() {
        return carreras_cod_carr;
    }

    public void setCarreras_cod_carr(String carreras_cod_carr) {
        this.carreras_cod_carr = carreras_cod_carr;
    }

    public String getUsuarios_num_ced() {
        return usuarios_num_ced;
    }

    public void setUsuarios_num_ced(String usuarios_num_ced) {
        this.usuarios_num_ced = usuarios_num_ced;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", nombre_alumno=" + nombre_alumno + ", telefono_alumno=" + telefono_alumno + ", email_alumno=" + email_alumno + ", carreras_cod_carr=" + carreras_cod_carr + ", usuarios_num_ced=" + usuarios_num_ced + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}
