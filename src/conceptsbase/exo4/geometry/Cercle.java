package conceptsbase.exo4.geometry;


public class Cercle {
    private final Point centre;
    private final Double rayon;

    // Constructeur
    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    // Méthode pour calculer le périmètre
    public Double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode pour calculer la surface
    public Double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode pour afficher les résultats
    public void afficher() {
        System.out.println("Centre du cercle : (" + centre.abscisse + ", " + centre.ordonnee + ")");
        System.out.println("Rayon : " + rayon);
        System.out.println("Périmètre : " + perimetre());
        System.out.println("Surface : " + surface());
    }
}
