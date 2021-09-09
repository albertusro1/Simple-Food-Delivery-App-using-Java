/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;

import static NakamFood.NakamLogin.url;
import static NakamFood.NakamRegister.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DBSS028
 */
public class Order {

    static String url = "jdbc:sqlserver://localhost:1433;databaseName=nakam_food;integratedSecurity=true";
    static String userName = "";
    static String password = "";

    //Connect to DB
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement st;

    String id_pemesanan, waktu, alamat, telepon, id_driver, tempat, produk, kuantitas;

    public String getId_pemesanan() {
        return id_pemesanan;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getId_driver() {
        return id_driver;
    }

    public String getTempat() {
        return tempat;
    }

    public String getKuantitas() {
        try {
            conn = DriverManager.getConnection(url);
            String query = "select SUM(b.kuantitas) from barang_pesanan b join pesanan p on b.id_pemesanan = p.id_pemesanan where p.id_pemesanan = ?";
            st = conn.prepareStatement(query);
            st.setString(1, id_pemesanan);
            st.executeUpdate();
            ResultSet rs = st.executeQuery();
            kuantitas = rs.getString("kuantitas");
        } catch (SQLException ex) {
            Logger.getLogger(NakamLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kuantitas;
    }

    public String getProduk() {
        try {
            conn = DriverManager.getConnection(url);
            String query = "select p.deskripsi  from produk p join barang_pesanan b on p.id_produk = b.id_produk join pesanan pe on pe.id_pemesanan = b.id_pemesanan where pe.id_pemesanan = ?";
            st = conn.prepareStatement(query);
            st.setString(1, id_pemesanan);
            st.executeUpdate();
            ResultSet rs = st.executeQuery();
            int ind = 1;
            while(rs.next()){
                produk += rs.getString(ind) + ", ";
                ind++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NakamLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produk;
    }

    public Order(String id_pemesanan, String waktu, String alamat, String telepon, String id_driver, String tempat) {
        this.id_pemesanan = id_pemesanan;
        this.waktu = waktu;
        this.alamat = alamat;
        this.telepon = telepon;
        this.id_driver = id_driver;
        this.tempat = tempat;
    }
}
