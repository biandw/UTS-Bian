package model;

public class BerkasDigital extends KoleksiPustaka implements Terarsip {
    private double ukuranMB;
    private String urlUnduh;
    private boolean terarsip;

    public BerkasDigital(String id, String judul, int tahunTerbit, double ukuranMB, String urlUnduh) {
        super(id, judul, tahunTerbit);
        this.ukuranMB = ukuranMB;
        this.urlUnduh = urlUnduh;
        this.terarsip = false;
    }

    @Override public boolean isArsip() { return terarsip; }
    @Override public void setArsip(boolean arsip) { this.terarsip = arsip; }

    @Override
    public boolean isLayakPinjam() {
        return true;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " " + ukuranMB + "MB " + urlUnduh + " Layak";
    }
}