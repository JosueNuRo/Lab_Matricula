/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Control.ControlCarrera;
import LogicaDeNegocio.Carrera;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class FormularioCarrera extends javax.swing.JFrame {
    ControlCarrera control;
    Carrera carrera;
    int identificador = 0;
    
    public FormularioCarrera() {
        this.control = ControlCarrera.getINSTANCE();
        this.carrera = Carrera.getINSTANCE();
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void identificadorDeAccion(int identificador, Carrera modificarCarrera){
        this.identificador = identificador;
        if(identificador == 2){
            tituloVentana.setText("Agregar Carrera");
            txt_codigo_carrera.setEditable(true);        
        }else if(identificador == 1){
            tituloVentana.setText("Modificar Carrera");
            txt_codigo_carrera.setEditable(false);
            txt_codigo_carrera.setBackground(Color.WHITE);
            txt_codigo_carrera.setText(modificarCarrera.getCodigo_carrera());
            txt_nombre_carrera.setText(modificarCarrera.getNombre_carrera());
            txt_titulo_carrera.setText(modificarCarrera.getTitulo());
        }     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_codigo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        txt_codigo_carrera = new javax.swing.JTextField();
        txt_nombre_carrera = new javax.swing.JTextField();
        txt_titulo_carrera = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        tituloVentana = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_codigo.setText("Codigo:");

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_titulo.setText("Título:");

        txt_codigo_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_carreraActionPerformed(evt);
            }
        });

        txt_nombre_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_carreraActionPerformed(evt);
            }
        });

        txt_titulo_carrera.setToolTipText("");
        txt_titulo_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_titulo_carreraActionPerformed(evt);
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
        tituloVentana.setText("Agregar Carrera");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(tituloVentana))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre)
                                    .addComponent(lbl_codigo)
                                    .addComponent(lbl_titulo))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_codigo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre_carrera, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(txt_titulo_carrera))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tituloVentana)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo)
                    .addComponent(txt_titulo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigo_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_carreraActionPerformed

    private void txt_titulo_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_titulo_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_titulo_carreraActionPerformed

    private void txt_nombre_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_carreraActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(identificador == 2){
        carrera.setCodigo_carrera(txt_codigo_carrera.getText());
        carrera.setNombre_carrera(txt_nombre_carrera.getText());
        carrera.setTitulo(txt_titulo_carrera.getText());
        
            try {
                if(control.ingresarCarrera(carrera) == false){
                    JOptionPane.showMessageDialog(null, "Carrera ingresada correctamente");
                    btn_volverActionPerformed(evt);
                } else if(control.ingresarCarrera(carrera) == true){
                    JOptionPane.showMessageDialog(null, "Error al ingresar carrera","",JOptionPane.ERROR_MESSAGE);
                    btn_volverActionPerformed(evt);  
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar carrera","",JOptionPane.ERROR_MESSAGE);
                btn_volverActionPerformed(evt);
                Logger.getLogger(FormularioCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(identificador == 1){
            carrera.setCodigo_carrera(txt_codigo_carrera.getText());
            carrera.setNombre_carrera(txt_nombre_carrera.getText());
            carrera.setTitulo(txt_titulo_carrera.getText());
        
            try {
                if(control.modificarCarrera(carrera) == false){
                    JOptionPane.showMessageDialog(null, "Carrera modificada correctamente");
                    btn_volverActionPerformed(evt);
                } else if(control.modificarCarrera(carrera) == true){
                    JOptionPane.showMessageDialog(null, "Error al modificar carrera","",JOptionPane.ERROR_MESSAGE);
                    btn_volverActionPerformed(evt);  
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar carrera","",JOptionPane.ERROR_MESSAGE);
                btn_volverActionPerformed(evt); 
                Logger.getLogger(FormularioCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_codigo_carrera.setText("");
        txt_nombre_carrera.setText("");
        txt_titulo_carrera.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        try {
            new MantenimientoCarrera().setVisible(true);
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
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel tituloVentana;
    private javax.swing.JTextField txt_codigo_carrera;
    private javax.swing.JTextField txt_nombre_carrera;
    private javax.swing.JTextField txt_titulo_carrera;
    // End of variables declaration//GEN-END:variables
}
