// Classe EquipeDeBasket

public class Equipe {

    private String nom;
    private int stats;
    private String sponsor;
    private int nombre_de_joueurs;
    // attribut coach de type Coach définit dans un autre fichier
    private Coacher coach;

    // Constructeur de ma classe
    Equipe(String nom, int stats, String sponsor, int nombre_de_joueurs, Coacher coach) {
        this.nom = nom;
        this.stats = stats;
        this.sponsor = sponsor;
        this.nombre_de_joueurs = nombre_de_joueurs;
        this.coach = coach;
    }
}

//  Equipe lakers = new Equipe("Lakers",79,"NBA",25,"?")
