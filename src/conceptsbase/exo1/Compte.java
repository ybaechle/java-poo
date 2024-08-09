package conceptsbase.exo1;

public class Compte {
    public Double solde;

    // Constructeur avec paramètre solde
    public Compte(double solde) {
        this.solde = solde;
    }

    // Méthode pour gérer les versements
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

    // Méthode pour gérer les retraits
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        }
    }

    // Méthode pour afficher le solde
    public void afficher() {
        System.out.println("Solde actuel : " + solde + " euros");
    }
}
