package business;

public class Infirmier {
	
	private String nom;
	private String prenom;
	/**
	 * @param nom
	 * @param prenom
	 */
	public Infirmier(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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
	@Override
	public String toString() {
		return "Infirmier [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
