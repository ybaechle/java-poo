package conceptsbase.exo2;

public class Execution {
    public static void execute() {

        System.out.println("Etape 1 : Créer une instance de Voiture;");

        Voiture voiture = new Voiture();

        System.out.println("Etape 2 : Définir les valeurs des attributs");
        voiture.setMarque("Toyota");
        voiture.setPrix(25000.0);

        System.out.println("Etape 3 : Afficher le résultat");
        System.out.println("Exemple de résultat : ");
        voiture.afficher();
    }
}
