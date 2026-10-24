package model;

public class BukuCetak extends Buku {
    private String lokasiRak;
    private boolean dalamPerbaikan;

    public BukuCetak(String id, String judul, int tahunTerbit, int jumlahHalaman, String lokasiRak, boolean dalamPerbaikan) {
        super(id, judul, tahunTerbit, jumlahHalaman);
        this.lokasiRak = lokasiRak;
        this.dalamPerbaikan = dalamPerbaikan;
    }

    public String getLokasiRak() { return lokasiRak; }
    public boolean isDalamPerbaikan() { return dalamPerbaikan; }

    @Override
    public boolean isLayakPinjam() {
        return !dalamPerbaikan;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " " + lokasiRak + " " + (dalamPerbaikan ? "Perbaikan" : "Aman") + " " + (isLayakPinjam() ? "Layak" : "TidakLayak");
    }
}