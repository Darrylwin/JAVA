public class Vehicule {

    private String marque, modele;
    private int annee_de_fabrication;

    Vehicule(String marque, String modele, int annee_de_fabrication) {
        this.marque = marque;
        this.modele = modele;
        this.annee_de_fabrication = annee_de_fabrication;
    }

    protected String getMarque() {
        return this.marque;
    }

    protected String getModele() {
        return this.modele;
    }

    protected int getAnne_de_fabrication() {
        return this.annee_de_fabrication;
    }

    protected void setMarque(String uneMarque) {
        this.marque = uneMarque;
    }

    protected void setModele(String unModele) {
        this.modele = (unModele);
    }

    protected void setAnne_de_fabrication(int uneAnnee_de_fabrication) {
        this.annee_de_fabrication = uneAnnee_de_fabrication;
    }

    public void afficherDetails() {

        System.out.println("Voici les informations sur ce véhicule: \n" + "Marque : " + this.marque + " | Modele : " + this.modele + " | Annéé de fabrication : " + this.annee_de_fabrication + ".");
    }

    public static void main(String[] args) {
        Moto myMoto = new Moto("BMW", "IX7", 2018, 35);
        Voiture maMerco = new Voiture("Mercedes-Benz", "Classe S Maybach", 2023, 5);
        myMoto.afficherDetails();
        maMerco.afficherDetails();

    }

}


class Voiture extends Vehicule {

    private int nombre_de_portes;

    Voiture(String marque, String modele, int annee_de_fabrication, int nombre_de_portes) {
        super(marque, modele, annee_de_fabrication);
        this.nombre_de_portes = nombre_de_portes;
    }

    public int getNombre_de_portes() {
        return this.nombre_de_portes;
    }

    public void setNombre_de_portes(int unNombre_de_portes) {
        this.nombre_de_portes = unNombre_de_portes;
    }


    public void afficherDetails() {

        System.out.println("Voici les informations sur cette Voiture :\n" + " Marque : " + this.getMarque() + " | Modele : " + this.getModele() + " | Annéé de fabrication : " + this.getAnne_de_fabrication() + " | Nombre de portes : " + this.nombre_de_portes + ".");
    }

}

class Moto extends Vehicule {

    private double cylindree;

    Moto(String marque, String modele, int annee_de_fabrication, double cylindree) {
        super(marque, modele, annee_de_fabrication);
        this.cylindree = cylindree;
    }

    public double getCylindree() {
        return this.cylindree;
    }

    public void setCylindree(double uneCylindree) {
        this.cylindree = uneCylindree;
    }


    public void afficherDetails() {

        System.out.println("Voici les informations sur cette Moto:\n" + "Marque : " + this.getMarque() + " | Modele : " + this.getModele() + " | Annéé de fabrication : " + this.getAnne_de_fabrication() + " | Nombre de cylindrée: " + this.cylindree + ".");
    }

}