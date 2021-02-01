package ui.user;

import model.User;
import database.Koneksi;
import database.SmartDatabase;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.Login;

public class DashboardUser extends javax.swing.JFrame {

    private DefaultTableModel model;
    private SmartDatabase database; 
    private Connection conn; 
    private PreparedStatement pst; 
    private ResultSet rst; 
    private User dataUser = new User();

    /**
     * Creates new form home
     */
    public DashboardUser(String input) {
        initComponents();
        //menginputkan data ke setter
        dataUser.setPassword(input);
        //customisasi tabel
        tbDsbUser.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
        tbDsbUser.getTableHeader().setOpaque(false);
        tbDsbUser.getTableHeader().setBackground(new Color(87, 87, 87));
        tbDsbUser.getTableHeader().setForeground(new Color(255, 255, 255));
        tbDsbUser.setRowHeight(25);
        //memanggil method tampil dataDashboard
        tampilDataDashboard();
    }

    public void tampilDataDashboard() {
        model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama Surat");
        model.addColumn("Link Surat");
        model.addColumn("Status");

        try {
            int no = 1;
            //melakukan koneksi ke database
            database = new SmartDatabase();
            conn = Koneksi.koneksi();
            //menyiapkan statement & memeanggil method queryAllSuratPengantarUser()
            pst = conn.prepareStatement(database.queryAllSuratPengantarUser());
            //memasukkan data inputan password ke dalam statement
            pst.setString(1, dataUser.getPassword());
            rst = pst.executeQuery();//eksekusi query

            //mengambil semua data nama,link,status pada database 
            while (rst.next()) {
                model.addRow(new Object[]{
                    no++,
                    rst.getString("nama_surat"),
                    rst.getString("link_surat"),
                    rst.getString("status")
                });
            }
            //data yang telah diambil diset kedalam tabel
            tbDsbUser.setModel(model);

        } catch (Exception e) {
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
        tbDsbUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnPengajuanSurat = new javax.swing.JPanel();
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 40, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 40, 40));

        tbDsbUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbDsbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama Surat", "Link Surat", "Status"
            }
        ));
        tbDsbUser.setFocusable(false);
        tbDsbUser.setGridColor(new java.awt.Color(196, 196, 196));
        tbDsbUser.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbDsbUser.setRowHeight(25);
        tbDsbUser.setSelectionBackground(new java.awt.Color(134, 231, 254));
        tbDsbUser.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tbDsbUser);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 950, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\pengajuan surat warga.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(104, 104, 104));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\btnDashboard_blue.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, 40));

        btnPengajuanSurat.setBackground(new java.awt.Color(104, 104, 104));
        btnPengajuanSurat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPengajuanSuratMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(104, 104, 104));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\btnPengajuanSurat_white.png")); // NOI18N

        javax.swing.GroupLayout btnPengajuanSuratLayout = new javax.swing.GroupLayout(btnPengajuanSurat);
        btnPengajuanSurat.setLayout(btnPengajuanSuratLayout);
        btnPengajuanSuratLayout.setHorizontalGroup(
            btnPengajuanSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPengajuanSuratLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnPengajuanSuratLayout.setVerticalGroup(
            btnPengajuanSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(btnPengajuanSurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 190, -1));

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
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnProfileLayout.setVerticalGroup(
            btnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel2.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 150, 40));

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

        jPanel2.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 340, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Figma project\\SMART RT RW\\frame.png")); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnPengajuanSuratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengajuanSuratMouseClicked
        new PengajuanSurat(dataUser.getPassword()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPengajuanSuratMouseClicked

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        new ProfileUser(dataUser.getPassword()).setVisible(true);
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
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                //new DashboardUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JPanel btnPengajuanSurat;
    private javax.swing.JPanel btnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDsbUser;
    // End of variables declaration//GEN-END:variables
}