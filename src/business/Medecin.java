package business;

import java.util.ArrayList;
import java.util.List;

public class Medecin {

	private String nom;
	private String prenom;
	private List<Patient> patients = new ArrayList<Patient>();
	/**
	 * @param nom
	 * @param prenom
	 * @param patients
	 */
	public Medecin(String nom, String prenom, List<Patient> patients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Medecin [nom=" + nom + ", prenom=" + prenom + ", patients=" + patients + "]";
	}
	
	
}
