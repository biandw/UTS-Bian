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

        katalog.cetakStatus();
    }
}