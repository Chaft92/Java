package Exo;

public class Voiture {
    private String marque;
    private String modele;
    private String couleur;

    public static String[] colorAutorized = {"Rouge", "Bleu", "Gris"};

    public Voiture(String marque, String modele, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void afficher() {
        System.out.println("Voici donc la marque: " + marque);
        System.out.println("Le modele: " + modele);
        System.out.println("La couleur que vous avez choisi: " + couleur);
    }



}