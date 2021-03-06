package ui;

import model.Domisili;
import model.User;
import database.Koneksi;
import database.SmartDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import launcher.Launcher;

public class RegisterDomisili extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement pst;
    private Domisili dataDom;
    private SmartDatabase database;
    

    public RegisterDomisili() {
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

        edtProvinsi = new javax.swing.JTextField();
        edtKota = new javax.swing.JTextField();
        edtKecamatan = new javax.swing.JTextField();
        edtKelurahan = new javax.swing.JTextField();
        edtKodeDomisili = new javax.swing.JTextField();
        edtAlamat = new javax.swing.JTextField();
        edtRT = new javax.swing.JTextField();
        edtRW = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JPanel();
        btnRegister = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edtProvinsi.setBackground(new java.awt.Color(87, 87, 87));
        edtProvinsi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtProvinsi.setForeground(new java.awt.Color(255, 255, 255));
        edtProvinsi.setBorder(null);
        getContentPane().add(edtProvinsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 550, 50));

        edtKota.setBackground(new java.awt.Color(87, 87, 87));
        edtKota.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtKota.setForeground(new java.awt.Color(255, 255, 255));
        edtKota.setBorder(null);
        getContentPane().add(edtKota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 550, 50));

        edtKecamatan.setBackground(new java.awt.Color(87, 87, 87));
        edtKecamatan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtKecamatan.setForeground(new java.awt.Color(255, 255, 255));
        edtKecamatan.setBorder(null);
        getContentPane().add(edtKecamatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 550, 50));

        edtKelurahan.setBackground(new java.awt.Color(87, 87, 87));
        edtKelurahan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtKelurahan.setForeground(new java.awt.Color(255, 255, 255));
        edtKelurahan.setBorder(null);
        getContentPane().add(edtKelurahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 310, 50));

        edtKodeDomisili.setBackground(new java.awt.Color(87, 87, 87));
        edtKodeDomisili.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtKodeDomisili.setForeground(new java.awt.Color(255, 255, 255));
        edtKodeDomisili.setBorder(null);
        edtKodeDomisili.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtKodeDomisiliMouseClicked(evt);
            }
        });
        getContentPane().add(edtKodeDomisili, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 190, 50));

        edtAlamat.setBackground(new java.awt.Color(87, 87, 87));
        edtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtAlamat.setForeground(new java.awt.Color(255, 255, 255));
        edtAlamat.setBorder(null);
        getContentPane().add(edtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 550, 50));

        edtRT.setBackground(new java.awt.Color(87, 87, 87));
        edtRT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtRT.setForeground(new java.awt.Color(255, 255, 255));
        edtRT.setBorder(null);
        getContentPane().add(edtRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 90, 50));

        edtRW.setBackground(new java.awt.Color(87, 87, 87));
        edtRW.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        edtRW.setForeground(new java.awt.Color(255, 255, 255));
        edtRW.setBorder(null);
        getContentPane().add(edtRW, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 680, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\Registrasi Domisili.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, 40));

        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnMinimizeLayout = new javax.swing.GroupLayout(btnMinimize);
        btnMinimize.setLayout(btnMinimizeLayout);
        btnMinimizeLayout.setHorizontalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 30, 30));

        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegisterLayout = new javax.swing.GroupLayout(btnRegister);
        btnRegister.setLayout(btnRegisterLayout);
        btnRegisterLayout.setHorizontalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        btnRegisterLayout.setVerticalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 270, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(EXIT_ON_CLOSE);
        Launcher ll = new Launcher();

    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        String provinsi = edtProvinsi.getText().toString().trim();
        String kota = edtKota.getText().toString().trim();
        String kecamatan = edtKecamatan.getText().toString().trim();
        String kelurahan = edtKelurahan.getText().toString().trim();
        String kodeDomisili = edtKodeDomisili.getText().toString().trim();
        String alamat = edtAlamat.getText().toString().trim();
        String rt = edtRT.getText().toString().trim();
        String rw = edtRW.getText().toString().trim();

        dataDom = new Domisili(kodeDomisili, kota, provinsi, kecamatan, alamat, kelurahan, rt, rw);

        //jika ada kolom yang kosong
        if (kodeDomisili.equals("") || provinsi.equals("") || kota.equals("")
                    || kecamatan.equals("") || kelurahan.equals("")
                    || alamat.equals("") || rt.equals("") || rw.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Kolom harus dilengkapi");
        } else { //jika tidak
            try {
                database = new SmartDatabase();
                conn = Koneksi.koneksi();
                //menyiapkan statement & memeanggil method insertDataDomisili(dataDom)
                pst = conn.prepareStatement(database.insertDataDomisili(dataDom));

                int confirm = JOptionPane.showConfirmDialog(this, "Apakah data domisili anda telah sesuai?");

                switch (confirm) {
                    case JOptionPane.YES_OPTION:
                        pst.execute(); //eksekusi query
                        Register rg = new Register(kodeDomisili);
                        rg.setVisible(true);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this, "Data Domisili berhasil di input");
                    case JOptionPane.NO_OPTION:
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void edtKodeDomisiliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtKodeDomisiliMouseClicked
        JOptionPane.showMessageDialog(rootPane, "Urutan pengisian Kode dimisili :\n RT-RW-No.Rumah-No.urut di KK");
    }//GEN-LAST:event_edtKodeDomisiliMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterDomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDomisili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDomisili().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnRegister;
    private javax.swing.JTextField edtAlamat;
    private javax.swing.JTextField edtKecamatan;
    private javax.swing.JTextField edtKelurahan;
    private javax.swing.JTextField edtKodeDomisili;
    private javax.swing.JTextField edtKota;
    private javax.swing.JTextField edtProvinsi;
    private javax.swing.JTextField edtRT;
    private javax.swing.JTextField edtRW;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
