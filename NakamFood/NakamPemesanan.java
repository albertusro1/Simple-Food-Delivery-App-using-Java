/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DBSS018
 */
public class NakamPemesanan extends javax.swing.JFrame {

    static String url = "jdbc:sqlserver://localhost:1433;databaseName=nakam_food;integratedSecurity=true";
    static String userName = "";
    static String password = "";
    int Opsi, neoOpsi;

    //Connect to DB
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement st;
    Statement stt;

    static String noTelp;

    /**
     * Creates new form NakamAdmin
     */
    public NakamPemesanan() {
        initComponents();

    }

    public NakamPemesanan(String s) {
        noTelp = s;
        initComponents();

    }

    public NakamPemesanan(int Opsi) {
        this.Opsi = Opsi;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Mcd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ayamMCD = new javax.swing.JButton();
        Pink = new javax.swing.JButton();
        donatAW = new javax.swing.JButton();
        floatBK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        aW = new javax.swing.JButton();
        BurgK = new javax.swing.JButton();
        pecelPink = new javax.swing.JButton();
        SBK = new javax.swing.JButton();
        KopiSBK = new javax.swing.JButton();
        search2 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbtQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Mcd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.MCD.png"))); // NOI18N
        Mcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                McdActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("Restoran");

        ayamMCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.batagor.png"))); // NOI18N
        ayamMCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayamMCDActionPerformed(evt);
            }
        });

        Pink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.download.png"))); // NOI18N
        Pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinkActionPerformed(evt);
            }
        });

        donatAW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.Donat.png"))); // NOI18N
        donatAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donatAWActionPerformed(evt);
            }
        });

        floatBK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.Red Chattime.png"))); // NOI18N
        floatBK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floatBKActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Paling Favorit");

        aW.setBackground(new java.awt.Color(255, 255, 255));
        aW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.AW.png"))); // NOI18N
        aW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aWActionPerformed(evt);
            }
        });

        BurgK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.ezgif.com-gif-maker.png"))); // NOI18N
        BurgK.setToolTipText("Burger King");
        BurgK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgKActionPerformed(evt);
            }
        });

        pecelPink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.pecel resize.jpg"))); // NOI18N
        pecelPink.setToolTipText("Pecel");
        pecelPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pecelPinkActionPerformed(evt);
            }
        });

        SBK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.starbucks.png"))); // NOI18N
        SBK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBKActionPerformed(evt);
            }
        });

        KopiSBK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.Strong Coffe.png"))); // NOI18N
        KopiSBK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KopiSBKActionPerformed(evt);
            }
        });

        search2.setBackground(new java.awt.Color(0, 51, 255));
        search2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        search2.setForeground(new java.awt.Color(255, 255, 255));
        search2.setText("More");
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 51, 255));
        search.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("More");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pecelPink, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(floatBK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ayamMCD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(donatAW, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KopiSBK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BurgK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mcd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aW, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SBK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ayamMCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(floatBK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pecelPink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donatAW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KopiSBK))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BurgK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mcd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aW, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SBK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search2)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NakamFood/z.icon.png"))); // NOI18N

        jbtQuit.setBackground(new java.awt.Color(255, 0, 0));
        jbtQuit.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jbtQuit.setForeground(new java.awt.Color(255, 255, 255));
        jbtQuit.setText("QUIT");
        jbtQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuitActionPerformed
        // TODO add your handling code here:
        NakamPelanggan info = new NakamPelanggan(noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtQuitActionPerformed

    private void ayamMCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayamMCDActionPerformed
        this.setPemesanan(2);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ayamMCDActionPerformed

    private void pecelPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pecelPinkActionPerformed
        this.setPemesanan(1);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_pecelPinkActionPerformed

    private void floatBKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floatBKActionPerformed
        this.setPemesanan(0);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        setPemesanan(0);
        this.dispose();
    }//GEN-LAST:event_floatBKActionPerformed

    private void donatAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donatAWActionPerformed
        this.setPemesanan(3);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_donatAWActionPerformed

    private void BurgKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgKActionPerformed
        this.setPemesanan(0);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BurgKActionPerformed

    private void McdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McdActionPerformed
        this.setPemesanan(2);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_McdActionPerformed

    private void aWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aWActionPerformed
        this.setPemesanan(3);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aWActionPerformed

    private void SBKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBKActionPerformed
        this.setPemesanan(4);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SBKActionPerformed

    private void KopiSBKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KopiSBKActionPerformed
        this.setPemesanan(4);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KopiSBKActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        NakamCariMakanan info = new NakamCariMakanan();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        NakamCariMakanan info = new NakamCariMakanan();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_search2ActionPerformed

    private void PinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinkActionPerformed
        this.setPemesanan(1);
        NakamRestaurant info = new NakamRestaurant(this.Opsi, noTelp);
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PinkActionPerformed

    public void setPemesanan(int newOpsi) {
        this.Opsi = newOpsi;
//        System.out.println("di setPemesanan :" + Opsi);
    }

    public String getPemesanan() {
//        System.out.println("di getPemesanan :" + Opsi);
        String Resto[] = {"BurgerKing", "Warung Pink", "McDonalds", "AW", "Starbucks"};
//        System.out.println(Resto[this.Opsi]);
        return Resto[this.Opsi];
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
            java.util.logging.Logger.getLogger(NakamPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NakamPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NakamPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NakamPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NakamPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BurgK;
    private javax.swing.JButton KopiSBK;
    private javax.swing.JButton Mcd;
    private javax.swing.JButton Pink;
    private javax.swing.JButton SBK;
    private javax.swing.JButton aW;
    private javax.swing.JButton ayamMCD;
    private javax.swing.JButton donatAW;
    private javax.swing.JButton floatBK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtQuit;
    private javax.swing.JButton pecelPink;
    private javax.swing.JButton search;
    private javax.swing.JButton search2;
    // End of variables declaration//GEN-END:variables
}