
public class CompteCourant extends Compte{
	/**
	 * le solde Max est une valeur négative que le compte ne doit jamais dépasser
	 */
	private Float soldeMax;
	
	public CompteCourant(Integer numero, Float solde, Float soldeMax) {
		super(numero, solde);
		this.soldeMax = soldeMax;
	}

	@Override
	/**
	 * Le  nombre de signataire ne doit jamais dépasser 4
	 */
	public boolean addSignataires(Client client) {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSignataires(Integer id) {
		getSignataires().remove(id);
				
				return true;
			}
	/**
	 * Recalcule le solde 
	 */
	@Override
	public boolean addOperation(Operation operation) {
		getListeOperations().put(this.getDate(), operation);
		return true;
	}
	
	/**
	 * Une méthode qui affiche le relvé d'un mois pour une année (5/14)
	 */
	public void afficheReleveCourant(String mois, String anne){
		System.out.println("Vous avez en "+mois+" "+anne+" un solde de "+this.getSolde());
		
	}
		
	/**
	 * Une méthode qui affiche la somme des opérations de Débit d'un mois 
	 * pour une année (5/14)
	 */
	public void afficheDebitCourant(String mois, String annee){
		String Date= mois+"/"+annee;
		Operation o = new Operation() ;
		TypeOperation Debit =TypeOperation.Debit;
		
		if(o.getType()==Debit && o.getMois()==mois && o.getAnnee()==annee) {
		System.out.println("le debit courant  en "+Date+" est  "+o.getMontant());}
	}
	/**
	 * Une méthode qui affiche la somme des opérations de Crédit d'un mois 
	 * pour une année (5/14)
	 * @param mois
	 * @param année
	 */
	public void afficheCreditCourant(String mois, String annee){
		String Date= mois+"/"+annee;
		Operation o = new Operation() ;
		TypeOperation Credit =TypeOperation.Credit;
		
		if(o.getType()==Credit && o.getMois()==mois && o.getAnnee()==annee) {
		System.out.println("le debit courant  en "+Date+" est  "+o.getMontant());}
	}

	
}

	