public class Rectangle {
    private double longueur, largeur;

    public Rectangle() {
        longueur = 10;
        largeur = 5;
    }

    // public Rectangle( double UneLongueur, double UneLargeur){
    // longueur = UneLongueur;
    // largeur = UneLargeur;
    // }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // public Rectangle( Rectangle Un_Rectangle){
    // longueur = Un_Rectangle.longueur;
    // largeur = Un_Rectangle.largeur;
    // }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLongueur(double La_Longeur) {
        longueur = La_Longeur;
    }

    public void setLargeur(double La_Largeur) {
        largeur = La_Largeur;
    }

    // Methode d'instance
    public double Perimetre() {
        // Instructions
        return ((getLongueur() + getLargeur()) * 2);
    }

    public double Demi_Perimetre() {
        // Instructions
        return Perimetre() / 2;
    }

    public double Aire() {
        // Instructions
        return getLongueur() * getLargeur();
    }
}
