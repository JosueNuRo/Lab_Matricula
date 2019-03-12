/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Control.ControlCurso;
import LogicaDeNegocio.Curso;
import LogicaDeNegocio.Profesor;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class FormularioCurso extends javax.swing.JFrame {
    ControlCurso control = new ControlCurso();
    Curso curso = new Curso();
    int identificador = 0;
    
    public FormularioCurso() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    public void identificadorDeAccion(int identificador, Curso modificarCurso){
        this.identificador = identificador;
        if(identificador == 2){
            tituloVentana.setText("Agregar Curso");
            txt_codigo_curso.setEditable(true);        
        }else if(identificador == 1){
            tituloVentana.setText("Modificar Curso");
            txt_codigo_curso.setEditable(false);
            txt_codigo_curso.setBackground(Color.WHITE);
            txt_codigo_curso.setText(modificarCurso.getCodigo_curso());
            txt_nombre_curso.setText(modificarCurso.getNombre_curso());
            txt_creditos_curso.setText(modificarCurso.getCreditos() + "");
            txt_horasSemanales_curso.setText(modificarCurso.getHoras_semanales()+ "");
        }     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre_curso = new javax.swing.JTextField();
        txt_creditos_curso = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        tituloVentana = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        lbl_codigo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_creditos = new javax.swing.JLabel();
        txt_codigo_curso = new javax.swing.JTextField();
        lbl_horasSemanales = new javax.swing.JLabel();
        txt_horasSemanales_curso = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_creditos_curso.setToolTipText("");
        txt_creditos_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_creditos_cursoActionPerformed(evt);
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

        tituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloVentana.setText("Agregar Curso");

        btn_limpiar.setBackground(new java.awt.Color(204, 204, 204));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        lbl_codigo.setText("Codigo:");

        lbl_nombre.setText("Nombre:");

        lbl_creditos.setText("Creditos:");

        txt_codigo_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_cursoActionPerformed(evt);
            }
        });

        lbl_horasSemanales.setText("Horas semanales:");

        txt_horasSemanales_curso.setToolTipText("");
        txt_horasSemanales_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horasSemanales_cursoActionPerformed(evt);
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
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloVentana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_codigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_creditos, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nombre_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_codigo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_creditos_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbl_horasSemanales)
                            .addGap(18, 18, 18)
                            .addComponent(txt_horasSemanales_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_creditos)
                    .addComponent(txt_creditos_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_horasSemanales)
                    .addComponent(txt_horasSemanales_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_creditos_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_creditos_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_creditos_cursoActionPerformed

    private void txt_codigo_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_cursoActionPerformed

    private void txt_horasSemanales_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horasSemanales_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horasSemanales_cursoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(identificador == 2){
            curso.setCodigo_curso(txt_codigo_curso.getText());
            curso.setNombre_curso(txt_nombre_curso.getText());
            curso.setCreditos(Integer.parseInt(txt_creditos_curso.getText()));
            curso.setHoras_semanales(Integer.parseInt(txt_horasSemanales_curso.getText()));

            try {
                control.ingresarCurso(curso);
            } catch (SQLException ex) {
                Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(identificador == 1){
            curso.setCodigo_curso(txt_codigo_curso.getText());
            curso.setNombre_curso(txt_nombre_curso.getText());
            curso.setCreditos(Integer.parseInt(txt_creditos_curso.getText()));
            curso.setHoras_semanales(Integer.parseInt(txt_horasSemanales_curso.getText()));

            try {
                control.modificarCurso(curso);
            } catch (SQLException ex) {
                Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_codigo_curso.setText("");
        txt_nombre_curso.setText("");
        txt_creditos_curso.setText("");
        txt_horasSemanales_curso.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        try {
            new MantenimientoCurso().setVisible(true);
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
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_creditos;
    private javax.swing.JLabel lbl_horasSemanales;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel tituloVentana;
    private javax.swing.JTextField txt_codigo_curso;
    private javax.swing.JTextField txt_creditos_curso;
    private javax.swing.JTextField txt_horasSemanales_curso;
    private javax.swing.JTextField txt_nombre_curso;
    // End of variables declaration//GEN-END:variables
}
