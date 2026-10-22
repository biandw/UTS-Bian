package layanan;

import layanan.KatalogPerpustakaan;
import model.KoleksiPustaka;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EksporKatalog {
    public static void eksporKeFile(KatalogPerpustakaan katalog) {
        // Aliran wajib ditutup memakai try-with-resources (Soal 6)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("katalog.txt"))) {
            // Menulis header dengan format kolom sejajar rapi
            writer.write(String.format("%-10s | %-30s | %-18s | %-15s", "ID", "JUDUL", "STATUS PINJAM", "LAYAK PINJAM"));
            writer.newLine();
            writer.write("----------------------------------------------------------------------------------");
            writer.newLine();

            for (KoleksiPustaka k : katalog.getDaftarKoleksi()) {
                String status = k.isSedangDipinjam() ? "Dipinjam" : "Tersedia";
                String layak = k.isLayakPinjam() ? "Ya" : "Tidak";

                // Menulis data dengan kolom sejajar rapi menggunakan String.format
                writer.write(String.format("%-10s | %-30s | %-18s | %-15s", 
                        k.getId(), 
                        k.getJudul(), 
                        status, 
                        layak));
                writer.newLine();
            }
            System.out.println("Katalog berhasil diekspor ke file katalog.txt dengan rapi.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}