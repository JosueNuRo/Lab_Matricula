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
import java.awt.Image;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oracle.sql.DATE;

/**
 *
 * @author Yenny
 */
public class MantenimientoAlumno extends javax.swing.JFrame {
    ControlAlumno control = new ControlAlumno();
    String idBuscar = "";
    DefaultTableModel tablaAlumno = new DefaultTableModel();  
    Alumno alumno = new Alumno();
    int seleccion;
    
    ImageIcon imagen;
    Icon icono;
    /**
     * Creates new form MantenimientoAlumno
     */
    public MantenimientoAlumno() throws GlobalException, NoDataException {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        llenarTabla();
    }
    
    public void llenarTabla() throws GlobalException, NoDataException{
        tablaAlumno.addColumn("Cédula");
        tablaAlumno.addColumn("Nombre");
        tablaAlumno.addColumn("Teléfono");
        tablaAlumno.addColumn("Email");
        tablaAlumno.addColumn("Fecha de Nacimiento");
        tablaAlumno.addColumn("Código Carrera");
        tablaAlumno.addColumn("Usuario");
      
        this.tbl_alumno.setModel(tablaAlumno);


        ArrayList<Alumno>lista = control.listarAlumnos();
        Object[] fila = new Object[tablaAlumno.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
           fila[0] = lista.get(i).getId_alumno();
           fila[1] = lista.get(i).getNombre_alumno();
           fila[2] = lista.get(i).getTelefono_alumno();
           fila[3] = lista.get(i).getEmail_alumno();
           fila[4] = lista.get(i).getFechaNacimiento();
           fila[5] = lista.get(i).getCarreras_cod_carr();
           fila[6] = lista.get(i).getUsuarios_num_ced();
           tablaAlumno.addRow(fila);
        }
    }
    
    public void limpiarTabla(){
        tablaAlumno.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregar_alumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alumno = new javax.swing.JTable();
        txt_buscar_alumno = new javax.swing.JTextField();
        lbl_buscar = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        lbl_mantenimientoAlumnos = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        btn_modificar = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_agregar_alumno.setBackground(new java.awt.Color(204, 204, 204));
        btn_agregar_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btn_agregar_alumno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)));
        btn_agregar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_alumnoActionPerformed(evt);
            }
        });

        tbl_alumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_alumno.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_alumno);

        txt_buscar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_alumnoActionPerformed(evt);
            }
        });

        lbl_buscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_buscar.setText("Buscar Alumno:");

        btn_volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        btn_volver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        lbl_mantenimientoAlumnos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_mantenimientoAlumnos.setText("Mantenimiento de Alumnos");

        btn_eliminar.setBackground(new java.awt.Color(204, 204, 204));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N
        btn_eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_listar.setBackground(new java.awt.Color(204, 204, 204));
        btn_listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btn_listar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });

        btn_modificar.setLabel("button1");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
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
                        .addComponent(btn_agregar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btn_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_mantenimientoAlumnos)
                        .addGap(121, 121, 121))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lbl_buscar)
                .addGap(18, 18, 18)
                .addComponent(txt_buscar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lbl_mantenimientoAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_agregar_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(btn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_alumnoActionPerformed
        FormularioAlumno formulario = new FormularioAlumno();
        formulario.setVisible(true);
        this.dispose();
        formulario.identificadorDeAccion(2,alumno);
    }//GEN-LAST:event_btn_agregar_alumnoActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new MenuMatricula().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void txt_buscar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_alumnoActionPerformed
        try {
            // TODO add your handling code here:
            limpiarTabla();
            idBuscar = txt_buscar_alumno.getText();
            ArrayList<Alumno>lista = control.buscarAlumno(idBuscar);
            Object[] fila = new Object[tablaAlumno.getColumnCount()];
            for (int i = 0; i < lista.size(); i++) {
                fila[0] = lista.get(i).getId_alumno();
                fila[1] = lista.get(i).getNombre_alumno();
                fila[2] = lista.get(i).getTelefono_alumno();
                fila[3] = lista.get(i).getEmail_alumno();
                fila[4] = lista.get(i).getFechaNacimiento();
                fila[5] = lista.get(i).getCarreras_cod_carr();
                fila[6] = lista.get(i).getUsuarios_num_ced();
                tablaAlumno.addRow(fila);
            }
        } catch (GlobalException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscar_alumnoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int filaSelec = tbl_alumno.getSelectedRow();
        if(filaSelec >= 0){
            control.eliminarAlumno((String) tbl_alumno.getValueAt(seleccion,0));
            try {
                limpiarTabla();
                tablaAlumno.setColumnCount(0);
                llenarTabla();
            } catch (GlobalException ex) {
                Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoDataException ex) {
                Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila a eliminar");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tbl_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alumnoMouseClicked
        seleccion = tbl_alumno.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tbl_alumnoMouseClicked

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        try {
            limpiarTabla();
            tablaAlumno.setColumnCount(0);
            llenarTabla();
        } catch (GlobalException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_buscar_alumno.setText("");
    }//GEN-LAST:event_btn_listarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int filaSelec = tbl_alumno.getSelectedRow();
        if(filaSelec >= 0){
            alumno.setId_alumno((String) tbl_alumno.getValueAt(seleccion, 0));
            alumno.setNombre_alumno((String) tbl_alumno.getValueAt(seleccion, 1));
            alumno.setTelefono_alumno((String) tbl_alumno.getValueAt(seleccion, 2));
            alumno.setEmail_alumno((String) tbl_alumno.getValueAt(seleccion, 3));
            alumno.setFechaNacimiento((Date) tbl_alumno.getValueAt(seleccion, 4));
            alumno.setCarreras_cod_carr((String) tbl_alumno.getValueAt(seleccion, 5));
            alumno.setUsuarios_num_ced((String) tbl_alumno.getValueAt(seleccion, 6));
            
            FormularioAlumno formulario = new FormularioAlumno();
            formulario.setVisible(true);
            this.dispose();
            formulario.identificadorDeAccion(1,alumno);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila a editar");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_alumno;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_listar;
    private java.awt.Button btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_mantenimientoAlumnos;
    private javax.swing.JTable tbl_alumno;
    private javax.swing.JTextField txt_buscar_alumno;
    // End of variables declaration//GEN-END:variables
}
