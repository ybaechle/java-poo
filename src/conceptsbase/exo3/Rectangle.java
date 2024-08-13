package conceptsbase.exo3;

public class Rectangle {
    public Double longueur;
    public Double largeur;

    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Double surface() {
        return longueur * largeur;
    }

    public Double perimetre() {
        return 2 * (longueur + largeur);
    }

    public void afficher() {
        System.out.println("Longueur : " + longueur + ", Largeur : " + largeur);
        System.out.println("Surface : " + surface());
        System.out.println("Périmètre : " + perimetre());
    }
}
