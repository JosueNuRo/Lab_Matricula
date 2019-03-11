/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Control.ControlAlumno;
import LogicaDeNegocio.Alumno;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author josue
 */
public class FormularioAlumno extends javax.swing.JFrame {

    ControlAlumno control = new ControlAlumno();
    Alumno alumno = new Alumno();
    int identificador = 0;
    
    public FormularioAlumno() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    public void identificadorDeAccion(int identificador, Alumno modificarAlumno){
        this.identificador = identificador;
        if(identificador == 2){
            tituloVentana.setText("Agregar Alumno");
            txt_cedula_alumno.setEditable(true);        
        }else if(identificador == 1){
            tituloVentana.setText("Modificar Alumno");
            txt_cedula_alumno.setEditable(false);
            txt_cedula_alumno.setBackground(Color.WHITE);
            txt_cedula_alumno.setText(modificarAlumno.getId_alumno());
            txt_nombre_alumno.setText(modificarAlumno.getNombre_alumno());
            txt_telefono_alumno.setText(modificarAlumno.getTelefono_alumno());
            txt_email_alumno.setText(modificarAlumno.getEmail_alumno());
            dc_fecha.setDate(modificarAlumno.getFechaNacimiento());
            txt_codigoCarrera_alumno.setText(modificarAlumno.getCarreras_cod_carr());
        }     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lbl_cedula = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_cedula_alumno = new javax.swing.JTextField();
        txt_nombre_alumno = new javax.swing.JTextField();
        txt_telefono_alumno = new javax.swing.JTextField();
        txt_email_alumno = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        tituloVentana = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        lbl_nacimiento = new javax.swing.JLabel();
        lbl_codigoCarrera = new javax.swing.JLabel();
        txt_codigoCarrera_alumno = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        dc_fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_cedula.setText("Cédula:");

        lbl_nombre.setText("Nombre:");

        lbl_telefono.setText("Teléfono:");

        lbl_email.setText("Email:");

        txt_cedula_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedula_alumnoActionPerformed(evt);
            }
        });

        txt_telefono_alumno.setToolTipText("");
        txt_telefono_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_alumnoActionPerformed(evt);
            }
        });

        txt_email_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email_alumnoActionPerformed(evt);
            }
        });

        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        tituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloVentana.setText("Agregar Alumno");

        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        lbl_nacimiento.setText("Fecha de Nacimiento:");

        lbl_codigoCarrera.setText("Codigo de carrera:");

        txt_codigoCarrera_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoCarrera_alumnoActionPerformed(evt);
            }
        });

        btn_volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        btn_volver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        dc_fecha.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(tituloVentana)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_telefono)
                                .addComponent(lbl_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_cedula, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lbl_nacimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_codigoCarrera)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_email_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txt_nombre_alumno)
                    .addComponent(txt_codigoCarrera_alumno)
                    .addComponent(txt_telefono_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cedula_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dc_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloVentana)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoCarrera)
                    .addComponent(txt_codigoCarrera_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nacimiento)
                    .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedula_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedula_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedula_alumnoActionPerformed

    private void txt_telefono_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_alumnoActionPerformed

    private void txt_email_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email_alumnoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String fnacim = null;
            try {
                String fecha = dc_fecha.getDateFormatString();
                Date date = dc_fecha.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(fecha);
                fnacim = String.valueOf(sdf.format(date));
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Al menos elija una FECHA DE NACIMIENTO VALIDA ", "Error..!!", JOptionPane.ERROR_MESSAGE);

            }
        if(identificador == 2){
            alumno.setId_alumno(txt_cedula_alumno.getText());
            alumno.setNombre_alumno(txt_nombre_alumno.getText());
            alumno.setTelefono_alumno(txt_telefono_alumno.getText());
            alumno.setEmail_alumno(txt_email_alumno.getText());
            alumno.setCarreras_cod_carr(txt_codigoCarrera_alumno.getText());
            alumno.setNuevaFecha(fnacim);
            alumno.setUsuarios_num_ced(txt_cedula_alumno.getText());
            control.ingresarAlumno(alumno);    
        }else if(identificador == 1){
            
            alumno.setId_alumno(txt_cedula_alumno.getText());
            alumno.setNombre_alumno(txt_nombre_alumno.getText());
            alumno.setTelefono_alumno(txt_telefono_alumno.getText());
            alumno.setEmail_alumno(txt_email_alumno.getText());
            alumno.setCarreras_cod_carr(txt_codigoCarrera_alumno.getText());
            alumno.setNuevaFecha(fnacim);
            alumno.setUsuarios_num_ced(txt_cedula_alumno.getText());
            control.modificarAlumno(alumno);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_cedula_alumno.setText("");
        txt_nombre_alumno.setText("");
        txt_telefono_alumno.setText("");
        txt_email_alumno.setText("");
        txt_codigoCarrera_alumno.setText("");
        dc_fecha.setDateFormatString("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_codigoCarrera_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoCarrera_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoCarrera_alumnoActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        try {
            new MantenimientoAlumno().setVisible(true);
        } catch (GlobalException ex) {
            Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        identificador = 0;
    }//GEN-LAST:event_btn_volverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_volver;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_codigoCarrera;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel tituloVentana;
    private javax.swing.JTextField txt_cedula_alumno;
    private javax.swing.JTextField txt_codigoCarrera_alumno;
    private javax.swing.JTextField txt_email_alumno;
    private javax.swing.JTextField txt_nombre_alumno;
    private javax.swing.JTextField txt_telefono_alumno;
    // End of variables declaration//GEN-END:variables


}
