package Java;

public class Chien{

    public static void main(String[] args){
        System.out.println("Le programme s'est exécuté correctement");
    }
    
    private String name;
    private int age;
    private String race;

    public Chien(String name, int age, String race){
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public void afficher(){
        System.out.println("Nom : {nom} - Age : {age} - Race : {race}");
    }
}
