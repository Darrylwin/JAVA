public  class Vehicule{
    
    private String moteur;
    private int n_cheveaux;
    private int puissance; // exprimée en Newton-mètres de couples

    public Vehicule(String moteur,int n_cheveaux, int puissance){
        this.moteur = moteur;
        this.n_cheveaux = n_cheveaux;
        this.puissance = puissance;
    }

    Vehicule v1 = new Vehicule("W16",1600,10000);

    public void demarrer(){
        system.out.print("A fond la caisse! ");
   }

}