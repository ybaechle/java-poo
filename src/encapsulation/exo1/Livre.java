package encapsulation.exo1;

public class Livre {
    // Variables
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    // Constructeur sans paramètre
    public Livre() {
        this.titre = "Inconnu";
        this.auteur = "Inconnu";
        this.nbPages = 0;
        this.prix = 0.0;
        this.prixFixe = false;
    }

    // Constructeur avec paramètres titre et auteur
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = 0;
        this.prix = 0.0;
        this.prixFixe = false;
    }

    // Constructeur avec paramètres titre, auteur et nbPages
    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        setNbPages(nbPages);
        this.prix = 0.0;
        this.prixFixe = false;
    }

    // Constructeur avec paramètres titre, auteur, nbPages et prix
    public Livre(String titre, String auteur, int nbPages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        setNbPages(nbPages);
        setPrix(prix);
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    // Setter avec validation
    public void setNbPages(int nbPages) {
        if (nbPages > 0) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Erreur: Le nombre de pages doit être positif.");
        }
    }

    // Setter pour prix avec contrôle
    public void setPrix(double prix) {
        if (!prixFixe) {
            if (prix > 0) {
                this.prix = prix;
                this.prixFixe = true;
            } else {
                System.out.println("Erreur: Le prix doit être positif.");
            }
        } else {
            System.out.println("Erreur: Le prix ne peut être modifié qu'une seule fois.");
        }
    }

    // Méthode pour afficher une description du livre
    public void afficheToi() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Nombre de pages : " + nbPages);
        System.out.println("Prix : " + prix + " euros");
    }

    // Méthode main pour tester la classe Livre
    public static void main(String[] args) {
        // Créer une instance de Livre sans prix
        Livre livre1 = new Livre("Titre1", "Auteur1", 300);
        livre1.setPrix(25.50);
        livre1.setPrix(30.00); // Provoque une erreur

        // Créer une instance de Livre avec prix
        Livre livre2 = new Livre("Titre2", "Auteur2", 450, 20.00);
        livre2.setPrix(22.00); // Provoque une erreur

        // Afficher la description des deux livres
        System.out.println("\nDescription du livre 1 :");
        livre1.afficheToi();
        System.out.println("\nDescription du livre 2 :");
        livre2.afficheToi();
    }
}