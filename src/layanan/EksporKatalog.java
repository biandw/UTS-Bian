package layanan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import model.KoleksiPustaka;

public class EksporKatalog {
    // S6: Menghasilkan file katalog.txt saat dijalankan
    public static void eksporKeFile(KatalogPerpustakaan katalog, String namaFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("==================================================");
            writer.newLine();
            writer.write("              DAFTAR KATALOG PERPUSTAKAAN          ");
            writer.newLine();
            writer.write("==================================================");
            writer.newLine();

            for (KoleksiPustaka k : katalog.getDaftarKoleksi()) {
                writer.write(k.deskripsi());
                writer.newLine();
            }

            writer.write("==================================================");
            writer.newLine();
        }
    }
}