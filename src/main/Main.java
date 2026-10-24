package main;

import layanan.EksporKatalog;
import model.BukuCetak;
import model.Majalah;
import model.BerkasDigital;
import layanan.KatalogPerpustakaan;
import layanan.UrutLayakLaluJudul;
import eksepsi.PustakaException;

public class Main {
    public static void main(String[] args) {
        KatalogPerpustakaan katalog = new KatalogPerpustakaan();

        // 6 Data Uji Wajib sesuai tabel soal
        katalog.tambahKoleksi(new BukuCetak("BK-001", "Java How to Program", 2022, 620, "rak A-12", false));
        katalog.tambahKoleksi(new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", true));
        katalog.tambahKoleksi(new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, 88, "Agustus", true));
        katalog.tambahKoleksi(new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, 87, "Juli", false));
        katalog.tambahKoleksi(new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15.0, "unduh.polmed.ac.id/bd001"));
        katalog.tambahKoleksi(new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8.0, "unduh.polmed.ac.id/bd002"));

        System.out.println("=== STATUS AWAL KATALOG ===");
        katalog.cetakStatus();

        // S4 -2 & S5 -2: Pengujian Peminjaman & Pengurutan di Main
        System.out.println("\n=== PENGUJIAN PENGURUTAN (URUT LAYAK LALU JUDUL) ===");
        katalog.urutkan(new UrutLayakLaluJudul());
        katalog.cetakStatus();

        System.out.println("\n=== PENGUJIAN PEMINJAMAN ===");
        try {
            System.out.println("Mencoba meminjam BK-001 (Layak)...");
            katalog.pinjamKoleksi("BK-001");
            System.out.println("Berhasil meminjam BK-001!");
        } catch (PustakaException e) {
            System.out.println("Gagal: " + e.getMessage());
        }

        try {
            System.out.println("\nMencoba meminjam BK-002 (Dalam Perbaikan / Tidak Layak)...");
            katalog.pinjamKoleksi("BK-002");
        } catch (PustakaException e) {
            System.out.println("Gagal meminjam BK-002: " + e.getMessage());
        }

        // S6 -2: Menghasilkan file katalog.txt saat program dijalankan
        System.out.println("\n=== EKSPOR KATALOG KE FILE ===");
        try {
            EksporKatalog.eksporKeFile(katalog, "katalog.txt");
            System.out.println("Berhasil! File 'katalog.txt' telah dihasilkan.");
        } catch (Exception e) {
            System.out.println("Gagal mengekspor katalog: " + e.getMessage());
        }
    }
}