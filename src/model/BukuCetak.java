package model;

public class BukuCetak extends KoleksiPustaka {
    private int tahunTerbit;
    private int jumlahHalaman;
    private String lokasiRak;
    private boolean sedangDiperbaiki;

    public BukuCetak(String id, String judul, int tahunTerbit, int jumlahHalaman, String lokasiRak, boolean sedangDiperbaiki) {
        super(id, judul, sedangDiperbaiki); // sedangDipinjam merepresentasikan status perbaikan/pinjam
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.lokasiRak = lokasiRak;
        this.sedangDiperbaiki = sedangDiperbaiki;
    }

    @Override
    public boolean isLayakPinjam() {
        return !sedangDiperbaiki;
    }

    @Override
    public String getDeskripsi() {
        return "BukuCetak | ID: " + id + " | Judul: \"" + judul + "\" | Tahun: " + tahunTerbit + 
               " | " + jumlahHalaman + " halaman | Rak: " + lokasiRak + 
               " | Status: " + (sedangDiperbaiki ? "sedang diperbaiki" : "tidak diperbaiki");
    }
}