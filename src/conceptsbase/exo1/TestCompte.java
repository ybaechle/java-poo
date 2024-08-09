package conceptsbase.exo1;

public class TestCompte {
    public static void testCompte() {
        Compte compte = new Compte(1000.0);

        // Afficher le solde initial
        compte.afficher();

        // Effectuer un versement
        compte.deposer(500.0);
        System.out.println("Après versement de 500 euros :");
        compte.afficher();

        // Effectuer un retrait
        compte.retirer(200.0);
        System.out.println("Après retrait de 200 euros :");
        compte.afficher();
    }
}
