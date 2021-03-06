package ui.admin;

import model.User;
import database.Koneksi;
import database.SmartDatabase;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ui.user.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.Login;

public class DashboardAdmin extends javax.swing.JFrame {

    private SmartDatabase database;
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rst;
    private DefaultTableModel model;
    private User dataUser = new User();
    private final String status = "Masih diproses";
    private final String link = "-";

    public DashboardAdmin(String pwd) {
        initComponents();
        //menginputkan data ke setter
        dataUser.setPassword(pwd);
        //customisasi tabel
        tbDashboard.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tbDashboard.getTableHeader().setOpaque(false);
        tbDashboard.getTableHeader().setBackground(new Color(87, 87, 87));
        tbDashboard.getTableHeader().setForeground(new Color(255, 255, 255));
        tbDashboard.setRowHeight(25);
        //memanggil method tampil dataDashboard
        tampilDataDashboard();
        showNotif();
    }


    private void tampilDataDashboard() {
        model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama Surat");
        model.addColumn("Nama yang mengajukan");
        model.addColumn("NIK");
        model.addColumn("Tanggal Surat");
        model.addColumn("Keperluan");
        model.addColumn("Status");
        model.addColumn("Link Surat");

        try {
            int no = 1;
             //melakukan koneksi ke database
            database = new SmartDatabase();
            conn = Koneksi.koneksi();
            //menyiapkan statement & memeanggil method queryAllSuratPengantarWarga()
            pst = conn.prepareStatement(database.queryAllSuratPengantarWarga());
            rst = pst.executeQuery(); //eksekusi query
            
             //mengambil semua data sesuai nama kolom yang diambil 
            while (rst.next()) {
                model.addRow(new Object[]{
                    no++,
                    rst.getString("nama_surat"),
                    rst.getString("nama"),
                    rst.getString("nik"),
                    rst.getString("tanggal_surat"),
                    rst.getString("keperluan"),
                    rst.getString("status"),
                    rst.getString("link_surat")
                });
            }
            tbDashboard.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cariNama() {
        model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama Surat");
        model.addColumn("Nama yang mengajukan");
        model.addColumn("NIK");
        model.addColumn("Tanggal Surat");
        model.addColumn("Keperluan");
        model.addColumn("Status");
        model.addColumn("Link Surat");
        try {
            int no = 1;
             //melakukan koneksi ke database
            database = new SmartDatabase();
            conn = Koneksi.koneksi();
            //menyiapkan statement & memeanggil method queryByNameDashboardAdmin()
            pst = conn.prepareStatement(database.queryByNameDashboardAdmin());
            pst.setString(1, edtCari.getText());
            rst = pst.executeQuery(); //eksekusi query

            //mengambil semua data sesuai nama kolom yang diambil 
            while (rst.next()) {
                model.addRow(new Object[]{
                    no++,
                    rst.getString("nama_surat"),
                    rst.getString("nama"),
                    rst.getString("nik"),
                    rst.getString("tanggal_surat"),
                    rst.getString("keperluan"),
                    rst.getString("status"),
                    rst.getString("link_surat")});
            }
            tbDashboard.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showNotif(){
        try{
            //melakukan koneksi ke database
            database = new SmartDatabase();
            conn = Koneksi.koneksi();
            //menyiapkan statement & memeanggil method queryByNameDashboardAdmin()
            pst = conn.prepareStatement(database.queryNotif(status,link));
            rst = pst.executeQuery(); //eksekusi query
            
            if (rst.next()) {
                edtCount.setText(rst.getString("count"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
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
        btnClose = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDashboard = new javax.swing.JTable();
        edtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JLabel();
        edtCount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JLabel();
        btnDataWarga = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnProfile = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\icon close.png")); // NOI18N

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 10, 40, 40));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\icon minimize.png")); // NOI18N

        javax.swing.GroupLayout btnMinimizeLayout = new javax.swing.GroupLayout(btnMinimize);
        btnMinimize.setLayout(btnMinimizeLayout);
        btnMinimizeLayout.setHorizontalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMinimizeLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 10, 40, 40));

        tbDashboard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Surat", "Nama Surat", "Nama yang mengajukan", "NIK", "Tanggal Surat", "Keperluan", "Status", "Link Surat"
            }
        ));
        tbDashboard.setGridColor(new java.awt.Color(196, 196, 196));
        tbDashboard.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbDashboard.setRowHeight(25);
        tbDashboard.setSelectionBackground(new java.awt.Color(134, 231, 254));
        tbDashboard.setShowVerticalLines(false);
        tbDashboard.getTableHeader().setReorderingAllowed(false);
        tbDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDashboardMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDashboard);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 950, 560));

        edtCari.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edtCari.setText("Cari Nama");
        edtCari.setBorder(null);
        edtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCariActionPerformed(evt);
            }
        });
        jPanel1.add(edtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 200, 40));

        btnCari.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\search_white.png")); // NOI18N
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, -1, -1));

        edtCount.setEditable(false);
        edtCount.setBackground(new java.awt.Color(255, 255, 255));
        edtCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        edtCount.setForeground(new java.awt.Color(255, 0, 0));
        edtCount.setText("0");
        edtCount.setBorder(null);
        edtCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCountActionPerformed(evt);
            }
        });
        jPanel1.add(edtCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 30, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\Daftar warga yang mengajukan.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(104, 104, 104));

        btnDashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\btnDashboard_blue.png")); // NOI18N
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnDashboard)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnDashboard)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 30));

        btnDataWarga.setBackground(new java.awt.Color(104, 104, 104));
        btnDataWarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDataWargaMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\btnDataWarga.png")); // NOI18N

        javax.swing.GroupLayout btnDataWargaLayout = new javax.swing.GroupLayout(btnDataWarga);
        btnDataWarga.setLayout(btnDataWargaLayout);
        btnDataWargaLayout.setHorizontalGroup(
            btnDataWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDataWargaLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnDataWargaLayout.setVerticalGroup(
            btnDataWargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDataWargaLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btnDataWarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 191, 210, 40));

        btnProfile.setBackground(new java.awt.Color(104, 104, 104));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\btnProfile_white.png")); // NOI18N

        javax.swing.GroupLayout btnProfileLayout = new javax.swing.GroupLayout(btnProfile);
        btnProfile.setLayout(btnProfileLayout);
        btnProfileLayout.setHorizontalGroup(
            btnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfileLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnProfileLayout.setVerticalGroup(
            btnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfileLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 40));

        btnLogOut.setBackground(new java.awt.Color(104, 104, 104));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\log out.png")); // NOI18N

        javax.swing.GroupLayout btnLogOutLayout = new javax.swing.GroupLayout(btnLogOut);
        btnLogOut.setLayout(btnLogOutLayout);
        btnLogOutLayout.setHorizontalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogOutLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnLogOutLayout.setVerticalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogOutLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\frame.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnDataWargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataWargaMouseClicked
        new ListDataWarga(dataUser.getPassword()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDataWargaMouseClicked

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        new ProfileAdmin(dataUser.getPassword()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfileMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        JOptionPane jOptionPane = new JOptionPane();
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin LOG OUT?");

        switch (confirm) {
            case JOptionPane.YES_OPTION:
                new Login().setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Anda telah Log out");
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void tbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDashboardMouseClicked
        int baris = tbDashboard.rowAtPoint(evt.getPoint());
        
        String nama = tbDashboard.getValueAt(baris, 2).toString();
        String nik = tbDashboard.getValueAt(baris, 3).toString();
        
        String keperluan = tbDashboard.getValueAt(baris, 5).toString();
        String status = tbDashboard.getValueAt(baris, 6).toString();
        String linkSurat = tbDashboard.getValueAt(baris, 7).toString();

        Konfirmasi konfirmasi = new Konfirmasi(nama,nik,keperluan, status, linkSurat);
        konfirmasi.setVisible(true);
    }//GEN-LAST:event_tbDashboardMouseClicked

    private void edtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCariActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        cariNama();
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        tampilDataDashboard();
        showNotif();
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void edtCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCountActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JPanel btnClose;
    private javax.swing.JLabel btnDashboard;
    private javax.swing.JPanel btnDataWarga;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnProfile;
    private javax.swing.JTextField edtCari;
    private javax.swing.JTextField edtCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDashboard;
    // End of variables declaration//GEN-END:variables
}
