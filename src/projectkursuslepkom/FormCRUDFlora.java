/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkursuslepkom;

import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
//import java.io.BufferedInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.FileInputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;



/**
 *
 * @author risnawan
 */
public class FormCRUDFlora extends javax.swing.JFrame {

    Koneksi connect = new Koneksi();
    ResultSet data = null;
    String foto, dest;
    
//    static Socket s;
//    static DataInputStream din;
//    static DataOutputStream dout;    
//    FileInputStream fileInputStream = null;
//    BufferedInputStream bufferedInputStream = null;
//    OutputStream outputStream = null;
    
    public FormCRUDFlora() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lFoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbUnggah = new javax.swing.JButton();
        jbSimpan = new javax.swing.JButton();
        jbKembali = new javax.swing.JButton();
        txtIDF = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRingkasan = new javax.swing.JTextArea();
        txtTinggi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID Flora");

        jLabel2.setText("Nama Flora");

        lFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFoto.setToolTipText("");
        lFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Ringkasan");

        jLabel5.setText("Tinggi");

        jbUnggah.setText("Unggah Foto");
        jbUnggah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnggahActionPerformed(evt);
            }
        });

        jbSimpan.setText("Simpan");
        jbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSimpanActionPerformed(evt);
            }
        });

        jbKembali.setText("< Kembali");
        jbKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKembaliActionPerformed(evt);
            }
        });

        txtIDF.setFocusable(false);

        txtRingkasan.setColumns(20);
        txtRingkasan.setRows(5);
        jScrollPane1.setViewportView(txtRingkasan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(292, 292, 292))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jbUnggah))
                                        .addComponent(lFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jbSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbKembali)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jbUnggah)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addComponent(jbSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbKembali)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbUnggahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnggahActionPerformed
        // TODO add your handling code here:
        dest = "";
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                BufferedImage gambar = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(gambar);
                lFoto.setIcon(icon);
                Dimension imageSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
                lFoto.setPreferredSize(imageSize);
                lFoto.revalidate();
                lFoto.repaint();
                foto = file.getName();
                dest = file.getAbsolutePath();
            } catch (Exception ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
        
//        try
//        {
//            dout.writeUTF(foto);
//            /*
//            //Sender.send(2000, dest+"\\"+foto);
//            File file = new File (dest);
//            byte [] byteArray  = new byte [(int)file.length()];
//            fileInputStream = new FileInputStream(file);
//            bufferedInputStream = new BufferedInputStream(fileInputStream);
//            bufferedInputStream.read(byteArray,0,byteArray.length); // copied file into byteArray
//                
//                //sending file through socket
//                outputStream = s.getOutputStream();
//                System.out.println("Sending " + "( size: " + byteArray.length + " bytes)");
//                outputStream.write(byteArray,0,byteArray.length);			//copying byteArray to socket
//                outputStream.flush();										//flushing socket
//                System.out.println("Done.");
//            */
////                if (bufferedInputStream != null) bufferedInputStream.close();
////						if (outputStream != null) bufferedInputStream.close();
//        }
//        catch(Exception es)
//        {
//            System.out.println(es);
//        }		
//        //untuk copy file
//        File source = new File(dest);
//        File destini = new File("E:\\M Risnawan Budiato\\Kuliah\\semester 7\\ProjectKursusLepkom\\src\\projectkursuslepkom\\image\\"+foto);
//            try {
//                FileUtils.copyFile(source, destini);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            //tampilkan gambar
//            lFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectkursuslepkom/image/"+foto)));
    }//GEN-LAST:event_jbUnggahActionPerformed

    private void jbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSimpanActionPerformed
        // TODO add your handling code here:
        String id = txtIDF.getText();
        String nama = txtNama.getText();
        String tinggi = txtTinggi.getText();
        String ringkasan = txtRingkasan.getText();
        String query = "insert into flora values('"+id+"','"+nama+"','"+tinggi+"','"+ringkasan+"','"+foto+"')";
        
        try {
            connect.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "record telah berhasil dimasukkan");
            
            //untuk copy file
            File source = new File(dest);
            File destini = new File("C:\\XAMPP\\htdocs\\java\\image\\"+foto);
            try {
                FileUtils.copyFile(source, destini);
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan");
        }
        
    }//GEN-LAST:event_jbSimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtIDF.setText(AutoID());
    }//GEN-LAST:event_formWindowOpened

    private void jbKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKembaliActionPerformed
        // TODO add your handling code here:
        new FormFlora().show();
        this.dispose();
    }//GEN-LAST:event_jbKembaliActionPerformed

    public String AutoID(){
        String id = "0";
        int temp = 0;
        String query = "select id_flora from flora where id_flora order by id_flora desc limit 1";
        try {
            data = connect.getStatement().executeQuery(query);
            while(data.next())
            {
                id = data.getString("id_flora");
            }
        } catch (Exception e) {
            System.out.println("Ada kesalahan ID");
        }
        temp = Integer.parseInt(id);
        temp = temp + 1;
        id = String.valueOf(temp);
        return id;
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
            java.util.logging.Logger.getLogger(FormCRUDFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCRUDFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCRUDFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCRUDFlora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCRUDFlora().setVisible(true);
            }
        });
        /* percobaan client server agar upload file jadi dinamis
        try
        {
            s = new Socket("127.0.0.1", 2000);
            dout = new DataOutputStream(s.getOutputStream());   
        }
        catch(Exception es)
        {   }
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbKembali;
    private javax.swing.JButton jbSimpan;
    private javax.swing.JButton jbUnggah;
    private javax.swing.JLabel lFoto;
    private static javax.swing.JTextField txtIDF;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextArea txtRingkasan;
    private javax.swing.JTextField txtTinggi;
    // End of variables declaration//GEN-END:variables
}
