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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MantenimientoCarrera extends javax.swing.JFrame {

    ControlCarrera control = new ControlCarrera();
    DefaultTableModel tablaCarrera= new DefaultTableModel();
    Carrera carrera = new Carrera();
    int seleccion;
    String idBuscar = "";

    
    public MantenimientoCarrera() throws GlobalException, NoDataException {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregarCarrera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_carrera = new javax.swing.JTable();
        txt_buscar_carrera = new javax.swing.JTextField();
        lbl_buscar = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        lbl_mantenimientoCarreras = new javax.swing.JLabel();
        btn_borrarCarrera = new javax.swing.JButton();
        btn_listarCarrera = new javax.swing.JButton();
        btn_modificarCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_agregarCarrera.setBackground(new java.awt.Color(204, 204, 204));
        btn_agregarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btn_agregarCarrera.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)));
        btn_agregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCarreraActionPerformed(evt);
            }
        });

        tbl_carrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_carrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_carrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_carreraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_carrera);

        txt_buscar_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_carreraActionPerformed(evt);
            }
        });

        lbl_buscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_buscar.setText("Buscar Carrera:");

        btn_volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        btn_volver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        lbl_mantenimientoCarreras.setBackground(new java.awt.Color(204, 204, 204));
        lbl_mantenimientoCarreras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_mantenimientoCarreras.setText("Mantenimiento de Carreras");

        btn_borrarCarrera.setBackground(new java.awt.Color(204, 204, 204));
        btn_borrarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btn_borrarCarrera.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        btn_borrarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarCarreraActionPerformed(evt);
            }
        });

        btn_listarCarrera.setBackground(new java.awt.Color(204, 204, 204));
        btn_listarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btn_listarCarrera.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_listarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarCarreraActionPerformed(evt);
            }
        });

        btn_modificarCarrera.setBackground(new java.awt.Color(204, 204, 204));
        btn_modificarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btn_modificarCarrera.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 51)));
        btn_modificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_buscar)
                            .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_mantenimientoCarreras)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_buscar_carrera)
                                .addGap(18, 18, 18)
                                .addComponent(btn_agregarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_listarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_borrarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_mantenimientoCarreras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_buscar_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_buscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_listarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregarCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificarCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        btn_modificarCarrera.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCarreraActionPerformed
        FormularioCarrera formulario = new FormularioCarrera();
        formulario.setVisible(true);
        this.dispose();
        formulario.identificadorDeAccion(2,carrera);
    }//GEN-LAST:event_btn_agregarCarreraActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new MenuMatricula().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_borrarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarCarreraActionPerformed
        int filaSelec = tbl_carrera.getSelectedRow();
        if(filaSelec >= 0){
            control.eliminarCarrera((String) tbl_carrera.getValueAt(seleccion,0));
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila a eliminar");
        }
    }//GEN-LAST:event_btn_borrarCarreraActionPerformed

    public void llenarTabla() throws GlobalException, NoDataException{
        tablaCarrera.addColumn("Código");
        tablaCarrera.addColumn("Nombre");
        tablaCarrera.addColumn("Título");
      
        this.tbl_carrera.setModel(tablaCarrera);


        ArrayList<Carrera>lista = control.listarCarrera();
        Object[] fila = new Object[tablaCarrera.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
           fila[0] = lista.get(i).getCodigo_carrera();
           fila[1] = lista.get(i).getNombre_carrera();
           fila[2] = lista.get(i).getTitulo();
           tablaCarrera.addRow(fila);
        }
    }
    
    public void limpiarTabla(){
        tablaCarrera.setRowCount(0);
    }
    
    private void tbl_carreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_carreraMouseClicked
        seleccion = tbl_carrera.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tbl_carreraMouseClicked

    private void txt_buscar_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_carreraActionPerformed
        try {
            // TODO add your handling code here:
            limpiarTabla();
            idBuscar = txt_buscar_carrera.getText();
            ArrayList<Carrera>lista = control.buscarCarrera(idBuscar);
            Object[] fila = new Object[tablaCarrera.getColumnCount()];
            for (int i = 0; i < lista.size(); i++) {
                fila[0] = lista.get(i).getCodigo_carrera();
                fila[1] = lista.get(i).getNombre_carrera();
                fila[2] = lista.get(i).getTitulo();
                tablaCarrera.addRow(fila);
            }
        } catch (GlobalException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscar_carreraActionPerformed

    private void btn_listarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarCarreraActionPerformed
        try {
            limpiarTabla();
            tablaCarrera.setColumnCount(0);
            llenarTabla();
        } catch (GlobalException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_buscar_carrera.setText("");
    }//GEN-LAST:event_btn_listarCarreraActionPerformed

    private void btn_modificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarCarreraActionPerformed
        int filaSelec = tbl_carrera.getSelectedRow();
        if(filaSelec >= 0){
            carrera.setCodigo_carrera((String) tbl_carrera.getValueAt(seleccion, 0));
            carrera.setNombre_carrera((String) tbl_carrera.getValueAt(seleccion, 1));
            carrera.setTitulo((String) tbl_carrera.getValueAt(seleccion, 2));
            
            FormularioCarrera formulario = new FormularioCarrera();
            formulario.setVisible(true);
            this.dispose();
            formulario.identificadorDeAccion(1,carrera);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila a editar");
        }
    }//GEN-LAST:event_btn_modificarCarreraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCarrera;
    private javax.swing.JButton btn_borrarCarrera;
    private javax.swing.JButton btn_listarCarrera;
    private javax.swing.JButton btn_modificarCarrera;
    private javax.swing.JButton btn_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_mantenimientoCarreras;
    private javax.swing.JTable tbl_carrera;
    private javax.swing.JTextField txt_buscar_carrera;
    // End of variables declaration//GEN-END:variables
}
