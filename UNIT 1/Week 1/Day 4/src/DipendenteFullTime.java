public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +  super.toString() + '}';
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
