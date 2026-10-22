package eksepsi;

public class KoleksiTidakLayakException extends PustakaException {
    public KoleksiTidakLayakException() {
        super("Maaf, koleksi pustaka ini tidak layak untuk dipinjam saat ini.");
    }
}