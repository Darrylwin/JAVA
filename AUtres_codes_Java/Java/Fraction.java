public class Fraction {

    private int num, den;

    public Fraction(int num, int den) {

        this.num = num;
        this.den = den;
    }

    public void afficher() {

        System.out.println(num / den);
    }
}
