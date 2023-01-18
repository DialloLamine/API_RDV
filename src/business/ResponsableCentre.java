package business;

import java.util.ArrayList;
import java.util.List;

public class ResponsableCentre {
	
	private String nom;
	private String prenom;
	private List<AccueillantEntree> anccueillantsEntree = new ArrayList<AccueillantEntree>();
	private List<AccueillantSortie> anccueillantsSortie = new ArrayList<AccueillantSortie>();
	private List<Medecin> medecins = new ArrayList<Medecin>();
	private List<Infirmier> infirmiers = new ArrayList<Infirmier>();
	private List<Patient> patients = new ArrayList<Patient>();
	/**
	 * @param nom
	 * @param prenom
	 * @param nnnnnnnnnn
	 * @param anccueillantsSortie
	 * @param medecins
	 * @param infirmiers
	 * @param patients
	 */
	public ResponsableCentre(String nom, String prenom, List<AccueillantEntree> anccueillantsEntree,
			List<AccueillantSortie> anccueillantsSortie, List<Medecin> medecins, List<Infirmier> infirmiers,
			List<Patient> patients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.anccueillantsEntree = anccueillantsEntree;
		this.anccueillantsSortie = anccueillantsSortie;
		this.medecins = medecins;
		this.infirmiers = infirmiers;
		this.patients = patients;
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
	public List<AccueillantEntree> getAnccueillantsEntree() {
		return anccueillantsEntree;
	}
	public void setAnccueillantsEntree(List<AccueillantEntree> anccueillantsEntree) {
		this.anccueillantsEntree = anccueillantsEntree;
	}
	public List<AccueillantSortie> getAnccueillantsSortie() {
		return anccueillantsSortie;
	}
	public void setAnccueillantsSortie(List<AccueillantSortie> anccueillantsSortie) {
		this.anccueillantsSortie = anccueillantsSortie;
	}
	public List<Medecin> getMedecins() {
		return medecins;
	}
	public void setMedecins(List<Medecin> medecins) {
		this.medecins = medecins;
	}
	public List<Infirmier> getInfirmiers() {
		return infirmiers;
	}
	public void setInfirmiers(List<Infirmier> infirmiers) {
		this.infirmiers = infirmiers;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "ResponsableCentre [nom=" + nom + ", prenom=" + prenom + 
				", anccueillantsEntree=" + anccueillantsEntree
				+ ", anccueillantsSortie=" + anccueillantsSortie 
				+ ", medecins=" + medecins + ", infirmiers="
				+ infirmiers + ", patients=" + patients + "]";
	}
	
	

}
