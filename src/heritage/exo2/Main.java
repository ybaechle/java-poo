package heritage.exo2;

// Main.java
public class Main {
    public static void test() {
        // Créer une ville avec 2 paramètres
        Ville ville1 = new Ville("Lyon", 522250);
        ville1.afficheToi();
        System.out.println();

        // Créer une ville avec nombre d'habitants uniquement
        System.out.println("Test ville avec un seul argument : nom : ");
        Ville ville2 = new Ville("Bobigny");
        ville2.afficheToi();
        System.out.println();

        // Créer une capitale avec trois paramètres
        System.out.println("Test ville avec trois arguments : nom + pays + nbHab : ");
        Capitale capitale1 = new Capitale("Paris", "France",  10890751);
        capitale1.afficheToi();
        System.out.println();

        // Créer une capitale avec trois paramètres
        System.out.println("Test ville avec deux arguments : nom + pays : ");
        Capitale capitale2 = new Capitale("Ouagadougou","Burkina-Faso");
        capitale2.afficheToi();
    }
}

