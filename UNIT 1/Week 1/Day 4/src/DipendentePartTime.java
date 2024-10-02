public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public String toString() {
        return "DipendentePartTime{" +  super.toString() + '}';
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

}
