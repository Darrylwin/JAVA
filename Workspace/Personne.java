public class Personne {

    public static void main(String[] args) {
        System.out.print("Très class ce soir. En Versace?");
    }

    private String nom, prenom;
    private int age;

    // CONSTRUCTEURS (Ils prennent le nom de la classe)
    // constructeur par défaut
    // On ne peut avoir qu'un seul constructeur par défaut dans une classe

    // commentaire à enlever plus tard: constructeur de base Personne(){}

    // public Personne() {
    // nom = // .....
    // age = // ....
    // /* Utilisé lorsqu'on connait les valeures qui vont etre pasées */
    // }

    // On peut avoir plusieurs constructeurs dans une même classe
    // Constructeur paramétré (Il a comme parametre les attributs de la classe)

    // premier constructeur paramétré (Exaussif: car il peut prendre en parametre
    // tous les attributs de la classe):

    public Personne(String Unenom, String Uneprenom, int Uneage /* Entre parenthèses on met les inconnus */) {
        nom = Unenom;
        prenom = Uneprenom;
        age = Uneage;
        // Dans ce cas, on ne connaît pas les valeures qui vont etre passées.
    }

    // second constructeur paramétré:
    public Personne(int Uneage) {
        age = Uneage;
    }

    // Constructeur par recopie (ne prend qu'un paramètre qui est l'objet à copier):
    public Personne(/* La classe de l'objet qui represente ici son type */Personne /* Le nom de l'objet */ Personne_1) {
        nom = Personne_1.nom;
        prenom = Personne_1.prenom;
        age = Personne_1.age;
    }

    // SELECTEURS ou ACCESSEURS
    // Un selecteur renvoie la valeure d'un attribut. Elle a un type de retour mais
    // pas de paramètre en entrée puisque la variable à retourner vient avec son
    // état

    public String getNom() {
        /*
         * Le 'get' permet d'accéder à la variable et ensuite on met le nom de la
         * variable mais commençant par un grand caractère.
         */
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    // MUTATEURS ou MODIFICATEURS
    // Ne retourne pas de valeure. Donc a pour type de retour void

    public void setNom(String uneNom) {
        nom = /* La nouvelle valeure de la variable */ uneNom;
    }

    public void setPrenom(String unPrenom) {
        prenom = unPrenom;
    }

    public void setAge(int UnAge) {
        age = UnAge;
    }

    // Methode d'instance
    public parler(){
        //Instructions
    }

    public manger(){

    }
}