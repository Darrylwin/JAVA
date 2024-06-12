package Java;

public class Cercle {
    protected double rayon;

    public Cercle(){
        rayon = 1;
    }

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double getRayon(){
        return rayon;
    }

    public double aire(){
        return rayon * rayon * 3.14;
    }

}
