/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;

/**
 *
 * @author dbss014
 */
public class Pelanggan {
    private String telp;
    private String namaD;
    private String namaT;
    private String namaB;
    private String surel;

    public Pelanggan(String telp, String namaD, String namaT, String namaB, String surel) {
        this.telp = telp;
        this.namaD = namaD;
        this.namaT = namaT;
        this.namaB = namaB;
        this.surel = surel;
    }

    public String getTelp() {
        return telp;
    }

    public String getNamaD() {
        return namaD;
    }

    public String getNamaT() {
        return namaT;
    }

    public String getNamaB() {
        return namaB;
    }

    public String getSurel() {
        return surel;
    }
    
}
