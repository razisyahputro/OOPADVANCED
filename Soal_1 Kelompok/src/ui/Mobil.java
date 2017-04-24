/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import ui.KoneksiDB;

/**
 *
 * @author Aldi Azmy
 */
public class Mobil extends javax.swing.JFrame {
    public Connection koneksi;
    private KoneksiDB db = new KoneksiDB();
    private String sql; // variabel "sql" digunakan menampung hasil query database
    private Statement st; // object "st" dari class Statement
    private ResultSet rs; // object "rs" dari class Resulset
    private PreparedStatement ps; // object "ps" dari class PreparedStatement
    private DefaultTableModel dtm; //object "dtm" dari class DefaultTableModel
    
    public Mobil() {
        initComponents();
        dataTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jmerk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jserial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbody = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jengine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtipe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jprod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcyl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jfuel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jen = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jclutch = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jSimpan = new javax.swing.JButton();
        jUbah = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jCarii = new javax.swing.JTextField();
        jCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(840, 515));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Merk");
        jLabel5.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 20));

        jmerk.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jmerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 190, -1));

        jLabel1.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Serial Number");
        jLabel1.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, -1));

        jserial.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Body Number");
        jLabel2.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 20));

        jbody.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jbody, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 190, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Engine Number");
        jLabel3.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        jengine.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jengine, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type");
        jLabel4.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 20));

        jtipe.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jtipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Production Date");
        jLabel6.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 20));

        jprod.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        jLabel7.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 140, 20));

        jprice.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 190, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cylinder Volume");
        jLabel8.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 140, 20));

        jcyl.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jcyl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcylActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jcyl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 190, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Color");
        jLabel9.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, 20));

        jcol.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jcol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcolActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 190, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fuel Type");
        jLabel10.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 140, 20));

        jfuel.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jfuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfuelActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jfuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 190, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Steering");
        jLabel11.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 140, 20));

        jen.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Power Steering", "Standard Steering" }));
        jen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 130, -1));

        jLabel12.setFont(new java.awt.Font("Candara", 3, 19)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Capacity");
        jLabel12.setPreferredSize(new java.awt.Dimension(207, 25));
        jDesktopPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 140, 20));

        jclutch.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jclutch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "5", "6", "7", "8", "9", "10" }));
        jclutch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclutchActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jclutch, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, -1));

        jLabel13.setFont(new java.awt.Font("Candara", 2, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Typing all mobil's data above  form to create and update in database");
        jDesktopPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jSimpan.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jSimpan.setText("Create");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 285, -1, -1));

        jUbah.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jUbah.setText("Update");
        jUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUbahActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 285, 70, -1));

        jDelete.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 285, -1, -1));

        Refresh.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, -1, -1));

        jLabel14.setFont(new java.awt.Font("Candara", 2, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Searching and deleting  motor's data depending by serial number");
        jDesktopPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jCarii.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jDesktopPane1.add(jCarii, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 285, 210, -1));

        jCari.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jCari.setText("Search");
        jCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCariActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 285, 70, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 820, 150));

        jMenuBar1.setBackground(new java.awt.Color(51, 255, 51));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
        if(
        jserial.getText().equals("") || 
        jbody.getText().equals("") || 
        jengine.getText().equals("") || 
        jtipe.getText().equals("") || 
        jmerk.getText().equals("") || 
        jcyl.getText().equals("") || 
        jcol.getText().equals("") || 
        jfuel.getText().equals("")|| 
        jprod.getText().equals("")|| 
        jprice.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DATA ENTRY INCOMPLETE !!!");
        }else{
            simpan();
        }
        kosong();
        dataTable();
    }//GEN-LAST:event_jSimpanActionPerformed

    private void jUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbahActionPerformed
        if(
        jserial.getText().equals("") || 
        jbody.getText().equals("") || 
        jengine.getText().equals("") || 
        jtipe.getText().equals("") || 
        jmerk.getText().equals("") || 
        jcyl.getText().equals("") || 
        jcol.getText().equals("") || 
        jfuel.getText().equals("")|| 
        jprod.getText().equals("")|| 
        jprice.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DATA ENTRY INCOMPLETE !!!");
        }else{
            update_data();
        }
        kosong();
        dataTable();
    }//GEN-LAST:event_jUbahActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        if(jCarii.getText().equals("")){
            JOptionPane.showMessageDialog(null, "FIELD IS EMPTY !!!");
        }else{
            hapus_data();
            JOptionPane.showMessageDialog(null, "DATA FOUND");
        }
        dataTable();
        kosong();
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCariActionPerformed
        if(jCarii.getText().equals("")){
            JOptionPane.showMessageDialog(null, "FIELD IS EMPTY !!!");
            dataTable();
        }else{
            cari();
            JOptionPane.showMessageDialog(null, "DATA FOUND");
        }
        kosong();
    }//GEN-LAST:event_jCariActionPerformed

    private void jcylActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcylActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcylActionPerformed

    private void jcolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcolActionPerformed

    private void jfuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfuelActionPerformed

    private void jenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenActionPerformed

    private void jclutchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclutchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jclutchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if (i>=0){
            jserial.setText (dtm.getValueAt(i, 0).toString());
            jbody.setText(dtm.getValueAt(i, 1).toString());
            jengine.setText(dtm.getValueAt(i, 2).toString());
            jtipe.setText(dtm.getValueAt(i, 3).toString());
            jmerk.setText(dtm.getValueAt(i, 4).toString());
            jcyl.setText(dtm.getValueAt(i, 5).toString());
            jcol.setText(dtm.getValueAt(i, 6).toString());
            jfuel.setText(dtm.getValueAt(i, 7).toString());
            jen.setSelectedItem(dtm.getValueAt(i, 8).toString());
            jclutch.setSelectedItem(dtm.getValueAt(i, 9).toString());
            jprod.setText(dtm.getValueAt(i, 10).toString());
            jprice.setText(dtm.getValueAt(i, 11).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        dataTable();
        kosong();
    }//GEN-LAST:event_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            new Mobil().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton jCari;
    private javax.swing.JTextField jCarii;
    private javax.swing.JButton jDelete;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUbah;
    private javax.swing.JTextField jbody;
    private javax.swing.JComboBox<String> jclutch;
    private javax.swing.JTextField jcol;
    private javax.swing.JTextField jcyl;
    private javax.swing.JComboBox<String> jen;
    private javax.swing.JTextField jengine;
    private javax.swing.JTextField jfuel;
    private javax.swing.JTextField jmerk;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField jprod;
    private javax.swing.JTextField jserial;
    private javax.swing.JTextField jtipe;
    // End of variables declaration//GEN-END:variables

    public void kosong(){
        jmerk.setText("");
        jserial.setText("");
        jbody.setText("");
        jengine.setText("");
        jtipe.setText("");
        jprod.setText("");
        jprice.setText("");
        jcyl.setText("");
        jcol.setText("");
        jfuel.setText("");
        jen.setSelectedItem("");
        jclutch.setSelectedItem("");
        jCarii.setText("");
    }
    
    public void dataTable(){
        dtm = new DefaultTableModel();
        dtm.addColumn("Serial Number");
        dtm.addColumn("Body Number");
        dtm.addColumn("Engine Number");
        dtm.addColumn("Type");
        dtm.addColumn("Merk");
        dtm.addColumn("Cylinder Volume");
        dtm.addColumn("Color");
        dtm.addColumn("Fuel");
        dtm.addColumn("Steering");
        dtm.addColumn("Capacity");
        dtm.addColumn("Production Date");
        dtm.addColumn("Price");
        
        jTable1.setModel(dtm);
        try{
            db.koneksiDatabase(); 
            String sql = "Select * From mobil order by serial asc";    
            st = db.getKoneksi().createStatement();
            ResultSet motor = st.executeQuery(sql);  
            
            while(motor.next()){
                dtm.addRow(new Object[]{
                    motor.getString("serial"),
                    motor.getString("body_num"),
                    motor.getString("engine_num"),
                    motor.getString("type"),
                    motor.getString("merk"),
                    motor.getString("cylinder_vol"),
                    motor.getString("color"),
                    motor.getString("fuel"),
                    motor.getString("steering"),
                    motor.getString("capacity"),
                    motor.getString("p_date"),
                    motor.getString("price")
                });
                    jTable1.setModel(dtm);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATA IS FAILED TO SHOWING");
        }
    }
    
    private void simpan(){
            try {
                String sql = "INSERT INTO mobil VALUES ('"+jserial.getText()+"','"+jbody.getText()+"','"+jengine.getText()+"','"+jtipe.getText()+"','"+jmerk.getText()+"','"+jcyl.getText()+"','"+jcol.getText()+"','"+jfuel.getText()+"','"+jen.getSelectedItem()+"','"+jclutch.getSelectedItem()+"','"+jprod.getText()+"','"+jprice.getText()+"')";  
                st = db.getKoneksi().createStatement();
                st.executeUpdate(sql); 
                st.close();
                JOptionPane.showMessageDialog(null, "INPUT DATA IS SUCCESSFUL");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "INPUT DATA IS FAILED");
            }
        }
    
    private void cari(){
        dtm = new DefaultTableModel();
        dtm.addColumn("Serial Number");
        dtm.addColumn("Body Number");
        dtm.addColumn("Engine Number");
        dtm.addColumn("Type");
        dtm.addColumn("Merk");
        dtm.addColumn("Cylinder Volume");
        dtm.addColumn("Color");
        dtm.addColumn("Fuel");
        dtm.addColumn("Steering");
        dtm.addColumn("Capacity");
        dtm.addColumn("Production Date");
        dtm.addColumn("Price");
        
        jTable1.setModel(dtm);
        try{
            db.koneksiDatabase(); 
            String sql = "Select * From mobil WHERE serial like '%"+jCarii.getText()+"%' order by serial asc";
            st = db.getKoneksi().createStatement();
            ResultSet motor = st.executeQuery(sql);  
            
            while(motor.next()){
                dtm.addRow(new Object[]{
                    motor.getString("serial"),
                    motor.getString("body_num"),
                    motor.getString("engine_num"),
                    motor.getString("type"),
                    motor.getString("merk"),
                    motor.getString("cylinder_vol"),
                    motor.getString("color"),
                    motor.getString("fuel"),
                    motor.getString("steering"),
                    motor.getString("capacity"),
                    motor.getString("p_date"),
                    motor.getString("price")
                });
                    jTable1.setModel(dtm);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO ITEMS MATCH YOU SEARCH");
        }
    }
    
    private void update_data() {
        int yes = JOptionPane.showConfirmDialog(Mobil.this,"Are you sure you want to updating that data?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (yes==0) {
            try{
                db.koneksiDatabase();
                String sql = "UPDATE mobil SET body_num='"+jbody.getText()+"',engine_num='"+jengine.getText()+"',type='"+jtipe.getText()+"',merk='"+jmerk.getText()+"',cylinder_vol='"+jcyl.getText()+"',color='"+jcol.getText()+"',fuel='"+jfuel.getText()+"',steering='"+jen.getSelectedItem()+"',capacity='"+jclutch.getSelectedItem()+"',p_date='"+jprod.getText()+"',price='"+jprice.getText()+"' WHERE serial='"+jserial.getText()+"'";  

                st = db.getKoneksi().createStatement();
                st.executeUpdate(sql); 
                st.close();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "UPDATE DATA IS FAILED");
            }
        }
    }
    
    private void hapus_data() {
        int yes = JOptionPane.showConfirmDialog(Mobil.this,"Are you sure you want to deleting data?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (yes==0) {
            try {
                String sql = "DELETE FROM mobil WHERE serial='"+jCarii.getText()+"'";
                st = db.getKoneksi().createStatement();
                st.executeUpdate(sql);
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "NO ITEMS MATCH YOU SEARCH");
            }
        }
    }
}
