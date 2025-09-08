/*
  Implementare i seguenti metodi:
  - moltiplica: accetta due interi e ritorna il loro prodotto
  - concatena: accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
  - inserisciInArray: accetta un array di stringhe di cinque elementi ed una stringa e restituisca un array di sei
    elementi di cui la stringa passata sia al terzo posto e le stringhe precedentemente in quarta e quinta posizione
    siano rispettivamente in quinta e sesta.

  Scrivere un main che invochi in sequenza i tre metodi realizzati
*/

public class Ex_1 {
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String S, int n) {
        return S + n;
    }

    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];

        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

    public static void main(String[] args) {
        int prodotto = moltiplica(10, 5);
        System.out.println("Prodotto: " + prodotto);

        String risultatoConcat = concatena("Numero_", 10);
        System.out.println("Concatenazione: " + risultatoConcat);

        String[] arrayIniziale = {"A", "B", "C", "D", "E"};
        String[] arrayFinale = inserisciInArray(arrayIniziale, " ");

        System.out.println("Array dopo inserimento: ");

        for (String S : arrayFinale) {
            System.out.print(S + " ");
        }
    }
}