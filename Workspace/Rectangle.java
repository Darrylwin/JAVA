public class Rectangle {

    private double longueur, largeur;

    public Rectangle() {
        longueur = 10;
        largeur = 5;
    }

    // public Rectangle( double UneLongueur, double UneLargeur){
    // longueur = UneLongueur;
    // largeur = UneLargeur;
    // }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

/*    public Rectangle(double uneLongueur) {
        longueur = uneLongueur;
    }
    public Rectangle(double uneLargeur) {
        largeur = uneLargeur;
    }*/  // Erreur car les deux constructeurs ont le même type

    public Rectangle( Rectangle Un_Rectangle){
    longueur = Un_Rectangle.longueur;
    largeur = Un_Rectangle.largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLongueur(double La_Longeur) {
        longueur = La_Longeur;
    }

    public void setLargeur(double La_Largeur) {
        largeur = La_Largeur;
    }

    // Methode d'instance
    public double Perimetre() {
        // Instructions
        return ((getLongueur() + getLargeur()) * 2);
    }

    public double Demi_Perimetre() {
        // Instructions
        return Perimetre() / 2;
    }

    public double Aire() {
        // Instructions
        return getLongueur() * getLargeur();
    }

    // Méthode principale
    // Apres les methodes de la classe

    public static void main(String[] args) {

        System.out.println("Hello World !");

        // Instanciation d'une classe. On  instancie une classe avec le Constructeur.
        // nomClasse nomObjet = new Constructeur();

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 10.5);
        Rectangle rectangle3 = new Rectangle(rectangle1);

        // Affichage des Informations:

        System.out.print("La longueur du rectangle 1 est: ");
        System.out.println(rectangle1.longueur);

                    /* Ou */

        System.out.println("La longueur du rectangle 2 est: " + rectangle2.longueur);

                    /* Ou */

        System.out.println("La longueur du rectangle 3 est: " + rectangle3.longueur);

        // Appelde méthodes:

        System.out.println("Le perimètre du rectangle 1 est: " + rectangle1.Perimetre());
        System.out.println("L'Aire du rectangle 2 est: " + rectangle2.Aire());
        System.out.println("Le Démi-périmètre du rectangle 3 est: " + rectangle3.Demi_Perimetre());

        // Utilisation des setteurs et des getteurs

                      /* Setteurs */
        rectangle1.setLongueur(20);
        rectangle2.setLargeur(10.10);

        System.out.println("La longueur du rectangle 1 après modification est: " + rectangle1.longueur);
        System.out.println("La largeur du rectangle 2 après modification est: " + rectangle2.largeur);

        System.out.println("Le nouveau démi-périmètre du rectagle 1 est :" + rectangle1.Demi_Perimetre());
        System.out.println("Le nouveau démi-périmetre du rectagle 3 est :" + rectangle3.Demi_Perimetre());

                        /* Getteurs */
        System.out.println("La longueur du rectangle 1 est: " + rectangle1.getLongueur());
        System.out.println("La largeur du rectangle 3 est: " + rectangle3.getLargeur());

    }
}


// le code doit être contenu dans la classe.
// S'il est en dehors, le code ne marchera pas.