/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Control.ControlConsola;
import LogicaDeNegocio.Curso;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class FormularioCurso extends javax.swing.JFrame {

    ControlConsola control = new ControlConsola();
    Curso curso = new Curso();
    
    public FormularioCurso() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre_curso = new javax.swing.JTextField();
        txt_creditos_curso = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Curso");

        btn_limpiar.setText("Limpiar");
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

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_horasSemanales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_horasSemanales_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_creditos, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_guardar))
                            .addComponent(txt_codigo_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre_curso)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_creditos_curso)
                                .addGap(116, 116, 116)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btn_volver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_limpiar))
                .addContainerGap())
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

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new MantenimientoCurso().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        curso.setCodigo_curso(txt_codigo_curso.getText());
        curso.setNombre_curso(txt_nombre_curso.getText());
        curso.setCreditos(Integer.parseInt(txt_creditos_curso.getText()));
        curso.setHoras_semanales(Integer.parseInt(txt_horasSemanales_curso.getText()));
        
        try {
            control.ingresarCurso(curso);
        } catch (SQLException ex) {
            Logger.getLogger(FormularioCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_codigo_curso.setText("");
        txt_nombre_curso.setText("");
        txt_creditos_curso.setText("");
        txt_horasSemanales_curso.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_creditos;
    private javax.swing.JLabel lbl_horasSemanales;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTextField txt_codigo_curso;
    private javax.swing.JTextField txt_creditos_curso;
    private javax.swing.JTextField txt_horasSemanales_curso;
    private javax.swing.JTextField txt_nombre_curso;
    // End of variables declaration//GEN-END:variables
}
