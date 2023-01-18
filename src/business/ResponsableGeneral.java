package business;

public class ResponsableGeneral {

	private String nom;
	private String prenom;
	private String statut;
	/**
	 * @param nom
	 * @param prenom
	 * @param statut
	 */
	public ResponsableGeneral(String nom, String prenom, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	@Override
	public String toString() {
		return "ResponsableGeneral [nom=" + nom + ", prenom=" + prenom + ", statut=" + statut + "]";
	}
	
	
}
