import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, number;
        String text;
        Scanner input = new Scanner(System.in);

//        System.out.println("Esercizio 1.1");
//        System.out.print("Inserisci il primo numero ");
//        num1 = input.nextInt();
//        System.out.print("Inserisci il secondo numero ");
//        num2 = input.nextInt();
//        System.out.println(moltiplica(num1, num2));

//        System.out.println("Esercizio 1.2");
//        System.out.print("Inserisci il testo ");
//        text = input.nextLine();
//        System.out.print("Inserisci un numero ");
//        number = input.nextInt();
//        System.out.println(concatena(text, number));

//        System.out.println("Esercizio 1.3");
//        System.out.print("Inserisci il testo ");
//        String str = input.nextLine();
//        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
//        array = inserisciInArray(array, str);
//        System.out.println(Arrays.toString(array));

//        System.out.println("Esercizio 2");
//        String[] strings = new String[3];
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print("Inserisci una stringa ");
//            strings[i] = input.nextLine();
//        }
//        System.out.println("In ordine ");
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//        System.out.println("In ordine inverso ");
//        for (int i = strings.length-1; i >= 0; i--) {
//            System.out.println(strings[i]);
//        }


    }
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String text, int number) {
        return text + " " + number;
    }

    public static String[] inserisciInArray(String[] arr, String text) {
        String[] newArray = new String[6];
        for (int i = 0; i < newArray.length; i++) {
            if (i<=1) {
                newArray[i] = arr[i];
            } else if (i == 2) {
                newArray[i] = text;
            } else {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
}