package conceptsbase.exo1;

public class TestCompte {
    public static void test() {

        // Instancier l'objet compte + affichage du solde initial
        System.out.println("On crée un objet compte avec un solde initial de 1000.");
        Compte compte = new Compte(1000.0);
        compte.afficher();

        // Effectuer un versement
        compte.deposer(500.0);
        System.out.println("On fait appel à la méthode deposer(500.0). ");
        compte.afficher();

        // Effectuer un retrait
        compte.retirer(200.0);
        System.out.println("On fait appel à la méthode retirer(200.0)");
        compte.afficher();
    }
}
