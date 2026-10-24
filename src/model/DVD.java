package model;

public class DVD extends KoleksiPustaka implements Terarsip {
    private int durasiMenit;
    private boolean terarsip;

    public DVD(String id, String judul, int tahunTerbit, int durasiMenit) {
        super(id, judul, tahunTerbit);
        this.durasiMenit = durasiMenit;
        this.terarsip = false;
    }

    public int getDurasiMenit() {
        return durasiMenit;
    }

    @Override
    public boolean isArsip() {
        return terarsip;
    }

    @Override
    public void setArsip(boolean arsip) {
        this.terarsip = arsip;
    }

    @Override
    public boolean isLayakPinjam() {
        return true;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | Durasi: " + durasiMenit + " Menit | Layak: " + (isLayakPinjam() ? "Ya" : "Tidak");
    }
}