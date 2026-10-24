package model;

public class Majalah extends KoleksiPustaka implements Terarsip {
    private int edisi;
    private String bulanTerbit;
    private boolean edisiTerbaru;
    private boolean terarsip;

    public Majalah(String id, String judul, int tahunTerbit, int edisi, String bulanTerbit, boolean edisiTerbaru) {
        super(id, judul, tahunTerbit);
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
        this.edisiTerbaru = edisiTerbaru;
        this.terarsip = false;
    }

    @Override public boolean isArsip() { return terarsip; }
    @Override public void setArsip(boolean arsip) { this.terarsip = arsip; }

    @Override
    public boolean isLayakPinjam() {
        return edisiTerbaru;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " " + edisi + " " + bulanTerbit + " " + (edisiTerbaru ? "Terbaru" : "Lama") + " " + (isLayakPinjam() ? "Layak" : "TidakLayak");
    }
}