/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author SONY
 */
public class frminicio extends javax.swing.JFrame {

    /**
     * Creates new form frminicio
     */
    public frminicio() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Files/logo.png")));  
        
        this.setTitle("Hotel La 29 - Sistema de Reserva de Habitaciones y Gestion de Ventas");
        titleAlign(this);
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        
    }

    private void titleAlign(JFrame frame) {

        Font font = frame.getFont();

        String currentTitle = frame.getTitle().trim();
        FontMetrics fm = frame.getFontMetrics(font);
        int frameWidth = frame.getWidth();
        int titleWidth = fm.stringWidth(currentTitle);
        int spaceWidth = fm.stringWidth(" ");
        int centerPos = (frameWidth / 2) - (titleWidth / 2);
        int spaceCount = centerPos / spaceWidth;
        String pad = "";
        pad = String.format("%" + (spaceCount - 14) + "s", pad);
        frame.setTitle(pad + currentTitle);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblidpersona = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapaterno = new javax.swing.JLabel();
        lblamaterno = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnusisreserva = new javax.swing.JMenu();
        mnuarchivo = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        mnureservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuconsultas = new javax.swing.JMenu();
        mnuconfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuherramientas = new javax.swing.JMenu();
        mnuayuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(93, 93, 93));

        lblidpersona.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblidpersona.setForeground(new java.awt.Color(255, 255, 255));
        lblidpersona.setText("jLabel1");
        escritorio.add(lblidpersona);
        lblidpersona.setBounds(130, 65, 160, 14);

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("jLabel1");
        escritorio.add(lblnombre);
        lblnombre.setBounds(130, 95, 160, 14);

        lblapaterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblapaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblapaterno.setText("jLabel1");
        escritorio.add(lblapaterno);
        lblapaterno.setBounds(130, 125, 160, 14);

        lblamaterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblamaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblamaterno.setText("jLabel1");
        escritorio.add(lblamaterno);
        lblamaterno.setBounds(130, 155, 160, 14);

        lblacceso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblacceso.setForeground(new java.awt.Color(255, 255, 255));
        lblacceso.setText("jLabel1");
        escritorio.add(lblacceso);
        lblacceso.setBounds(130, 185, 160, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS DEL EMPLEADO");
        escritorio.add(jLabel1);
        jLabel1.setBounds(10, 10, 290, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setLabelFor(lblidpersona);
        jLabel3.setText("ID:");
        escritorio.add(jLabel3);
        jLabel3.setBounds(20, 60, 100, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos:");
        escritorio.add(jLabel4);
        jLabel4.setBounds(20, 120, 100, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Acceso:");
        escritorio.add(jLabel6);
        jLabel6.setBounds(20, 180, 100, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setLabelFor(lblnombre);
        jLabel7.setText("Nombre:");
        escritorio.add(jLabel7);
        jLabel7.setBounds(20, 90, 100, 22);

        menuBar.setBackground(new java.awt.Color(153, 0, 0));

        mnusisreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/inicio.png"))); // NOI18N
        mnusisreserva.setMnemonic('f');
        mnusisreserva.setText("Sistema Reservas");
        mnusisreserva.setToolTipText("");
        mnusisreserva.setMaximumSize(new java.awt.Dimension(150, 32800));
        mnusisreserva.setPreferredSize(new java.awt.Dimension(150, 35));
        mnusisreserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnusisreservaMouseClicked(evt);
            }
        });
        menuBar.add(mnusisreserva);

        mnuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/archivo.png"))); // NOI18N
        mnuarchivo.setMnemonic('e');
        mnuarchivo.setText("Archivo");
        mnuarchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnuarchivo.setPreferredSize(new java.awt.Dimension(105, 35));

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/habitaciones.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Habitaciones");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/productos.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Productos");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(copyMenuItem);

        menuBar.add(mnuarchivo);

        mnureservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/reservas.png"))); // NOI18N
        mnureservas.setMnemonic('h');
        mnureservas.setText("Reservas");
        mnureservas.setPreferredSize(new java.awt.Dimension(105, 35));

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/reservas-consumos.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y Consumos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        mnureservas.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/clientes.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mnureservas.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/pagos.png"))); // NOI18N
        jMenuItem1.setText("Pagos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnureservas.add(jMenuItem1);

        menuBar.add(mnureservas);

        mnuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/consultas.png"))); // NOI18N
        mnuconsultas.setText("Consultas");
        mnuconsultas.setPreferredSize(new java.awt.Dimension(110, 35));
        menuBar.add(mnuconsultas);

        mnuconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/configuraciones.png"))); // NOI18N
        mnuconfiguraciones.setText("Configuraciones");
        mnuconfiguraciones.setPreferredSize(new java.awt.Dimension(140, 35));

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/trabajadores.png"))); // NOI18N
        jMenuItem2.setText("Usuarios y accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuconfiguraciones.add(jMenuItem2);

        menuBar.add(mnuconfiguraciones);

        mnuherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/herramientas.png"))); // NOI18N
        mnuherramientas.setText("Herramientas");
        mnuherramientas.setPreferredSize(new java.awt.Dimension(120, 35));
        menuBar.add(mnuherramientas);

        mnuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/ayuda.png"))); // NOI18N
        mnuayuda.setText("Ayuda");
        mnuayuda.setPreferredSize(new java.awt.Dimension(80, 35));

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Acerca de...");
        mnuayuda.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Ayuda");
        mnuayuda.add(jMenuItem4);

        menuBar.add(mnuayuda);

        mnusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.png"))); // NOI18N
        mnusalir.setText("Salir");
        mnusalir.setPreferredSize(new java.awt.Dimension(70, 35));
        mnusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnusalirMouseClicked(evt);
            }
        });
        menuBar.add(mnusalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        frmHabitacion form = new frmHabitacion();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void mnusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnusalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnusalirMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmtrabajador form = new frmtrabajador();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        frmproducto form = new frmproducto();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        frmcliente form = new frmcliente();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        frmreserva form = new frmreserva();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        frmreserva.txtidtrabajador.setText(lblidpersona.getText());
        frmreserva.txttrabajador.setText(lblnombre.getText()+" "+lblapaterno.getText());
        frmreserva.idusuario=Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void mnusisreservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnusisreservaMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_mnusisreservaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmvistacliente form = new frmvistacliente();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        // Aquiiii
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblamaterno;
    public static javax.swing.JLabel lblapaterno;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu mnuarchivo;
    private javax.swing.JMenu mnuayuda;
    public static javax.swing.JMenu mnuconfiguraciones;
    private javax.swing.JMenu mnuconsultas;
    private javax.swing.JMenu mnuherramientas;
    private javax.swing.JMenu mnureservas;
    private javax.swing.JMenu mnusalir;
    private javax.swing.JMenu mnusisreserva;
    // End of variables declaration//GEN-END:variables

}