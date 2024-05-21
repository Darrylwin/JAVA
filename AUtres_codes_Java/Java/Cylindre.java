public class Cylindre extends Cercle{

    private int hauteur;

    public Cylindre(){

    }

    public Cylindre(double rayon){

        this.rayon = rayon;
    }

    public Cylindre(double rayon, int hauteur){

        super(rayon);
        this.hauteur = hauteur;
    }

    public int getHauteur(){

        return hauteur;
    }

    public  double volume(){

        return aire() * hauteur;
    }


}
