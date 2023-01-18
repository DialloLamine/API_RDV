/**
 * 
 */
package business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author DIALLO
 *
 */
public class Patient {
	
	private String numNa;
	private String nom;
	private String prenom;
	private Date dateNais;
	private String pays;
	private String ville;
	private String adresse;
	private List<Planning> plannings = new ArrayList<Planning>();
	/**
	 * @param numNa
	 * @param nom
	 * @param prenom
	 */
	public Patient(String numNa, String nom, String prenom) {
		super();
		this.numNa = numNa;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Patient() {}
	
	
	
	/**
	 * @param numNa
	 * @param nom
	 * @param prenom
	 * @param dateNais
	 * @param pays
	 * @param ville
	 */
	public Patient(String numNa, String nom, String prenom, Date dateNais, String pays, String ville) {
		super();
		this.numNa = numNa;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.pays = pays;
		this.ville = ville;
	}
	
	
	
	/**
	 * @param numNa
	 * @param nom
	 * @param prenom
	 * @param dateNais
	 * @param pays
	 * @param ville
	 * @param adresse
	 * @param planning
	 */
	public Patient(String numNa, String nom, String prenom, Date dateNais, String pays, String ville,
			String adresse, List<Planning> plannings) {
		super();
		this.numNa = numNa;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.pays = pays;
		this.ville = ville;
		this.adresse = adresse;
		this.plannings = plannings;
	}
	
	
	
	
	// method loadFromdb(Strin natnum) return this;
	
	
	public String getNumNa() {
		return numNa;
	}
	public void setNumNa(String numNa) {
		this.numNa = numNa;
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
	public Date getDateNais() {
		return dateNais;
	}
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	public List<Planning> getPlannings() {
		return plannings;
	}
	public void setPlannings(List<Planning> plannings) {
		this.plannings = plannings;
	}
	@Override
	public String toString() {
		return " \t\t\t\n numNa = " + numNa + "\t\t\t\n nom = " + nom + "\t\t\t\n prenom = " + prenom
				+ "\t\t\t\n dateNais = " + dateNais + "\t\t\t\n pays = " + pays
				 + "\t\t\t\n ville= " + ville +
				 "\t\t\t\n ville= " + adresse +
				  "\t\t\t\n ville= " + plannings ;
	}
	
	
}
