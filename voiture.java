public class voiture {
    String marque;
    String modele;
    String couleur;

    public static void main(String[] args) {
        voiture toyo = new voiture();
        toyo.marque = "Toyota";
        toyo.modele = "Corolla";
        toyo.couleur = "rouge";
        toyo.afficher();
        toyo.demarrer();
        toyo.freiner();
        toyo.avancer();
    }

    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Modele: " + modele);
        System.out.println("Couleur: " + couleur);
    }
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
    public void freiner() {
        System.out.println("La voiture freiner");
    }
    public void avancer() {
        System.out.println("La voiture avance");
    }
}