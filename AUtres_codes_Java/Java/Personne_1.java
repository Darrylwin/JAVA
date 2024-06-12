package Java;

public class Personne_1 {

    public static void main(String[] args) {

        Personne_1 personne1 = new Personne_1("AGBOKA", 28);
        personne1.afficher();
        Personne_1 personne2 = new Personne_1();
        Personne_1 personne3 = new Personne_1(personne1);
        personne2.afficher();
        personne3.afficher();

    }

    private String nom;
    private int age;

    public Personne_1(String leNom, int lAge) {

        nom = leNom;
        age = lAge;
    }

    public Personne_1(Personne_1 p) {

        nom = p.nom;
        age = p.age;
    }

    public Personne_1(){}



    public void afficher() {

        System.out.println(String.join(" Mon nom est ", nom, " et mon Age est: "));
    }

}
