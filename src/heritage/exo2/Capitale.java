package heritage.exo2;

public class Capitale extends Ville {
    private String pays;

    // Constructeur avec 2 paramètres
    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }

    // Constructeur avec 3 paramètres
    public Capitale(String nom, String pays, int nbHab) {
        super(nom, nbHab);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    // Surcharge de la méthode parente afficheToi()
    @Override
    public void afficheToi() {
        System.out.print("Ville: " + getNom());
        if (nbHab == -1) {
            System.out.print(" nombre d'habitants: inconnu");
        } else {
            System.out.print(" nombre d'habitants: " + nbHab);
        }
        System.out.println(" Capitale de " + pays);
    }
}
