package model;

public abstract class KoleksiPustaka {
    private String id;
    private String judul;
    private int tahunTerbit;
    private boolean dipinjam;

    public KoleksiPustaka(String id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getId() { return id; }
    public String getJudul() { return judul; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isDipinjam() { return dipinjam; }
    public void setDipinjam(boolean dipinjam) { this.dipinjam = dipinjam; }

    public abstract boolean isLayakPinjam();

    public String deskripsi() {
        return id + " " + judul + " " + tahunTerbit + " " + (dipinjam ? "Dipinjam" : "Tersedia");
    }
}