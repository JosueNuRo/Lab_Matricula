/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Control.ControlProfesor;
import LogicaDeNegocio.Profesor;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class FormularioProfesor extends javax.swing.JFrame {

    ControlProfesor control = new ControlProfesor();
    Profesor profesor = new Profesor();
    int identificador = 0;
    
    public FormularioProfesor() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void identificadorDeAccion(int identificador, Profesor miProfesor){
        this.identificador = identificador;
        if(identificador == 2){
            tituloVentana.setText("Agregar Profesor");
            txt_cedula_profesor.setEditable(true);        
        }else if(identificador == 1){
            tituloVentana.setText("Modificar Profesor");
            txt_cedula_profesor.setEditable(false);
            txt_cedula_profesor.setBackground(Color.WHITE);
            txt_cedula_profesor.setText(miProfesor.getId_profesor());
            txt_nombre_profesor.setText(miProfesor.getNombre_profesor());
            txt_telefono_profesor.setText(miProfesor.getTelefono_profesor());
            txt_email_profesor.setText(miProfesor.getEmail_profesor());
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

        tituloVentana = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_cedula_profesor = new javax.swing.JTextField();
        txt_nombre_profesor = new javax.swing.JTextField();
        txt_telefono_profesor = new javax.swing.JTextField();
        txt_email_profesor = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloVentana.setText("Agregar Profesor");

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cedula.setText("Cédula:");

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        lbl_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_telefono.setText("Teléfono:");

        lbl_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_email.setText("Email:");

        txt_cedula_profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedula_profesorActionPerformed(evt);
            }
        });

        txt_telefono_profesor.setToolTipText("");
        txt_telefono_profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_profesorActionPerformed(evt);
            }
        });

        txt_email_profesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email_profesorActionPerformed(evt);
            }
        });

        btn_guardar.setBackground(new java.awt.Color(204, 204, 204));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btn_guardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(204, 204, 204));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btn_limpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(17, 184, 172)));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(tituloVentana)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_email)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_cedula)
                            .addComponent(lbl_telefono))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_email_profesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(txt_telefono_profesor, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txt_cedula_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(tituloVentana)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_email)
                            .addComponent(txt_email_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedula_profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedula_profesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedula_profesorActionPerformed

    private void txt_telefono_profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_profesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_profesorActionPerformed

    private void txt_email_profesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email_profesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email_profesorActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(identificador == 2){
            profesor.setId_profesor(txt_cedula_profesor.getText());
            profesor.setNombre_profesor(txt_nombre_profesor.getText());
            profesor.setTelefono_profesor(txt_telefono_profesor.getText());
            profesor.setEmail_profesor(txt_email_profesor.getText());
            profesor.setUsuario_num_ced(txt_cedula_profesor.getText());
            control.ingresarProfesor(profesor);    
        }else if(identificador == 1){
            profesor.setId_profesor(txt_cedula_profesor.getText());
            profesor.setNombre_profesor(txt_nombre_profesor.getText());
            profesor.setTelefono_profesor(txt_telefono_profesor.getText());
            profesor.setEmail_profesor(txt_email_profesor.getText());
            profesor.setUsuario_num_ced(txt_cedula_profesor.getText());
            control.modificarProfesor(profesor);
        }       
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_cedula_profesor.setText("");
        txt_nombre_profesor.setText("");
        txt_telefono_profesor.setText("");
        txt_email_profesor.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        try {
            new MantenimientoProfesor().setVisible(true);
        } catch (GlobalException ex) {
            Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel tituloVentana;
    private javax.swing.JTextField txt_cedula_profesor;
    private javax.swing.JTextField txt_email_profesor;
    private javax.swing.JTextField txt_nombre_profesor;
    private javax.swing.JTextField txt_telefono_profesor;
    // End of variables declaration//GEN-END:variables
}
