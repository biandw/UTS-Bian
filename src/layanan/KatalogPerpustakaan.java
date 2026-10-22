package layanan;

import model.KoleksiPustaka;
import eksepsi.KoleksiSedangDipinjamException;
import eksepsi.KoleksiTidakLayakException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KatalogPerpustakaan {
    private List<KoleksiPustaka> daftarKoleksi;

    public KatalogPerpustakaan() {
        this.daftarKoleksi = new ArrayList<>();
    }

    public void tambahKoleksi(KoleksiPustaka koleksi) {
        daftarKoleksi.add(koleksi);
    }

    public List<KoleksiPustaka> getDaftarKoleksi() {
        return daftarKoleksi;
    }

    // Method cetakStatus memproses seluruh koleksi secara polimorfik TANPA instanceof (Soal 3)
    public void cetakStatus() {
        System.out.println("=== STATUS KATALOG PERPUSTAKAAN ===");
        for (KoleksiPustaka koleksi : daftarKoleksi) {
            // Memanggil getDeskripsi() secara polimorfik tanpa pengecekan tipe objek
            System.out.println(koleksi.getDeskripsi());
        }
    }

    // Method pinjam yang melempar eksepsi sesuai keadaan (Soal 5)
    public void pinjam(String id) throws KoleksiSedangDipinjamException, KoleksiTidakLayakException {
        for (KoleksiPustaka koleksi : daftarKoleksi) {
            if (koleksi.getId().equals(id)) {
                if (koleksi.isSedangDipinjam()) {
                    throw new KoleksiSedangDipinjamException();
                }
                if (!koleksi.isLayakPinjam()) {
                    throw new KoleksiTidakLayakException();
                }
                koleksi.setSedangDipinjam(true);
                System.out.println("Berhasil meminjam koleksi: " + koleksi.getJudul());
                return;
            }
        }
        System.out.println("Koleksi dengan ID " + id + " tidak ditemukan.");
    }

    // Method urut yang menerima Comparator dari luar (Soal 4)
    public void urut(Comparator<KoleksiPustaka> comparator) {
        daftarKoleksi.sort(comparator);
    }
}