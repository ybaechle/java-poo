package heritage.exo2;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Créer une ville
        Ville ville1 = new Ville("Lyon", 522250);
        ville1.afficheToi();
        System.out.println();

        // Créer une ville avec nombre d'habitants
        Ville ville2 = new Ville("Bobigny");
        ville2.afficheToi();
        System.out.println();

        // Créer une capitale avec deux arguments
        Capitale capitale1 = new Capitale("Paris", "France",  10890751);
        capitale1.afficheToi();
        System.out.println();

        // Créer une capitale avec trois arguments
        Capitale capitale2 = new Capitale("Ouagadougou","Burkina-Faso");
        capitale2.afficheToi();
    }
}

