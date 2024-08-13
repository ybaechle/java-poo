package conceptsbase.exo4.geometry;


public class TestCercle {
    public static void execute() {
        // Créer un point centre pour le cercle
        Point centre = new Point(0.0, 0.0);
        // Créer un cercle avec un rayon de 5.0
        Cercle cercle = new Cercle(centre, 5.0);

        // Afficher les résultats du cercle
        cercle.afficher();
    }
}
