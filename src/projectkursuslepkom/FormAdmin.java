/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkursuslepkom;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author risnawan
 */
public class FormAdmin extends javax.swing.JFrame {

    /**
     * Creates new form HalamanAdmin
     */
    public FormAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDataKaryawan = new javax.swing.JButton();
        btnInformasiFlora = new javax.swing.JButton();
        btnDaftarBiayaMasuk = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInformasiFauna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kebun Binatang Ragunan");
        setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        btnDataKaryawan.setBackground(new java.awt.Color(52, 152, 219));
        btnDataKaryawan.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnDataKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btnDataKaryawan.setText("Karyawan");
        btnDataKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDataKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataKaryawanActionPerformed(evt);
            }
        });

        btnInformasiFlora.setBackground(new java.awt.Color(52, 152, 219));
        btnInformasiFlora.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnInformasiFlora.setForeground(new java.awt.Color(255, 255, 255));
        btnInformasiFlora.setText("Informasi Flora");
        btnInformasiFlora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformasiFloraActionPerformed(evt);
            }
        });

        btnDaftarBiayaMasuk.setBackground(new java.awt.Color(52, 152, 219));
        btnDaftarBiayaMasuk.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnDaftarBiayaMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftarBiayaMasuk.setText("Daftar Biaya Masuk");
        btnDaftarBiayaMasuk.setMaximumSize(new java.awt.Dimension(125, 40));
        btnDaftarBiayaMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarBiayaMasukActionPerformed(evt);
            }
        });

        btnLaporan.setBackground(new java.awt.Color(52, 152, 219));
        btnLaporan.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnLaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporan.setText("Laporan");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data");

        btnInformasiFauna.setBackground(new java.awt.Color(52, 152, 219));
        btnInformasiFauna.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnInformasiFauna.setForeground(new java.awt.Color(255, 255, 255));
        btnInformasiFauna.setText("Informasi Fauna");
        btnInformasiFauna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformasiFaunaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDaftarBiayaMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInformasiFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInformasiFauna, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformasiFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformasiFauna, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDaftarBiayaMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataKaryawanActionPerformed
        // TODO add your handling code here:
        new FormPegawai().show();
        this.dispose();
    }//GEN-LAST:event_btnDataKaryawanActionPerformed

    private void btnInformasiFloraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformasiFloraActionPerformed
        // TODO add your handling code here:
//        new FormInformasFloraFaunai().show();
        new FormFlora().show();
        this.dispose();
    }//GEN-LAST:event_btnInformasiFloraActionPerformed

    private void btnDaftarBiayaMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarBiayaMasukActionPerformed
        // TODO add your handling code here:
        new SetTiket().show();
        this.dispose();
    }//GEN-LAST:event_btnDaftarBiayaMasukActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, 
            "Apa kamu yakin ingin kembali ke halaman login?", "Sungguh?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            new FormLogin().show();
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnInformasiFaunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformasiFaunaActionPerformed
        // TODO add your handling code here:
        new FormFauna().show();
        this.dispose();
    }//GEN-LAST:event_btnInformasiFaunaActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftarBiayaMasuk;
    private javax.swing.JButton btnDataKaryawan;
    private javax.swing.JButton btnInformasiFauna;
    private javax.swing.JButton btnInformasiFlora;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
