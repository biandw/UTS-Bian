package model;

public class Majalah extends KoleksiPustaka {
    private int tahunTerbit;
    private int edisi;
    private String bulanTerbit;
    private boolean terbaru;

    public Majalah(String id, String judul, int tahunTerbit, int edisi, String bulanTerbit, boolean terbaru) {
        super(id, judul, false);
        this.tahunTerbit = tahunTerbit;
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
        this.terbaru = terbaru;
    }

    @Override
    public boolean isLayakPinjam() {
        return terbaru;
    }

    @Override
    public String getDeskripsi() {
        return "Majalah | ID: " + id + " | Judul: \"" + judul + "\" | Tahun: " + tahunTerbit + 
               " | edisi " + edisi + " | " + bulanTerbit + 
               " | " + (terbaru ? "edisi terbaru" : "bukan terbaru");
    }
}