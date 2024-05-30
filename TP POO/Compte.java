public class Compte {

    private double solde;

    public Compte() {
    }

    public Compte(double solde) {

        this.solde = solde;
    }

    public Compte(Compte compte) {

        solde = compte.solde;
    }

    public double getSolde() {

        return solde;
    }

    public void setSolde(double unSolde) {

        solde = unSolde;
    }

	public void afficher(){
		if (solde >= 0) {
			System.out.println("Le solde est débiteur de " + solde + " FCFA");
		}
		else{
			System.out.println("Le solde est créditeur de " + (-solde) + " FCFA");
		}
	}

	public void deposer(double montant){

		solde += montant;
	}

	public void retirer(double montant){
		solde -= montant;
	}

    public void virerVers(double montant, Compte compte_b){
        this.retirer(montant);
        compte_b.deposer(montant);
    }

	public static void main(String[]args){

	Compte compte1 = new Compte();
	Compte compte2 = new Compte(15000);

	compte1.deposer(5000);
	compte2.deposer(15000);

	compte2.retirer(20000);
	compte2.virerVers(25000,compte1);

	compte1.afficher();
	compte2.afficher();
	
	}    

}
