public class Sim {

    private String numero;
    private int credito;
    private Chiamata[] chiamate;

    public Sim() {
        this.chiamate = new Chiamata[5];
        this.credito = 0;
        this.numero = "";
    }

    public Sim(String numero, int credito) {
        this.chiamate = new Chiamata[5];
        this.credito = credito;
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return this.chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaSim() {
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Credito: " + this.getCredito());

        for (int i = 0; i < this.getChiamate().length; i++) {
            if (this.getChiamate()[i] != null) {
                System.out.println("Numero chiamante: " + this.getChiamate()[i].getNumeroChiamante() + ", Durata: " + this.getChiamate()[i].getDurata() + " minuti");
            }
        }
    }
}
