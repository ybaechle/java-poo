package conceptsbase.exo2;

public class Voiture {
    private String marque;
    private double prix;

    // Contructeur sans paramètres
    public Voiture() {
    this.marque = "Mercedes";
    this.prix = 50000;
    }

    // Getters et Setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
    }

}
