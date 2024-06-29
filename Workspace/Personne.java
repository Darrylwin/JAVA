public class Personne {
    private String nom;
    private int age;

    public Personne(String leNom, int lAge){
        nom = leNom;
        age = lAge;
    }

    public Personne(){}

    public Personne(@org.jetbrains.annotations.NotNull Personne p){
        age = p.age;
        nom = p.nom;
    }

    public String afficher(){

        return ("Mon nom est : " + nom + " et mon Age : " + age + "ans");
    }

    public static void main(String[] args){
        Personne personne0 = new Personne();
        System.out.println(personne0.afficher());

        Personne personne1 = new Personne("Coudeprix",25);
        System.out.println(personne1.afficher());

        Personne personne2 = new Personne();
        System.out.println(personne2.afficher());

        Personne personne3 = new Personne(personne1);
        System.out.println(personne1.afficher());

    }
}
