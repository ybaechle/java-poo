package conceptsbase.exo4.geometry;


public class TestCercle {
    public static void test() {
        // Création d'un point pour le centre du cercle
        Point centre = new Point(0.0, 0.0);

        // Création d'un cercle avec le centre et un rayon
        Cercle cercle = new Cercle(centre, 5.0);

        // Affichage des résultats
        cercle.afficher();

        // Création d'un point pour tester l'appartenance
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(6.0, 8.0);

        // Test de l'appartenance des points au cercle
        System.out.println("Test de l'appartenance des points:");
        System.out.println("1er test avec abscisse = 3.0 et ordonnée = 4.0:");
        cercle.testAppartenance(p1);
        System.out.println("2ème test avec abscisse = 6.0 et ordonnée = 8.0:");
        cercle.testAppartenance(p2);
    }
}

