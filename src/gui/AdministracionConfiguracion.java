/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Configuracion;
import domain.SR232;
import static domain.SR232.cargarPuertosSerie;
import static gui.Desktop.manejadorBD;
import static gui.Login.gs_mensaje;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author angelesygil
 */
public class AdministracionConfiguracion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Configuracion
     */
    public AdministracionConfiguracion(java.awt.Frame parent) {
//        super(parent, modal);
        this.parent = parent;
        initComponents();

        setClosable(true);
        this.pack();
        this.setFrameIcon(new ImageIcon(this.getClass().getResource("/resources/logo tru-test.png")));

        configuracion = new Configuracion();

        configuracion.cargarConfiguracion();

        puertoStickSelector.addArray(cargarPuertosSerie());
        // puertoBasculaSelector.addArray(cargarPuertosSerie());
        //   puertoBasculaSelector.setVisible(false);
        //cargarPuertos();
        asignarValores();
        fondo1.cargar(this.getSize());
        fondo2.cargar(this.getSize());
        fondo3.cargar(this.getSize());
        fondo5.cargar(this.getSize());

    }

    private void asignarValores() {

        puertoStickSelector.setSelectedItem(configuracion.puerto_baston);
        tf_PrecioCarne.setDouble(configuracion.precio_carne);
        tf_CostoAlimento.setDouble(configuracion.costo_alimento);
        tf_Envio.setText(configuracion.envio_com);
        tf_RecComBascula.setText(configuracion.rec_com_bascula);
        tf_RecComBaston.setText(configuracion.rec_com_baston);
        tf_TiempoEsperaCom.setText(configuracion.tiempo_espera_com.toString());
    }

    /*
     private void cargarPuertos() {

     manejadorBD.consulta(""
     + "SELECT puerto_baston, puerto_bascula "
     + "FROM   configuracion");

     if (manejadorBD.getRowCount() > 0) {
     puertoStick = manejadorBD.getValorString(0, 0);
     puertoBascula = manejadorBD.getValorString(0, 1);

     puertoStickSelector.setSelectedItem(puertoStick);
     // puertoBasculaSelector.setSelectedItem(puertoBascula);
     }
     }
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo4 = new abstractt.fondo();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        puertoStickSelector = new abstractt.ComboBox();
        statusBar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_bascula = new abstractt.Boton();
        fondo2 = new abstractt.fondo();
        jPanel3 = new javax.swing.JPanel();
        tf_CostoAlimento = new abstractt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_PrecioCarne = new abstractt.TextField();
        fondo3 = new abstractt.fondo();
        jPanel6 = new javax.swing.JPanel();
        tf_RecComBascula = new abstractt.TextField();
        tf_Envio = new abstractt.TextField();
        tf_RecComBaston = new abstractt.TextField();
        tf_TiempoEsperaCom = new abstractt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fondo5 = new abstractt.fondo();
        btn_grabar = new abstractt.Boton();
        fondo1 = new abstractt.fondo();

        fondo4.setText("fondo4");

        setTitle("Configuración");
        setPreferredSize(new java.awt.Dimension(630, 376));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(64, 37, 4));
        jTabbedPane1.setForeground(new java.awt.Color(64, 37, 4));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        puertoStickSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puertoStickSelectorActionPerformed(evt);
            }
        });
        jPanel1.add(puertoStickSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 150, 20));

        statusBar.setBackground(new java.awt.Color(230, 225, 195));
        statusBar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        statusBar.setForeground(new java.awt.Color(95, 84, 88));
        statusBar.setText("Configuracion...");
        statusBar.setOpaque(true);
        jPanel1.add(statusBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 520, 16));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(95, 84, 88));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Puerto COM:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 20));

        btn_bascula.setText("Buscar Automáticamente");
        btn_bascula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_basculaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_bascula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 180, 30));

        fondo2.setText("fondo2");
        jPanel1.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Puerto COM", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_CostoAlimento.setText("0.00");
        jPanel3.add(tf_CostoAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, 20));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 84, 88));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Costo del Alimento:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, 20));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 84, 88));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Precio de la Carne:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, 20));

        tf_PrecioCarne.setText("0.00");
        jPanel3.add(tf_PrecioCarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 150, 20));

        fondo3.setText("fondo3");
        jPanel3.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Precios/Costos", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(tf_RecComBascula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 150, 20));
        jPanel6.add(tf_Envio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 150, 20));
        jPanel6.add(tf_RecComBaston, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 150, 20));
        jPanel6.add(tf_TiempoEsperaCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 150, 20));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(95, 84, 88));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tiempo de espera Respuesta (seg.):");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, 20));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(95, 84, 88));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Envio al Puerto COM:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, 20));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(95, 84, 88));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Recepcion de Bascula:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 20));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(95, 84, 88));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Recepcion de Baston:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 200, 20));

        fondo5.setText("fondo5");
        jPanel6.add(fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Conf./Busqueda Automatica", jPanel6);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 290));

        btn_grabar.setText("Grabar");
        btn_grabar.setToolTipText("Guarda los valores");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_grabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 100, 30));

        fondo1.setText("fondo1");
        jPanel2.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarPuertoBaston() {

        statusBar("Configurando Puerto");

        configuracion.puerto_baston = puertoStickSelector.getSelectedItem().toString();

        if (configuracion.actualizar()) {
            /*
             if (manejadorBD.actualizacion(""
             + "UPDATE configuracion "
             + "SET puerto_baston    =   '" + puertoStick + "'") == 0) {
             */
            statusBar("Configuracion correcta");

            JOptionPane.showMessageDialog(this, "Se actualizo el puerto Correctamente", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);

        } else {

            statusBar("Configurando erronea");

            JOptionPane.showMessageDialog(this, "Error al actualizar el puerto", gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }

        statusBar("Configuracion...");
    }

    private void puertoStickSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puertoStickSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puertoStickSelectorActionPerformed

    private void cargarDatos() {

        configuracion.puerto_baston = puertoStickSelector.getSelectedItem().toString();
        configuracion.costo_alimento = tf_CostoAlimento.getDouble();
        configuracion.precio_carne = tf_PrecioCarne.getDouble();
        configuracion.envio_com = tf_Envio.getText();
        configuracion.rec_com_bascula = tf_RecComBascula.getText();
        configuracion.rec_com_baston = tf_RecComBaston.getText();
        configuracion.tiempo_espera_com = tf_TiempoEsperaCom.getInt();
    }

    private void btn_basculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_basculaActionPerformed
        buscarAutomaticamente();
    }//GEN-LAST:event_btn_basculaActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        grabar();
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void grabar() {
        cargarDatos();

        if (configuracion.actualizar()) {

            JOptionPane.showMessageDialog(this, "Se actualizaron las configuraciones", gs_mensaje, JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(this, "Error al actualizar las configuraciones  " + manejadorBD.errorSQL, gs_mensaje, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarAutomaticamente() {

        statusBar("Configurando Automatica");
        String puerto;
        String respuesta;
        SR232 sr232 = new SR232();

        ArrayList Puertos = cargarPuertosSerie();

        for (int i = 0; i < Puertos.size(); i++) {

            puerto = Puertos.get(i).toString();
            statusBar.setText("intento conectar " + puerto);
            respuesta = sr232.validandoPuerto(puerto, configuracion.envio_com, configuracion.tiempo_espera_com);

            if (respuesta.equals(configuracion.rec_com_bascula)) {

                puertoStickSelector.setSelectedItem(puerto);
                statusBar("Se Encontro Bascula en " + puerto + " Presiona Puerto COM para Actualizar puerto");
                return;
            } else if (respuesta.equals(configuracion.rec_com_baston)) {

                puertoStickSelector.setSelectedItem(puerto);
                statusBar("Se Encontro Baston en " + puerto + " Presiona Puerto COM para Actualizar puerto");
                return;
            }

            // statusBar("Recepcion "+respuesta);
        }
        statusBar("No se Encontro Dispositivo...");
    }

    private void statusBar(String texto) {
        System.out.println(texto);
        statusBar.setText(texto);
//        jPanel4.repaint();
        statusBar.repaint();
        this.repaint();
    }

    Configuracion configuracion;
    java.awt.Frame parent;
    /*
     private String puertoStick;
     private String puertoBascula;
     private String envio_com;
     private String rec_com_bascula;
     private String rec_com_baston;
     private Integer tiempo_espera_com;
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abstractt.Boton btn_bascula;
    private abstractt.Boton btn_grabar;
    private abstractt.fondo fondo1;
    private abstractt.fondo fondo2;
    private abstractt.fondo fondo3;
    private abstractt.fondo fondo4;
    private abstractt.fondo fondo5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private abstractt.ComboBox puertoStickSelector;
    private javax.swing.JLabel statusBar;
    private abstractt.TextField tf_CostoAlimento;
    private abstractt.TextField tf_Envio;
    private abstractt.TextField tf_PrecioCarne;
    private abstractt.TextField tf_RecComBascula;
    private abstractt.TextField tf_RecComBaston;
    private abstractt.TextField tf_TiempoEsperaCom;
    // End of variables declaration//GEN-END:variables
}