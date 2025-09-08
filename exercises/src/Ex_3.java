/*
  Implementare i seguenti metodi
  - perimetroRettangolo: che accetta solo la lunghezza decimale dei due lati di un rettangolo e ne calcola il perimetro
  - pariDispari: che accetta un numero intero e restituisce 0 se il numero è pari e 1 se è dispari
  - perimetroTriangolo: che accetta le lunghezze decimali dei lati di un triangolo e ne restituisca l'area (è possibile
    usare la formula di Erone)

  Scrivere un main che utilizzi in sequenza i tre metodi chiedendo l'input dei dati all'utente
*/

import java.util.Scanner;

public class Ex_3 {
    public static int perimetroRettangolo(int base, int altezza) {
        return 2 * (base + altezza);
    }

    public static int pariDispari(int n) {
        return n;
    }

    public static int perimetroTriangolo(int l1, int l2, int l3) {
        return l1 + l2 + l3;
    }

    public static void main(String[] args) {
        //perimetroRettangolo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la base: ");
        int base = scanner.nextInt();

        System.out.println("Inserisci l'altezza: ");
        int altezza = scanner.nextInt();

        int perimetro = perimetroRettangolo(base, altezza);

        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        //pariDispari
        int n = 10;

        if(n % 2 == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }

        //perimetroTriangolo
        System.out.println("Inserisci il primo lato: ");
        int l1 = scanner.nextInt();

        System.out.println("Inserisci il secondo lato: ");
        int l2 = scanner.nextInt();

        System.out.println("Inserisci il terzo lato: ");
        int l3 = scanner.nextInt();

        int perimetroT = perimetroTriangolo(l1, l2, l3);
        System.out.println("Il perimetro del triangolo è: " + perimetroT);
        scanner.close();
    }
}
