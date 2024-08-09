package conceptsbase.exo2;

public class Voiture {
    String marque;
    double prix;

    public Voiture() {

    }

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
        System.out.println("Marque: " + this.marque);
        System.out.println("Prix: " + this.prix);
    }

}
