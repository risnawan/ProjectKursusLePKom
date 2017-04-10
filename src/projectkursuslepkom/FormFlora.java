 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkursuslepkom;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author risnawan
 */
public class FormFlora extends javax.swing.JFrame {

    /**
     * Creates new form FormFlora
     */
    Koneksi connect = new Koneksi();
    ResultSet data = null;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    int selectedRowIndex;    
    
    public FormFlora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbTambah = new javax.swing.JButton();
        jbKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbEdit = new javax.swing.JButton();
        jbHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jTable1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "ID Flora", "Nama Flora", "Tinggi", "Ringkasan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbTambah.setBackground(new java.awt.Color(52, 152, 219));
        jbTambah.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jbTambah.setForeground(new java.awt.Color(255, 255, 255));
        jbTambah.setText("Tambah");
        jbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTambahActionPerformed(evt);
            }
        });

        jbKembali.setBackground(new java.awt.Color(52, 152, 219));
        jbKembali.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jbKembali.setForeground(new java.awt.Color(255, 255, 255));
        jbKembali.setText("< Kembali");
        jbKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKembaliActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(44, 62, 80));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Flora");

        jbEdit.setBackground(new java.awt.Color(52, 152, 219));
        jbEdit.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jbEdit.setForeground(new java.awt.Color(255, 255, 255));
        jbEdit.setText("Edit");
        jbEdit.setMaximumSize(new java.awt.Dimension(87, 27));
        jbEdit.setMinimumSize(new java.awt.Dimension(87, 27));
        jbEdit.setPreferredSize(new java.awt.Dimension(87, 27));
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbHapus.setBackground(new java.awt.Color(52, 152, 219));
        jbHapus.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jbHapus.setForeground(new java.awt.Color(255, 255, 255));
        jbHapus.setText("Hapus");
        jbHapus.setMaximumSize(new java.awt.Dimension(87, 27));
        jbHapus.setMinimumSize(new java.awt.Dimension(87, 27));
        jbHapus.setPreferredSize(new java.awt.Dimension(87, 27));
        jbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbKembali)
                        .addGap(202, 202, 202)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTambah)
                    .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jbKembali)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void jbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHapusActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0){
            if (JOptionPane.showConfirmDialog(null,
                    "Apa kamu yakin ingin mengahpus record tersebut?", "Sungguh?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                hapusRecord();
            }}
        else
             JOptionPane.showMessageDialog(null, "Sorot record terlebih dahulu");
    }//GEN-LAST:event_jbHapusActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0){
            new FormCRUDFlora().show();
            this.dispose();
            FormCRUDFlora.opsi = "edit";
            FormCRUDFlora.idFlora = model2.getValueAt(selectedRowIndex, 1).toString();
        }
        else
            JOptionPane.showMessageDialog(null, "Sorot record terlebih dahulu");
        
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKembaliActionPerformed
        // TODO add your handling code here:
        new FormAdmin().show();
        this.dispose();
    }//GEN-LAST:event_jbKembaliActionPerformed

    private void jbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTambahActionPerformed
        // TODO add your handling code here:
        FormCRUDFlora.opsi = "tambah";
        new FormCRUDFlora().show();
        this.dispose();
    }//GEN-LAST:event_jbTambahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        model2 = (DefaultTableModel)jTable1.getModel();
        selectedRowIndex = jTable1.getSelectedRow();
        String id = model2.getValueAt(selectedRowIndex, 1).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new FormAdmin().show();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    public void refresh(){
        int baris = 1;
        int i = 0;
        String query = "select * from flora";
        
        try {
            data = connect.getStatement().executeQuery(query);
            while(data.next())
            {
                baris += 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        String kj;
        String isi[][] = new String[baris][5];
        try {
            data = connect.getStatement().executeQuery(query);
            while(data.next()){
                isi[i][0] = String.valueOf(i+1);
                isi[i][1] = data.getString("id_flora");
                isi[i][2] = data.getString("nama");
                isi[i][3] = data.getString("tinggi");
                isi[i][4] = data.getString("ringkasan");
                i++;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        String namaKolom[] = {"No", "ID Flora", "Nama", "Tinggi", "Ringkasan"};
        DefaultTableModel model = new DefaultTableModel(isi, namaKolom);
        jTable1.setModel(model);
    }
    
    public void hapusRecord(){
        String query = "delete from flora where id_flora = "+ model2.getValueAt(selectedRowIndex, 1).toString();
        try {
            connect.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Record berhasil dihapus");
            refresh();
        } catch (Exception e) {
            System.out.println("Ada kesalahan");
        }
    }
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
            java.util.logging.Logger.getLogger(FormFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFlora().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbHapus;
    private javax.swing.JButton jbKembali;
    private javax.swing.JButton jbTambah;
    // End of variables declaration//GEN-END:variables
}
