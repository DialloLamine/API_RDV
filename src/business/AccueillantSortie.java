package business;

import java.util.ArrayList;
import java.util.List;

public class AccueillantSortie {
	
	private String nom;
	private String prenom;
	private List<Patient> patientsByDay = new ArrayList<Patient>();
	private int numLotPatient;
	/**
	 * @param nom
	 * @param prenom
	 * @param patientsByDay
	 * @param numLotPatient
	 */
	public AccueillantSortie(String nom, String prenom, List<Patient> patientsByDay, int numLotPatient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.patientsByDay = patientsByDay;
		this.numLotPatient = numLotPatient;
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
	public List<Patient> getPatientsByDay() {
		return patientsByDay;
	}
	public void setPatientsByDay(List<Patient> patientsByDay) {
		this.patientsByDay = patientsByDay;
	}
	public int getNumLotPatient() {
		return numLotPatient;
	}
	public void setNumLotPatient(int numLotPatient) {
		this.numLotPatient = numLotPatient;
	}
	@Override
	public String toString() {
		return "AccueillantSortie [nom=" + nom + ", prenom=" + prenom + ", patientsByDay=" + patientsByDay
				+ ", numLotPatient=" + numLotPatient + "]";
	}

	
	
}
