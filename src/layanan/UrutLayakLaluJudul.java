package layanan;

import java.util.Comparator;
import model.KoleksiPustaka;

public class UrutLayakLaluJudul implements Comparator<KoleksiPustaka> {
    @Override
    public int compare(KoleksiPustaka k1, KoleksiPustaka k2) {
        // Mengurutkan berdasarkan kelayakan terlebih dahulu (Layak/true ditaruh di atas)
        int layak1 = k1.isLayakPinjam() ? 1 : 0;
        int layak2 = k2.isLayakPinjam() ? 1 : 0;
        
        if (layak1 != layak2) {
            return Integer.compare(layak2, layak1); // Descending kelayakan (Layak dulu)
        }
        
        // Jika status kelayakan sama, urutkan berdasarkan judul (Alphabetical)
        return k1.getJudul().compareToIgnoreCase(k2.getJudul());
    }
}