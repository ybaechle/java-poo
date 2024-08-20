package conceptsbase.exo3;

public class Rectangle {
    private Double longueur;
    private Double largeur;


    // Constructeur sans paramètres
    public Rectangle() {
        this.longueur = 50.0;
        this.largeur = 30.0;
    }

    // Getters et Setters
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

    // Méthode pour calculer la surface du rectangle
    public Double surface() {
        return longueur * largeur;
    }

    // Méthode pour calculer le périmètre du rectangle
    public Double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode pour afficher les attributs + la surface + le périmètre du rectangle
    public void afficher() {
        System.out.println("Longueur : " + longueur + ", Largeur : " + largeur);
        System.out.println("Surface : " + surface());
        System.out.println("Périmètre : " + perimetre());
    }
}
