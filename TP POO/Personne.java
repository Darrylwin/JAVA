public class Personne {
    
    private String nom;
    private int age;

    public Personne(String leNom, int lAge) {

        nom = leNom;
        age = lAge;
    }

    public Personne(){
        // nom = "Il";
        // age = 1800;
    }

    public Personne(Personne p){

        nom = p.nom;
        age = p.age;
    }

    public String afficher(){

        return ("Mon nom est: " + nom + " et mon âge est: " + age);
    }

    public static void main(String[] args){

        Personne personne1 = new Personne("LABOU", 19);
        personne1.afficher();
        Personne personne2 = new Personne();
        Personne personne3 = new Personne(personne1);

        System.out.println(personne1.afficher());
        System.out.println(personne2.afficher());
        System.out.println(personne3.afficher());

    }
}
