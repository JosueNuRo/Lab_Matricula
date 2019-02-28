/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

/**
 *
 * @author Yenny
 */
public class Profesor {
    private String id_profesor, nombre_profesor, telefono_profesor, email_profesor,usuario_num_ced;

    public Profesor() {
        id_profesor = new String();
        nombre_profesor = new String();
        telefono_profesor = new String();
        email_profesor = new String();
        usuario_num_ced = new String();
    }

    public Profesor(String id_profesor, String nombre_profesor, String telefono_profesor, String email_profesor, String usuario_num_ced) {
        this.id_profesor = id_profesor;
        this.nombre_profesor = nombre_profesor;
        this.telefono_profesor = telefono_profesor;
        this.email_profesor = email_profesor;
        this.usuario_num_ced = usuario_num_ced;
    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getTelefono_profesor() {
        return telefono_profesor;
    }

    public void setTelefono_profesor(String telefono_profesor) {
        this.telefono_profesor = telefono_profesor;
    }

    public String getEmail_profesor() {
        return email_profesor;
    }

    public void setEmail_profesor(String email_profesor) {
        this.email_profesor = email_profesor;
    }

    public String getUsuario_num_ced() {
        return usuario_num_ced;
    }

    public void setUsuario_num_ced(String usuario_num_ced) {
        this.usuario_num_ced = usuario_num_ced;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id_profesor=" + id_profesor + ", nombre_profesor=" + nombre_profesor + ", telefono_profesor=" + telefono_profesor + ", email_profesor=" + email_profesor + ", usuario_num_ced=" + usuario_num_ced + '}';
    }
    
}
