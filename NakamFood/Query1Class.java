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
public class Query1Class {
    String nama_tempat, deskripsi;
    int jumlah;

    public Query1Class(String nama_tempat, String deskripsi, int jumlah) {
        this.nama_tempat = nama_tempat;
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getJumlah() {
        return jumlah;
    }
    
}
