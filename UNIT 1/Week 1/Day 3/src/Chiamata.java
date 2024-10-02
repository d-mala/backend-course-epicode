public class Chiamata {

    private int durata;
    private int numeroChiamante;

    public Chiamata() {
        this.durata = 0;
        this.numeroChiamante = 0;
    }

    public Chiamata(int durata, int numeroChiamante) {
        this.durata = durata;
        this.numeroChiamante = numeroChiamante;
    }

    public int getDurata() {
        return durata;
    }

    public int getNumeroChiamante() {
        return numeroChiamante;
    }

}
