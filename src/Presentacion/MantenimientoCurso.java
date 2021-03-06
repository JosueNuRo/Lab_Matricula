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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yenny
 */
public class MantenimientoCurso extends javax.swing.JFrame {
    Curso curso;
    ControlCurso control;
    DefaultTableModel tablaCurso= new DefaultTableModel(); 
    String idBuscar = "";
    int seleccion;
    
    public MantenimientoCurso() throws GlobalException, NoDataException {
        this.curso = Curso.getINSTANCE();
        this.control = ControlCurso.getINSTANCE();
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

        btn_agregarCurso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_curso = new javax.swing.JTable();
        txt_buscar_curso = new javax.swing.JTextField();
        lbl_buscar = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        lbl_mantenimientoCursos = new javax.swing.JLabel();
        btn_borrarCurso = new javax.swing.JButton();
        btn_listarCurso = new javax.swing.JButton();
        btn_modificarCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_agregarCurso.setBackground(new java.awt.Color(204, 204, 204));
        btn_agregarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        btn_agregarCurso.setToolTipText("");
        btn_agregarCurso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)));
        btn_agregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCursoActionPerformed(evt);
            }
        });

        tbl_curso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_curso.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_curso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_curso);

        txt_buscar_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_cursoActionPerformed(evt);
            }
        });

        lbl_buscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_buscar.setText("Buscar Curso:");

        btn_volver.setBackground(new java.awt.Color(204, 204, 204));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        btn_volver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        lbl_mantenimientoCursos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_mantenimientoCursos.setText("Mantenimiento de Cursos");

        btn_borrarCurso.setBackground(new java.awt.Color(204, 204, 204));
        btn_borrarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btn_borrarCurso.setToolTipText("");
        btn_borrarCurso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        btn_borrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarCursoActionPerformed(evt);
            }
        });

        btn_listarCurso.setBackground(new java.awt.Color(204, 204, 204));
        btn_listarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btn_listarCurso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btn_listarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarCursoActionPerformed(evt);
            }
        });

        btn_modificarCurso.setBackground(new java.awt.Color(204, 204, 204));
        btn_modificarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btn_modificarCurso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 51)));
        btn_modificarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_buscar)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_mantenimientoCursos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_buscar_curso)
                                .addGap(18, 18, 18)
                                .addComponent(btn_agregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_listarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_borrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mantenimientoCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_listarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_buscar)
                            .addComponent(txt_buscar_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_borrarCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCursoActionPerformed
        FormularioCurso formulario = new FormularioCurso();
        formulario.setVisible(true);
        this.dispose();
        formulario.identificadorDeAccion(2,curso);
    }//GEN-LAST:event_btn_agregarCursoActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new MenuMatricula().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    public void llenarTabla() throws GlobalException, NoDataException{
        tablaCurso.addColumn("Código");
        tablaCurso.addColumn("Nombre");
        tablaCurso.addColumn("Creditos");
        tablaCurso.addColumn("Horas Semanales");
      
        this.tbl_curso.setModel(tablaCurso);


        ArrayList<Curso>lista = control.listarCurso();
        Object[] fila = new Object[tablaCurso.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
           fila[0] = lista.get(i).getCodigo_curso();
           fila[1] = lista.get(i).getNombre_curso();
           fila[2] = lista.get(i).getCreditos();
           fila[3] = lista.get(i).getHoras_semanales();
           tablaCurso.addRow(fila);
        }
    }
    
    public void limpiarTabla(){
        tablaCurso.setRowCount(0);
    }
    
    private void btn_borrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarCursoActionPerformed
        int filaSelec = tbl_curso.getSelectedRow();
        if(filaSelec >= 0){
            if(control.eliminarCurso((String) tbl_curso.getValueAt(seleccion,0)) == false){
                JOptionPane.showMessageDialog(null, "Curso eliminado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar curso","",JOptionPane.ERROR_MESSAGE);
            }
            
            //actualizar tabla
            try {
                limpiarTabla();
                tablaCurso.setColumnCount(0);
                llenarTabla();
            } catch (GlobalException ex) {
                Logger.getLogger(MantenimientoCurso.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoDataException ex) {                
                Logger.getLogger(MantenimientoCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila a eliminar","",JOptionPane.WARNING_MESSAGE);
        }      
    }//GEN-LAST:event_btn_borrarCursoActionPerformed

    private void tbl_cursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cursoMouseClicked
        seleccion = tbl_curso.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tbl_cursoMouseClicked

    private void txt_buscar_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_cursoActionPerformed
        try {
            // TODO add your handling code here:
            limpiarTabla();
            idBuscar = txt_buscar_curso.getText();
            ArrayList<Curso>lista = control.buscarCurso(idBuscar);
            Object[] fila = new Object[tablaCurso.getColumnCount()];
            for (int i = 0; i < lista.size(); i++) {
                fila[0] = lista.get(i).getCodigo_curso();
                fila[1] = lista.get(i).getNombre_curso();
                fila[2] = lista.get(i).getCreditos();
                fila[3] = lista.get(i).getHoras_semanales();
                tablaCurso.addRow(fila);
            }
        } catch (GlobalException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el curso","",JOptionPane.ERROR_MESSAGE);
            btn_listarCursoActionPerformed(evt);
            Logger.getLogger(MantenimientoCurso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el curso","",JOptionPane.ERROR_MESSAGE);
            btn_listarCursoActionPerformed(evt);
            Logger.getLogger(MantenimientoCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_buscar_cursoActionPerformed

    private void btn_listarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarCursoActionPerformed
        try {
            limpiarTabla();
            tablaCurso.setColumnCount(0);
            llenarTabla();
        } catch (GlobalException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoDataException ex) {
            Logger.getLogger(MantenimientoAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_buscar_curso.setText("");
    }//GEN-LAST:event_btn_listarCursoActionPerformed

    private void btn_modificarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarCursoActionPerformed
        int filaSelec = tbl_curso.getSelectedRow();
        if(filaSelec >= 0){
            curso.setCodigo_curso((String) tbl_curso.getValueAt(seleccion, 0));
            curso.setNombre_curso((String) tbl_curso.getValueAt(seleccion, 1));
            curso.setCreditos((int) tbl_curso.getValueAt(seleccion, 2));
            curso.setHoras_semanales((int) tbl_curso.getValueAt(seleccion, 3));
            
            FormularioCurso formulario = new FormularioCurso();
            formulario.setVisible(true);
            this.dispose();
            formulario.identificadorDeAccion(1,curso);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila a editar");
        }
    }//GEN-LAST:event_btn_modificarCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCurso;
    private javax.swing.JButton btn_borrarCurso;
    private javax.swing.JButton btn_listarCurso;
    private javax.swing.JButton btn_modificarCurso;
    private javax.swing.JButton btn_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JLabel lbl_mantenimientoCursos;
    private javax.swing.JTable tbl_curso;
    private javax.swing.JTextField txt_buscar_curso;
    // End of variables declaration//GEN-END:variables
}
