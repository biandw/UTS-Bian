package model;

public class BerkasDigital extends KoleksiPustaka {
    private int tahunTerbit;
    private double ukuranFileMB;
    private String urlUnduh;

    public BerkasDigital(String id, String judul, int tahunTerbit, double ukuranFileMB, String urlUnduh) {
        super(id, judul, false); // Status awal tidak sedang dipinjam
        this.tahunTerbit = tahunTerbit;
        this.ukuranFileMB = ukuranFileMB;
        this.urlUnduh = urlUnduh;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public double getUkuranFileMB() {
        return ukuranFileMB;
    }

    public String getUrlUnduh() {
        return urlUnduh;
    }

    @Override
    public boolean isLayakPinjam() {
        // Berkas digital selalu dianggap layak unduh atau layak akses
        return true;
    }

    @Override
    public String getDeskripsi() {
        return "BerkasDigital | ID: " + id + " | Judul: \"" + judul + "\" | Tahun: " + tahunTerbit + 
               " | " + ukuranFileMB + " MB | " + urlUnduh;
    }
}