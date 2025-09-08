/*
  Implementare un metodo main che chiede all'utente di inserire 3 stringhe da tastiera e scrive in console la
  concatenazione delle stringhe in ordine di inserimento e in ordine di inserimento inverso.
*/

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa: ");
        String string = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa: ");
        String string_1 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa: ");
        String string_2 = scanner.nextLine();

        System.out.println(string + " " + string_1 + " " + string_2);
        scanner.close();
    }
}