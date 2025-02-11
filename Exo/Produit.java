package Exo;
public class Produit {
    protected double prix;

    public class Livre extends Produit {
        public Livre(int p) {
            prix = p;
        }
    }

    public class DVD extends Produit {
        public DVD(int p) {
            prix = p;
        }
    }

    public void calculerPrix(double prix, double multi) {
        System.out.println("Le prix est de " + prix * multi + " euros");
    }

    public static void main(String[] args) {
        Produit produit = new Produit();
        Livre livre = produit.new Livre(23);
        DVD dvd = produit.new DVD(19);
        livre.calculerPrix(livre.prix, 1.05);
        dvd.calculerPrix(dvd.prix, 1.20);
    }
    
}