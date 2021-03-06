/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;

import static NakamFood.NakamAdmin.url;
import static NakamFood.NakamEdit.noTelp;
import static NakamFood.NakamEdit.url;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NakamRiwayat extends javax.swing.JFrame {

    static String url = "jdbc:sqlserver://localhost:1433;databaseName=nakam_food;integratedSecurity=true";
    static String userName = "";
    static String password = "";

    //Connect to DB
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement st;
    Statement stt;

    static String noTelp;

    public NakamRiwayat() {
        initComponents();
        show_pesanan();
        setVisible(true);

    }

    public NakamRiwayat(String s) {
        noTelp = s;
        initComponents();
        show_pesanan();
        setVisible(true);

    }

    public ArrayList<Pesanan> pesananList() {
        ArrayList<Pesanan> orderList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM pesanan WHERE telepon_pelanggan = ?";
            st = conn.prepareStatement(query);
            st.setString(1, noTelp);
            ResultSet rs = st.executeQuery();
            Pesanan pesanan;
            while (rs.next()) {
                pesanan = new Pesanan(rs.getString("nama_tempat"), rs.getString("alamat_pesanan"),
                        rs.getString("stempel_waktu"));
                orderList.add(pesanan);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        return orderList;
    }

    public void show_pesanan() {

        ArrayList<Pesanan> list = pesananList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Pesanan.getModel();
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getNamaToko();
            row[1] = list.get(i).getAlamatTujuan();
            row[2] = list.get(i).getTanggal();
            model.addRow(row);
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

        main1 = new NakamFood.Main();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Pesanan = new javax.swing.JTable();
        jbtBack = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_Display_Pesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_Display_Pesanan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable_Display_Pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Toko", "Alamat Tujuan", "Waktu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Display_Pesanan.setFocusTraversalPolicyProvider(true);
        jTable_Display_Pesanan.setGridColor(new java.awt.Color(0, 0, 0));
        jTable_Display_Pesanan.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable_Display_Pesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_PesananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Pesanan);

        jbtBack.setBackground(new java.awt.Color(255, 153, 0));
        jbtBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jbtBack.setForeground(new java.awt.Color(255, 255, 255));
        jbtBack.setText("Kembali");
        jbtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBackActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("Riwayat Pemesanan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jbtBack.getAccessibleContext().setAccessibleName("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        // TODO add your handling code here:
        NakamPelanggan info = new NakamPelanggan(noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jTable_Display_PesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_PesananMouseClicked
        int indeks = jTable_Display_Pesanan.getSelectedRow();
        try {
            this.lihatBarisOrder(indeks, this.getConnection(url));
        } catch (SQLException ex) {
            Logger.getLogger(NakamRiwayat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NakamRiwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable_Display_PesananMouseClicked

    public ArrayList<Order> getDaftarOrder(Connection conn) {
        ArrayList<Order> ordList = new ArrayList<>();
        try {
            String query = "SELECT * FROM pesanan";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            Order ord;
            while (rs.next()) {
                ord = new Order(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                ordList.add(ord);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NakamAdmin.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return ordList;
    }

    public void lihatBarisOrder(int indeks, Connection conn) {
        String tempat = this.getDaftarOrder(conn).get(indeks).getTempat();
        String produk = this.getDaftarOrder(conn).get(indeks).getProduk();
        String kuantitas = this.getDaftarOrder(conn).get(indeks).getKuantitas();
        String waktu = this.getDaftarOrder(conn).get(indeks).getWaktu();
        String alamat = this.getDaftarOrder(conn).get(indeks).getAlamat();
        
        NakamDetailPesanan info = new NakamDetailPesanan(tempat,produk,kuantitas,waktu,alamat);
        info.setVisible(true);
        this.dispose();
    }

    public Connection getConnection(String url)
            throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);
            return conn;

        } catch (SQLException ex) {
            Logger.getLogger(NakamAdmin.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
            return null;
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
            java.util.logging.Logger.getLogger(NakamRiwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NakamRiwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NakamRiwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NakamRiwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NakamRiwayat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Pesanan;
    private javax.swing.JButton jbtBack;
    private NakamFood.Main main1;
    // End of variables declaration//GEN-END:variables
}
