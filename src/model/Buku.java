package model;

public abstract class Buku extends KoleksiPustaka {
    private int jumlahHalaman;

    public Buku(String id, String judul, int tahunTerbit, int jumlahHalaman) {
        super(id, judul, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() { return jumlahHalaman; }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " " + jumlahHalaman;
    }
}