/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HYPE AMD
 */
public class DVD extends KoleksiPustaka {
 private int durasiMenit;

    public DVD(String id, String judul, boolean sedangDipinjam, int durasiMenit) {
        super(id, judul, sedangDipinjam);
        this.durasiMenit = durasiMenit;
    }

    public int getDurasiMenit() {
        return durasiMenit;
    }

    @Override
    public boolean isLayakPinjam() {
        // DVD layak pinjam jika durasinya di atas 30 menit
        return durasiMenit > 30;
    }

    @Override
    public String getDeskripsi() {
        return super.getDeskripsi() + ", Durasi: " + durasiMenit + " menit [Tipe: DVD]";
    }   
}
