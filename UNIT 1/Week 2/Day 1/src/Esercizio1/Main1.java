package Esercizio1;

/*
Scrivere un programma che istanzi un array di 5 interi con valori casuali tra 1 e 10 e lo stampi in console, chieda poi all'utente di inserire un numero in una posizione specificata e stampi il nuovo stato dell'array, ripetere l'operazione fino a che l'utente non inserisce il valore 0. Gestire eventuali errori dovuti alla violazione dei limiti dell'array.  (Extra: Provare ad usare LogBack per stampare i messaggi di errore)
*/

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int pos;
        int num;
        while (true) {
            System.out.print("Inserisci una posizione (0 per uscire): ");
            try {
                pos = Integer.parseInt(input.nextLine());
                if (pos < 0 || pos >= array.length) {
                    System.out.println("Posizione non valida");
                } else if (pos == 0) {
                    break;
                } else {
                    System.out.print("Inserisci un numero da inserire all'interno dell'array: ");
                    while (true) {
                        try {
                            num = Integer.parseInt(input.nextLine());
                            array[pos] = num;
                            System.out.println("Nuovo stato dell'array: ");
                            for (int j : array) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Devi inserire un numero");
                            System.out.print("Inserisci un numero da inserire all'interno dell'array: ");
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero");
            }
        }

    }
}