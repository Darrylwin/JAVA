public  class Vehicule{
    
    public String moteur;
    public int n_cheveaux;
    public int puissance; // exprimée en Newton-mètres de couples
    public String marque;
    public String modele;

    public Vehicule(String moteur,int n_cheveaux, int puissance){
        this.moteur = moteur;
        this.n_cheveaux = n_cheveaux;
        this.puissance = puissance;
    }

    public void demarrer(){
        System.out.print("A fond la caisse! ");
   }

}