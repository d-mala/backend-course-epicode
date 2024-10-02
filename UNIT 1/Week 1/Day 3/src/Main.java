/*
Gli esercizi prevedono l'implementazione di alcune classi Java che rappresentano gli oggetti indicati. In tutti gli esercizi bisogna utilizzare l'incapsulamento per proteggere gli attributi delle classi e fornire metodi pubblici per accedere e modificare tali attributi in modo controllato

Esercizio #1
Creare una classe Rettangolo che permetta di rappresentare dei rettangoli. Per ogni rettangolo deve essere possibile specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per calcolare perimetro ed area.
Realizzare un metodo stampaRettangolo che, dato un Rettangolo, stampi a video area e perimetro.
Realizzare un metodo stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la somma delle aree e dei perimetri.
Scrivere un main che utilizzi tutte queste funzioni.

Esercizio #2
Scrivere un’applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.

Si devono quindi rappresentare i dati relativi ad una carta SIM, ed in particolare:
- il numero di telefono
- il credito disponibile in euro
- la lista delle ultime 5 chiamate effettuate
Per ciascuna Chiamata deve essere rappresentata la durata in minuti e il numero chiamato

La classe SIM dovrà fornire le seguenti funzionalità:
- un costruttore che crea una SIM con numero di telefono passato come parametro, credito a 0 e lista delle
   chiamate vuota
una funzione per la stampa dei dati della SIM

Scrivere un main che crei una istanza di SIM e ne stampi i dati.

*/

public class Main {
    public static void main(String[] args) {
        // Esercizio #1
//        Rettangolo r = new Rettangolo();
//        Rettangolo r2 = new Rettangolo();
//        Rettangolo r3 = new Rettangolo(5, 2);
//
//        System.out.println("Rettangolo 1");
//        r.stampaRettangolo();
//        System.out.println();
//        System.out.println("Rettangolo 2");
//        r2.stampaRettangolo();
//        System.out.println();
//        System.out.println("Rettangolo 3");
//        r3.stampaRettangolo();
//        System.out.println();
//        System.out.println("Rettangolo 2 e 3");
//        r.stampaDueRettangoli(r2, r3);

        // Esercizio #2

        Sim s2 = new Sim("1234567890", 100);
        // Riempiamo l'array con 5 chiamate
        for (int i = 0; i < s2.getChiamate().length; i++) {
            // generiamo un numero di telefono casuale
            int numeroChiamante = (int) (Math.random() * 1000000000);
            // generiamo un numero di minuti casuali tra 1 e 20
            int durata = (int) (Math.random() * 20) + 1;
            // diminuiamo il credito per ogni minuto della chiamata
            s2.setCredito(s2.getCredito() - durata);
            // aggiungiamo la chiamata nel vettore
            s2.getChiamate()[i] = new Chiamata(durata, numeroChiamante);
        }
        s2.stampaSim();

        System.out.println("Chiamate effettuate: " + s2.getChiamate().length);

    }
}