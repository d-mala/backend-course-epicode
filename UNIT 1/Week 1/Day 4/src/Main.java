/*
Esercizio #1
Scrivere la classe Dipendente che ha i seguenti attributi:

- matricola - identificativo univoco del dipendente
- stipendio - numero decimale con stipendio base mensile calcolato per il dipendente
- Dipartimento - Valori possibili [PRODUZIONE, AMMINISTRAZIONE, VENDITE]

Le proprietà  devono essere accessibili solo dalla classe Dipendente e deve essere possibile leggerle tramite opportuni metodi getter ma non modificarle, tranne la proprietà  Dipartimento  che può essere modificata da altre classi tramite setter.
Instanziare 3 Dipendenti nel main, creare un array con essi ed iterare su ognuno di essi stampando la matricola di ogni dipendente.

Esercizio #2
Estendere il punto 1 aggiungendo 3 ulteriori classi:
-	DipendenteFullTime
-	DipendentePartTime
-	Dirigente

La classe Dipendente deve diventare astratta e le 3 classi di sopra devono ereditare da essa.
Ogni classe concreta deve implementare il metodo calculateSalary() in modo appropriato per il tipo di dipendente specifico. Ad esempio, il salario di un dipendente a tempo pieno potrebbe essere calcolato come uno stipendio mensile fisso, mentre il salario di un dipendente part-time potrebbe essere calcolato in base alle ore lavorate

Nel main, crea diverse istanze di dipendenti (ad esempio, dipendenti a tempo pieno, dipendenti part-time e dirigenti) mettendoli in un unico array e calcola i loro stipendi totali. Utilizza il polimorfismo per trattare tutti i dipendenti in modo uniforme

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quanti dipendenti vuoi inserire?");
        int nDipendenti = new Scanner(System.in).nextInt();
        Dipendente[] dipendenti = new Dipendente[nDipendenti];
        Scanner scanner = new Scanner(System.in);
        //chiediamo i valori per il dipartimento
        Dipartimento[] dipartimenti = Dipartimento.values();
        for (int i = 0; i < nDipendenti; i++) {
            //chiediamo i valori per il dipendente

            System.out.println("Inserisci la matricola del dipendente");
            int matricola = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il stipendio del dipendente");
            double stipendio = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Inserisci il dipartimento del dipendente (");
            for (int j = 0; j < dipartimenti.length; j++) {
                System.out.print(dipartimenti[j]);
                if (j < dipartimenti.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
            String dipartimentoStr = scanner.nextLine().toUpperCase();

            Dipartimento dipartimento;
            try {
                dipartimento = Dipartimento.valueOf(dipartimentoStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Dipartimento non valido. Riprova.");
                i--;
                continue;
            }

            System.out.println("Inserisci il tipo di dipendente (DipendenteFullTime, DipendentePartTime, Dirigente)");
            String tipoDipendente = scanner.nextLine().toLowerCase();

            Dipendente dipendente;
            switch (tipoDipendente) {
                case "dipendentefulltime":
                    dipendente = new DipendenteFullTime(matricola, stipendio, dipartimento);
                    break;
                case "dipendenteparttime":
                    dipendente = new DipendentePartTime(matricola, stipendio, dipartimento);
                    break;
                case "dirigente":
                    dipendente = new Dirigente(matricola, stipendio, dipartimento);
                    break;
                default:
                    System.out.println("Tipo di dipendente non valido. Riprova.");
                    i--;
                    continue;
            }

            dipendenti[i] = dipendente;
        }
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente);
        }
    }
}