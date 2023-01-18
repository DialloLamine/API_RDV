package business;

public class Vaccin {
	private String nom;
	private int dureeEntreDose;
	private int numLot;
	
	private Boolean conditionAdmission;

	/**
	 * @param nom
	 * @param dureeEntreDose
	 * @param numLot
	 * @param conditionAdmission
	 */
	public Vaccin(String nom, int dureeEntreDose, int numLot, Boolean conditionAdmission) {
		super();
		this.nom = nom;
		this.dureeEntreDose = dureeEntreDose;
		this.numLot = numLot;
		this.conditionAdmission = conditionAdmission;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDureeEntreDose() {
		return dureeEntreDose;
	}

	public void setDureeEntreDose(int dureeEntreDose) {
		this.dureeEntreDose = dureeEntreDose;
	}

	public int getNumLot() {
		return numLot;
	}

	public void setNumLot(int numLot) {
		this.numLot = numLot;
	}

	public Boolean getConditionAdmission() {
		return conditionAdmission;
	}

	public void setConditionAdmission(Boolean conditionAdmission) {
		this.conditionAdmission = conditionAdmission;
	}

	@Override
	public String toString() {
		return "Vaccin [nom=" + nom + ", dureeEntreDose=" + dureeEntreDose + ", numLot=" + numLot
				+ ", conditionAdmission=" + conditionAdmission + "]";
	}
	
	
	
	

}
