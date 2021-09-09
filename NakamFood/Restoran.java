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
public class Restoran {
    private String nama_tempat, alamat;

    public Restoran(String nama_tempat, String alamat) {
        this.nama_tempat = nama_tempat;
        this.alamat = alamat;
    }
    
    public Restoran(String nama_tempat){
        this.nama_tempat = nama_tempat;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public String getAlamat() {
        return alamat;
    }
    
}
