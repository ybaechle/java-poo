package conceptsbase.exo2;

public class Execution {
    public static void test() {

        System.out.println("Etape 1 : Créer une instance de Voiture avec le constructeur sans paramètres");
        Voiture voiture = new Voiture();
        voiture.afficher();

        System.out.println("Etape 2 : Définir de nouvelles valeurs aux attributs");
        voiture.setMarque("Toyota");
        voiture.setPrix(25000.0);

        System.out.println("Etape 3 : Afficher le résultat");
        System.out.println("Exemple de résultat : ");
        voiture.afficher();
    }
}
