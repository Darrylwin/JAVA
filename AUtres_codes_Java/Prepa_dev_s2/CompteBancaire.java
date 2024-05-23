class Compte {

    private double solde;

    public Compte(){}

    public Compte(double solde){
        this.solde = solde;
    }

    public Compte(Compte cpt){
        solde = cpt.solde;
    }

    public String afficher(){

        if (solde >= 0){
            return ("Le solde est créditeur de : " + solde + "FCFA");
        }

        else {
            return ("Le solde est débiteur de : " + (-solde) + "FCFA");
        }
    }

    public double deposer(double montant){
        return (solde = solde + montant);
    }

    public double retirer(double montant){
        return (solde = solde - montant);
    }

    public static void main(String[] args){

        Compte compte1 = new Compte();
        Compte compte2 = new Compte(15000);
        Compte compte3 = new Compte(compte2);

        compte1.deposer(5000);
        compte2.deposer(15000);
        compte2.retirer(200000);

        System.out.println(compte1.afficher());
        System.out.println(compte2.afficher());
        System.out.println(compte3.afficher());
    }
}
