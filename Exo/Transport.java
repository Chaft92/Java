package Exo;
public interface Transport {

    public void deplacer();

    public class Voiture implements Transport {
        public void deplacer() {
            System.out.println("JE ROULE !");
        }
    }

    public class Avion implements Transport {
        public void deplacer() {
            System.out.println("JE VOLE !");
        }
    }

    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        Avion avion = new Avion();
        voiture.deplacer();
        avion.deplacer();
    }
}