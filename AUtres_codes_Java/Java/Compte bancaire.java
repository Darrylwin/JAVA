private class CompteBancaire {

    public static void main(String[] args ){

        CompteBancaire compte1 = new CompteBancaire(){};
        CompteBancaire compte2 = new CompteBancaire(15000);
        compte1.deposer(5000);
        compte2.deposer(15000);
        compte2.retirer(20000);
        System.out.println(compte1.solde);
        System.out.println(compte2.solde);
    }

    private double solde;

    public CompteBancaire(){}

    public CompteBancaire(double solde){

        this.solde = solde;
    }

    public CompteBancaire(CompteBancaire compteN){

        solde = compteN.solde;
    }

    public void afficher(){

        if solde < 0{
            System.out.println(String.join("Le solde estdébiteur de ",-solde,"FCFA"))
        
        }
        else{

            System.out.println(String.join("Le solde créditeur de ",solde,"FCFA"))
        }

    }

    public double deposer(uneSomme){

        return solde + uneSomme;
    }

    public double retirer(){
        
        return solde - uneSomme;
    }

    public double virerVers(){}

}
