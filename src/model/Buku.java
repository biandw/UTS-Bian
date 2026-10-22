/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HYPE AMD
 */
public class Buku extends KoleksiPustaka {
    private String penulis;

    public Buku(String id, String judul, boolean sedangDipinjam, String penulis) {
        super(id, judul, sedangDipinjam);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public boolean isLayakPinjam() {
        // Buku selalu layak pinjam jika tidak rusak/hilang (contoh aturan)
        return true;
    }

    @Override
    public String getDeskripsi() {
        return super.getDeskripsi() + ", Penulis: " + penulis + " [Tipe: Buku]";
    }
}
