package layanan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.KoleksiPustaka;
import eksepsi.PustakaException;
import eksepsi.KoleksiTidakLayakException;
import eksepsi.KoleksiSedangDipinjamException;

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

    public void urutkan(Comparator<KoleksiPustaka> comparator) {
        daftarKoleksi.sort(comparator);
    }

    public KoleksiPustaka cariById(String id) {
        for (KoleksiPustaka k : daftarKoleksi) {
            if (k.getId().equalsIgnoreCase(id)) {
                return k;
            }
        }
        return null;
    }

    public void pinjamKoleksi(String id) throws PustakaException {
        KoleksiPustaka koleksi = cariById(id);
        if (koleksi == null) {
            throw new PustakaException("Koleksi dengan ID " + id + " tidak ditemukan.");
        }
        if (!koleksi.isLayakPinjam()) {
            throw new KoleksiTidakLayakException("Koleksi '" + koleksi.getJudul() + "' tidak layak untuk dipinjam.");
        }
        if (koleksi.isDipinjam()) {
            throw new KoleksiSedangDipinjamException("Koleksi '" + koleksi.getJudul() + "' sedang dipinjam.");
        }
        koleksi.setDipinjam(true);
    }

    public void cetakStatus() {
        for (KoleksiPustaka k : daftarKoleksi) {
            System.out.println(k.deskripsi());
        }
    }
}