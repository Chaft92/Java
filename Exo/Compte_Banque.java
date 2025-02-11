package Exo;

public class Compte_Banque{
    private int solde;
    private String titulaire;

    public Compte_Banque(int solde, String titulaire){
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void deposer(double montant){
        if(montant<0){
            System.out.println("Impossible de déposer un montant négatif\n");
            deposer(montant);
        }
        else{
            this.solde += montant;  
            System.out.println("\nDépôt effectué.");
            System.out.println(montant + " a été déposé dans votre compte. Nouveau solde:" + this.solde);
        } 
    }

    public void retirer(double montant){
        if((this.solde - montant) < 0){
            System.out.println("Solde insuffisant pour effectuer le retrait.");
            retirer(montant);
        }
        else{
                this.solde -= montant;
                System.out.println("\nRetrait effectué.");
                System.out.println(montant + " a été retiré de votre compte. Nouveau solde:" + this.solde);
        }
    }
}