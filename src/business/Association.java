package business;

import java.util.ArrayList;
import java.util.List;

public class Association {
	
	private List<Centre> centres = new ArrayList<Centre>();
	private List<Patient> patients = new ArrayList<Patient>();
	/**
	 * @param centres
	 * @param patients
	 */
	public Association(List<Centre> centres, List<Patient> patients) {
		super();
		this.centres = centres;
		this.patients = patients;
	}
	public List<Centre> getCentres() {
		return centres;
	}
	public void setCentres(List<Centre> centres) {
		this.centres = centres;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Association [centres=" + centres + ", patients=" + patients + "]";
	}
	
	
}
