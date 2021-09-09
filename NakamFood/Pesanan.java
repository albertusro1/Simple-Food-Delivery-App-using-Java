/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;

public class Pesanan {
    String namaToko;
    String alamatTujuan;
    String tanggal;

    public Pesanan(String namaToko, String alamatTujuan, String tanggal) {
        this.namaToko = namaToko;
        this.alamatTujuan = alamatTujuan;
        this.tanggal = tanggal;
    }
    
    

    public String getNamaToko() {
        return namaToko;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public String getTanggal() {
        return tanggal;
    }
    
    
}
