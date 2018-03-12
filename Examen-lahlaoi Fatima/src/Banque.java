
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;



/**
 * Cette classe représente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	private static final Integer Integer = null;
	private static final Float Float = null;
	/**
	 * Liste des clients, la clé est le numéro du client
	 */
	private HashMap<Integer, Client> mesClients;
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La méthode respecte les régles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le numéro du client est généré automatiquement ( dernier numéro +1)
	 * @param nom
	 * @param age
	 * @param typeCompte
	 * @return false : si le client n'est pas ajouté
	 */
	public boolean addClient(String nom,String prenom, Integer age){
		for(int i=0;i<=mesClients.size();i++) {
		Client c = mesClients.get(i);
		if(c==null)	mesClients.put(i, new Client(nom,prenom,age));

		}
		
		return true;
	}
	/**
	 * La méthode ajoute un compte et l'attribue à un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas crée
	 */
	public boolean addCompte(Client client, String typeCompte){
		Compte c = null;
		if(typeCompte=="CompteCourant") c = new CompteCourant((client.getId(),null,null);
		
		client.mesComptes.add(c);
		return true;
	}
	/**
	 * La méthode supprime un client si seulement si le solde de tous ses comptes 
	 * est zéro
	 * @param client
	 * @return false si le client est supprimé
	 */
	public boolean removeClient(Client client) {
		//TODO
		return false;
	}
	/**
	 * Cette méthode affiche les relvés bancaires d'un client pour une date précise(05/14)
	 * @param id
	 */
	public void afficheTousComptesClient(Integer id, String mois, String année){
		//TODO
	}

}
