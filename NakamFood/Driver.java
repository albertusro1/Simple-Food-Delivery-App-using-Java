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
public class Driver {
    private String telp;
    private String namaD;
    private String namaT;
    private String namaB;
    private String plat;

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

    public String getPlat() {
        return plat;
    }

    public Driver(String telp, String plat, String namaD, String namaT, String namaB) {
        this.telp = telp;
        this.plat = plat;
        this.namaD = namaD;
        this.namaT = namaT;
        this.namaB = namaB;
    }
}
