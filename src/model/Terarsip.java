/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author HYPE AMD
 */
public interface Terarsip {
 String nomorRak();
    String lokasiLantai();

    default String ringkasanArsip() {
        return "Nomor Rak: " + nomorRak() + ", Lokasi Lantai: " + lokasiLantai();
    }
}
