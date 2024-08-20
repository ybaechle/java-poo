package heritage.exo2;

public class Ville {
    private String nom;
    protected int nbHab;

    // Constructeur avec un seul paramètre
    public Ville(String nom) {
        this.nom = nom;
        this.nbHab = -1;
    }

    // Constructeur avec deux paramètres
    public Ville(String leNom, int leNbHab) {
        this.nom = leNom;
        if (leNbHab < 0) {
            System.out.println("Un nombre d'habitant doit être positif.");
            this.nbHab = -1;
        } else {
            this.nbHab = leNbHab;
        }
    }

    // Getter et Setters
    public String getNom() {
        return nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int leNbHab) {
        if (leNbHab < 0) {
            System.out.println("Un nombre d'habitant doit être positif. La modification n'a pas été prise en compte.");
        } else {
            this.nbHab = leNbHab;
        }
    }

    // Méthode d'affichage
    public void afficheToi() {
        System.out.println("Ville: " + nom);
        if (nbHab == -1) {
            System.out.println("Nombre d'habitants: inconnu");
        } else {
            System.out.println("Nombre d'habitants: " + nbHab);
        }
    }
}

