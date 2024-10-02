public class Rettangolo {

    private int altezza;
    private int larghezza;

    public Rettangolo() {
        this.altezza = 0;
        this.larghezza = 0;
    }

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    private int area() {
        return this.altezza * this.larghezza;
    }

    private int perimetro() {
        return (this.altezza + this.larghezza) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + this.area());
        System.out.println("Perimetro: " + this.perimetro());
    }

    public void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("Area: " + (rett1.area() + rett2.area()));
        System.out.println("Perimetro: " + (rett1.perimetro() + rett2.perimetro()));
    }
}
