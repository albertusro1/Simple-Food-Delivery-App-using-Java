/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;

/**
 *
 * @author DBSS028
 */
public class Produk {
    String deskripsi, kategori, nama_tempat, id_produk;
    double harga;

    public Produk(String id_produk, String deskripsi, String kategori, double harga, String nama_tempat) {
        this.id_produk = id_produk;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.nama_tempat = nama_tempat;
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public double getHarga() {
        return harga;
    }

    public String getId_produk() {
        return id_produk;
    }

    
}
