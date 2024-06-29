public class Maison extends Batiment {

    int nbPieces;

    Maison() {
    }

    Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    @Override
    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String uneAdresse) {
        this.adresse = uneAdresse;
    }

    public int getNbPieces() {
        return this.nbPieces;
    }

    public void setNbPieces(int unNbPieces) {
        this.nbPieces = unNbPieces;
    }

}
