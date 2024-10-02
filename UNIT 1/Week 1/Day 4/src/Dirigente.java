public class Dirigente extends Dipendente {
    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public String toString() {
        return "Dirigente{" +  super.toString() + '}';
    }

    @Override
    public double calculateSalary() {
        return 0;
    }


}
