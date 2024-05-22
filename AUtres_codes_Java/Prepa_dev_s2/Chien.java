public class Chien {
    private String nom, race;
    private int age;

    // Constructeur paramétré

    public Chien(String nom, String race, int age){
        this.nom = nom;
        this.race = race;
        this.age = age;
    }

    // Les Getteurs
    public String getNom(){
        return nom;
    }
    public String getRace(){
        return race;
    }
    public int getAge(){
        return age;
    }

    // Les Modificateurs

    public void setAge(int unAge) {
        age = unAge;
    }
    public void setRace( String uneRace){
        race = uneRace;
    }
    public void setNom(String unNom){
        nom = unNom;
    }

    public void afficher(){
        System.out.println("Nom : " + nom + " - " + "Age : " + age + " - " + "Race : " + race);
    }

    public static void main(String[] args){
        // Instanciation de la classe
        Chien chien1 = new Chien("Pam","Yorkshire",15);
        Chien chien2 = new Chien("Mina","Yorkshire",5);
        Chien chien3 = new Chien("Hok","Jack Russell",12);

        // Appel des fonctions
        chien1.afficher();
        chien2.afficher();
        chien3.afficher();
    }
}
