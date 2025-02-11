package Exo_Etudiant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEtudiants gestion = new GestionEtudiants();
        Scanner scanner = new Scanner(System.in);

        gestion.ajouterEtudiant(new Etudiant("Charles", 19));
        gestion.ajouterEtudiant(new Etudiant("Matéo", 21));
        gestion.ajouterEtudiant(new Etudiant("Noam", 20));
        gestion.ajouterEtudiant(new Etudiant("Elias", 21));
        gestion.ajouterEtudiant(new Etudiant("Martin", 17));
        gestion.ajouterEtudiant(new Etudiant("Artem", 18));
        gestion.ajouterEtudiant(new Etudiant("Erwan", 19));
        gestion.ajouterEtudiant(new Etudiant("Ewan", 27));
        gestion.ajouterEtudiant(new Etudiant("Jenna", 28));
        gestion.ajouterEtudiant(new Etudiant("Floriane", 20));
        gestion.ajouterEtudiant(new Etudiant("Tonton", 21));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter étudiant");
            System.out.println("2. Liste des étudiants");
            System.out.println("3. Supprimer étudiant (par nom)");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de l'étudiant: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez l'âge de l'étudiant: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consommer la nouvelle ligne
                    gestion.ajouterEtudiant(new Etudiant(nom, age));
                    System.out.println("Étudiant ajouté.");
                    break;
                case 2:
                    System.out.println("Liste des étudiants:");
                    gestion.afficherEtudiants();
                    break;
                case 3:
                    System.out.print("Entrez le nom de l'étudiant à supprimer: ");
                    String nomASupprimer = scanner.nextLine();
                    gestion.supprimerEtudiantParNom(nomASupprimer);
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}