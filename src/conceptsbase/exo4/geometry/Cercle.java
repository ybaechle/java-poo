package conceptsbase.exo4.geometry;


public class Cercle {
    private Point centre;
    private double rayon;

    // Constructeur
    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    // Méthode pour tester si un point appartient au cercle
    public void testAppartenance(Point p) {
        double distance = Math.sqrt(Math.pow(centre.getAbscisse() - p.getAbscisse(), 2) + Math.pow(centre.getOrdonnee() - p.getOrdonnee(), 2));
        if (distance <= rayon) {
            System.out.println("Le point appartient au cercle.");
        } else {
            System.out.println("Le point n'appartient pas au cercle.");
        }
    }

    // Méthode pour afficher les résultats
    public void afficher() {
        System.out.println("Centre du cercle: (" + centre.getAbscisse() + ", " + centre.getOrdonnee() + ")");
        System.out.println("Rayon du cercle: " + rayon);
        System.out.println("Périmètre: " + perimetre());
        System.out.println("Surface: " + surface());
    }
}
