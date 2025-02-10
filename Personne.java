public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
    }
}
