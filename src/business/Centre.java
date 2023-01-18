/**
 * 
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DIALLO
 *
 */
public class Centre {
	
	private String localite;
	private String adresse;
	//private Timestamp heureOuvert;
	private String heureOuvert;
	private List<Vaccin> vaccins = new ArrayList<Vaccin>();
	private List<Patient> patients = new ArrayList<Patient>();
	private List<Planning> plannings = new ArrayList<Planning>();
	/**
	 * @param localite
	 * @param adresse
	 * @param heureOuvert
	 */
	public Centre(String localite, String adresse, String heureOuvert) {
		super();
		this.localite = localite;
		this.adresse = adresse;
		this.heureOuvert = heureOuvert;
	}
	/**
	 * @param localite
	 * @param adresse
	 * @param heureOuvert
	 * @param vaccins
	 * @param patients
	 * @param plannings
	 */
	public Centre(String localite, String adresse, String heureOuvert, List<Vaccin> vaccins,
			List<Patient> patients, List<Planning> plannings) {
		super();
		this.localite = localite;
		this.adresse = adresse;
		this.heureOuvert = heureOuvert;
		this.vaccins = vaccins;
		this.patients = patients;
		this.plannings = plannings;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getHeureOuvert() {
		return heureOuvert;
	}
	public void setHeureOuvert(String heureOuvert) {
		this.heureOuvert = heureOuvert;
	}
	public List<Vaccin> getVaccins() {
		return vaccins;
	}
	public void setVaccins(List<Vaccin> vaccins) {
		this.vaccins = vaccins;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	

	
	public List<Planning> getPlannings() {
		return plannings;
	}
	public void setPlannings(List<Planning> plannings) {
		this.plannings = plannings;
	}
	@Override
	public String toString() {
		return "Centre [localite=" + localite + ", adresse=" + adresse + ", heureOuvert=" + heureOuvert + ", vaccins="
				+ vaccins + ", patients=" + patients + ", plannings=" + plannings + "]";
	}
	
	

}
