public class Test {

    public static void main(String[] args) {

        Humain h1 = new Humain("Darryl-win"," Logossou");
        System.out.print(h1.name);
        System.out.print(h1.prenom);

        Vehicule v1 = new Vehicule(" W16 ",1600,10000);
        System.out.println(v1.moteur);
        System.out.println(v1.puissance);
        System.out.println(v1.n_cheveaux);
    
    }

}
