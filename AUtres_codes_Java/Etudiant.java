public class Etudiant {
    private String nom;
    private int age;
    private double note;

    public Etudiant(String nom, int age, double note) {
        this.nom = nom;
        this.age = age;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void afficherEtudiant() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
        System.out.println("Note: " + note);
    }

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Jean", 20, 15.5);
        etudiant.afficherEtudiant();
    }
}
