import java.util.Arrays;
import java.util.Scanner;

public class TableauNbEntiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taille du tableau : ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];

        System.out.println("éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
        }
        Arrays.sort(tableau);
        int min = tableau[0];
        int max = tableau[taille - 1];

        double somme = 0;
        for (int num : tableau) {
            somme += num;
        }
        double moyenne = somme / taille;

        double mediane;
        if (taille % 2 == 0) {
            mediane = (tableau[taille / 2 - 1] + tableau[taille / 2]) / 2.0;
        } else {
            mediane = tableau[taille / 2];
        }

        double sommeCarres = 0;
        for (int num : tableau) {
            sommeCarres += Math.pow(num - moyenne, 2);
        }
        double ecartType = Math.sqrt(sommeCarres / taille);

        System.out.println("\nTableau trié : " + Arrays.toString(tableau));
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Médiane : " + mediane);
        System.out.println("Écart-type : " + ecartType);
        
        scanner.close();
    }
}
