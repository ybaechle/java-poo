package encapsulation.exo1;

public class Livre {
    // Variables
    private String titre;
    private String auteur;
    private int nbPages;

    // Constructeur
    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
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

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    // Méthode main pour créer et afficher les auteurs de deux livres
    public static void main(String[] args) {
        // Créer deux instances de Livre
        Livre livre1 = new Livre("Titre1", "Auteur1", 300);
        Livre livre2 = new Livre("Titre2", "Auteur2", 450);

        // Afficher les auteurs des deux livres
        System.out.println("Auteur du livre 1 : " + livre1.getAuteur());
        System.out.println("Auteur du livre 2 : " + livre2.getAuteur());
    }
}
