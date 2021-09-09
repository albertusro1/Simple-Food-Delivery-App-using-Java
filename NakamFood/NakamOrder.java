package NakamFood;

import static NakamFood.NakamPelanggan.url;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NakamOrder extends javax.swing.JFrame {

    static String url = "jdbc:sqlserver://localhost:1433;databaseName=nakam_food;integratedSecurity=true";
    static String userName = "";
    static String password = "";

    ArrayList<Integer> idProd;
    ArrayList<Integer> cntProd;
    ArrayList<String> namaProd;
    Integer Harga;

    String alamatTujuan;
    String resto;
    String telpPel;
    String drivID;
    Integer idPesanan;
    //Connect to DB
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement prepState;
    Statement state;

    public NakamOrder(ArrayList<Integer> idProd, ArrayList<Integer> cntProd, ArrayList<String> namaProd,
            String resto, String telpPel, Integer harga, String alamatTujuan) throws SQLException {
        this.idProd = idProd;
        this.cntProd = cntProd;
        this.namaProd = namaProd;
        this.resto = resto;
        this.telpPel = telpPel;
        this.Harga = harga;
        this.alamatTujuan = alamatTujuan;
        inisialisasi();
        jalankanDetail();
    }

    public NakamOrder() throws SQLException {
        inisialisasi();
    }

    public void inisialisasi() throws SQLException {
        initComponents();
        insertDriver();
        detailpesanan();
        boolean sukses;
        String q = "EXECUTE idCurrent";
        state = conn.createStatement();
        rs = state.executeQuery(q);
        while (rs.next()) {
            idPesanan = rs.getInt(1);
        }
        ++idPesanan;
        try {
            hargaSemua.setText(String.valueOf(Harga));
            conn = DriverManager.getConnection(url);

//            String query = "INSERT INTO pesanan(alamat_pesanan,telepon_pelanggan,id_driver,nama_tempat)\n" +
//"		VALUES(?, ?, ?, ?);";
            String query = "EXECUTE transaksi ?,?,?,?";
            prepState = conn.prepareStatement(query);

            prepState.setString(1, alamatTujuan);
            prepState.setString(2, telpPel);
            prepState.setInt(3, --x);
            prepState.setString(4, resto);
            // debug isi variabel jika tertukar
//            System.out.println("alamat: " + alamatTujuan);
//            System.out.println("telpPel: " + telpPel);
//            System.out.println("id Driver: " + x);
//            System.out.println("resto: " + resto);
            sukses = (prepState.executeUpdate() > 0);
//            System.out.println("sukses = " + sukses);
            x++;
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
            Logger.getLogger(NakamOrder.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            prepState.close();
        }
    }

    public void jalankanDetail() throws SQLException {
        try {
            // mengatur idpesanan
            int counter = 1;
            boolean sukses2;
//            String query = "INSERT INTO barang_pesanan VALUES (?,?,?,?,?,?);";
            String query = "EXECUTE transaksiDetail ?,?,?,?,?,?";
            prepState = conn.prepareStatement(query);
            for (int i = 0; i < namaProd.size(); i++) {
                if (cntProd.get(i) > 0) {
                    //-- Debug --//
//                    System.out.println("kuantiti : " + cntProd.get(i));
//                    System.out.println("komen : " + "-");
//                    System.out.println("cnt : " + counter);
//                    System.out.println("idpesan : " + idPesanan);
//                    System.out.println("idProdNama : " + idProd.get(i));
//                    System.out.println("resto : " + resto);
                    prepState.setInt(1, cntProd.get(i));
                    prepState.setString(2, "");
                    prepState.setInt(3, counter++);
                    prepState.setInt(4, idPesanan);
                    prepState.setInt(5, idProd.get(i));
                    prepState.setString(6, resto);
                    prepState.addBatch();
                }
            }
            prepState.executeBatch();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
            Logger.getLogger(NakamOrder.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            prepState.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelFud = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jlabelTelp = new javax.swing.JLabel();
        jlabelPlat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlabelNama = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hargaSemua = new javax.swing.JLabel();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jbtDone.setBackground(new java.awt.Color(51, 255, 0));
        jbtDone.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jbtDone.setForeground(new java.awt.Color(255, 255, 255));
        jbtDone.setText("Done !");
        jbtDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDoneActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabelFud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelFud);
        if (tabelFud.getColumnModel().getColumnCount() > 0) {
            tabelFud.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("No telp       :");

        jlabelTelp.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jlabelTelp.setForeground(new java.awt.Color(0, 102, 255));

        jlabelPlat.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jlabelPlat.setForeground(new java.awt.Color(0, 102, 255));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Plat No       :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Nama          :");

        jlabelNama.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jlabelNama.setForeground(new java.awt.Color(0, 102, 255));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Yeay , Kamu Telah Mendapatkan Driver .");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.driver.png"))); // NOI18N
        jButton1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel6.setText("Detail Pesananmu :");

        jLabel1.setText("Harga: ");

        hargaSemua.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jlabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jlabelPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jlabelTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargaSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtDone)
                .addGap(95, 95, 95))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabelTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtDone)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargaSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDoneActionPerformed
        // TODO add your handling code here:
        NakamPelanggan info = new NakamPelanggan(NakamLogin.telp_pelanggan);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtDoneActionPerformed

    static int x = 1;

    public void insertDriver() {
        try {
            conn = DriverManager.getConnection(url);
            String query = "SELECT nama_depan, plat_nomor, telepon_driver FROM driver where id_driver like ?";
            prepState = conn.prepareStatement(query);

            prepState.setString(1, String.valueOf(x++));
            rs = prepState.executeQuery();
            while (rs.next()) {
                String name = rs.getString("nama_depan");
                jlabelNama.setText(name);
                String plat = rs.getString("plat_nomor");
                jlabelPlat.setText(plat);
                String telp = rs.getString("telepon_driver");
                jlabelTelp.setText(telp);
            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void detailpesanan() {

        DefaultTableModel model = (DefaultTableModel) tabelFud.getModel();
        model.setRowCount(0);

        int counter = 1;
        for (int i = 0; i < namaProd.size(); i++) {
            int jmlMakan = cntProd.get(i);
            if (jmlMakan > 0) {
                model.addRow(new Object[]{counter++, namaProd.get(i), jmlMakan});
            }
        }

    }

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
            java.util.logging.Logger.getLogger(NakamOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NakamOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NakamOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NakamOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NakamOrder().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NakamOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hargaSemua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtDone;
    private javax.swing.JLabel jlabelNama;
    private javax.swing.JLabel jlabelPlat;
    private javax.swing.JLabel jlabelTelp;
    private javax.swing.JTable tabelFud;
    // End of variables declaration//GEN-END:variables
}

//-- Kode Untuk belajar dari kesalahan --//
//            pesan = conn.prepareCall(query);
//            String q = "EXECUTE transaksi '" + alamatTujuan +"', '" + telpPel +"', " + (-1+x) +", '" + resto + "'";
//            System.out.println("q = " + q);
//            state = conn.createStatement();
//            state.executeUpdate(q);
//            //prepState = conn.prepareStatement(query);
