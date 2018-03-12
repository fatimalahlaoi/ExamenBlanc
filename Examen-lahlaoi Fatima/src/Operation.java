
/**
 * Cette classe représente une opération élémentaire dans un compte
 * @author   HAFIDI IMAD
 */
public class Operation {
	/**
	 * La date de l'opération sous la forme jj/mm/aa (05/12/14)
	 */
	private String Date;
	/**
	 * montant de l'opération 
	 */
	private Float montant;
	/**
	 * Le type d'opération 
	 */
	private TypeOperation type;
	
	
	public Operation() {
		super();
	}
	/**
	 * constructeur de la classe opération prend une date et un montant et initialise tous les attributs
	 * @param date
	 * @param montant
	 */
	public Operation(String date, Float montant) {
		super();
		// TODO
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public TypeOperation getType() {
		return type;
	}
	public void setType(TypeOperation type) {
		this.type = type;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	/**
	 * une méthode qui return l'année de la date 
	 * @return String
	 */
	public String getAnnee(){
		String[] list =  this.Date.split("/");
				
				return  list[2];
			}
	/**
	 * une méthode qui return le mois de la date 
	 * @return String
	 */
	public String getMois(){
		String[] list =  this.Date.split("/");
				
				return  list[1];
			}
	/**
	 * une méthode qui return le jour de la date 
	 * @return String
	 */
	public String getJour(){
		String[] list =  this.Date.split("/");
				
				return  list[0];
			}
}
