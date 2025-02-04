import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choisir le nombre jusqu'auquel afficher les nombres paires: ");
        int nombre = scanner.nextInt();

        System.out.println("Les nombres paires " + nombre + " :");
        for (int i = 0; i <= nombre; i += 2) {
            System.out.print(i + " ");
        }
        //j'ai choisi cette boucle parce que c'est la plus rapide à mettre en place

        scanner.close();
    }
    
}
