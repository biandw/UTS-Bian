
    package layanan;

import model.KoleksiPustaka;
import java.util.Comparator;

// Kelas Comparator khusus (Soal 4)
// Menampilkan koleksi layak pinjam lebih dulu, lalu diurutkan berdasarkan judul.
public class UrutLayakLaluJudul implements Comparator<KoleksiPustaka> {
    
    @Override
public int compare(KoleksiPustaka k1, KoleksiPustaka k2) {
    // Layak pinjam diutamakan (true bernilai lebih kecil dari false dalam logika pengurutan)
    Boolean layak1 = k1.isLayakPinjam();
    Boolean layak2 = k2.isLayakPinjam();
    
    int hasilBandingLayak = layak2.compareTo(layak1); // true (layak) ditaruh di depan
    if (hasilBandingLayak != 0) {
        return hasilBandingLayak;
    }
    // Jika status layak sama, diurutkan berdasarkan judul secara alfabetis
    return k1.getjudul().compareTo(k2.getjudul());
}
}