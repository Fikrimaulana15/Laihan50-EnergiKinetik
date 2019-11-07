/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan50.energikinetik;

/**
 *
 * @author ASUS
 */
public class EnergiKinetik {
    
private double massa, kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik() {
        return 0.5 * (massa/1000) * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha() {
        // karena tidak ada perubahan kecepatan maka
        // energi kinetik == usaha
        return hitungEnergiKinetik();
    }
}
