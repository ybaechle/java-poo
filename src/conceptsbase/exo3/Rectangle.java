package conceptsbase.exo3;

public class Rectangle {
    private Double longueur;
    private Double largeur;

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

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }
}
