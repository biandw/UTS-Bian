/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HYPE AMD
 */
public abstract class KoleksiPustaka {
    protected String id;
    protected String judul;
    protected boolean sedangDipinjam;

    public KoleksiPustaka(String id, String judul, boolean sedangDipinjam) {
        this.id = id;
        this.judul = judul;
        this.sedangDipinjam = sedangDipinjam;
    }

    public String getId() {
        return id;
    }

    public String getjudul() {
        return judul;
    }

    public boolean isSedangDipinjam() {
        return sedangDipinjam;
    }

    public void setSedangDipinjam(boolean sedangDipinjam) {
        this.sedangDipinjam = sedangDipinjam;
    }

    // Method abstract untuk aturan kelayakan pinjam (Soal 1)
    public abstract boolean isLayakPinjam();

    // Method deskripsi yang diperluas oleh turunan memakai super (Soal 1)
    public String getDeskripsi() {
        return "ID: " + id + ", Judul: " + judul + ", Status Pinjam: " + (sedangDipinjam ? "Sedang Dipinjam" : "Tersedia");
    }

    public String getJudul() {
    return this.judul; // Mengembalikan nilai judul dari objek koleksi
} // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
