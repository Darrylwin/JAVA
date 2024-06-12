class CompteBancaire {

    private double solde;

    public CompteBancaire(){}

    public CompteBancaire(double solde){
        this.solde = solde;
    }

    public CompteBancaire(CompteBancaire cpt){
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

        CompteBancaire compte1 = new CompteBancaire();
        CompteBancaire compte2 = new CompteBancaire(15000);
        CompteBancaire compte3 = new CompteBancaire(compte2);

        compte1.deposer(5000);
        compte2.deposer(15000);
        compte2.retirer(200000);

        System.out.println(compte1.afficher());
        System.out.println(compte2.afficher());
        System.out.println(compte3.afficher());
    }
}
