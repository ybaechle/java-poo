package heritage.exo2;

public class Ville {
    private String nom;
    protected int nbHab;

    // Constructeur avec un argument
    public Ville(String leNom) {
        this.nom = leNom;
        this.nbHab = -1;
    }

    // Constructeur avec deux arguments
    public Ville(String leNom, int leNbHab) {
        this.nom = leNom;
        if (leNbHab < 0) {
            System.out.println("Un nombre d'habitant doit être positif.");
            this.nbHab = -1;
        } else {
            this.nbHab = leNbHab;
        }
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Getter pour nbHab
    public int getNbHab() {
        return nbHab;
    }

    // Setter pour nbHab
    public void setNbHab(int leNbHab) {
        if (leNbHab < 0) {
            System.out.println("Un nombre d'habitant doit être positif. La modification n'a pas été prise en compte.");
        } else {
            this.nbHab = leNbHab;
        }
    }

    // Méthode afficheToi
    public void afficheToi() {
        System.out.println("Ville: " + nom);
        if (nbHab == -1) {
            System.out.println("Nombre d'habitants: inconnu");
        } else {
            System.out.println("Nombre d'habitants: " + nbHab);
        }
    }
}

