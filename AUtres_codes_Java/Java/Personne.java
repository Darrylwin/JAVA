public class Personne {

    public static void main(String[] args) {

        Personne personne1 = new Personne("AGBOKA", 28);
        personne1.afficher();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne(personne1); 
        personne2.afficher();
        personne3.afficher();

    }

    private String nom;
    private int age;

    public Personne(String leNom, int lAge) {

        nom = leNom;
        age = lAge;
    }

    public Personne(Personne p) {

        nom = p.nom;
        age = p.age;
    }

    public Personne(){}



    public void afficher() {

        System.out.println(String.join(" Mon nom est ", nom, " et mon Age est: "));
    }

}
