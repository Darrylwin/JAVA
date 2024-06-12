package Java;

public class Employe {

    protected String nom, prenom;
    private Double salaire;
    private int NCI;

    public Employe() {
    }

    public Employe(int NCI) {

        this.NCI = NCI;
    }

    public Employe(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;
    }

    public Employe(String nom, String prenom, int n, double s) {

        this.nom = nom;
        this.prenom = prenom;
        NCI = n;
        salaire = s;
    }

    public void decrisToi() {

        System.out.println(String.join("Bonjour, je m'appelle ", nom, " ", prenom));
    }

    public String getNom() {

        return nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public Double getSalaire() {

        return salaire;
    }

    public int getNCI() {

        return NCI;
    }
}
