package dao;

import java.util.List;

import business.Patient;

public abstract class AbstractDAOFactory {
	
	private static AbstractDAOFactory factory;
	

	public static AbstractDAOFactory getFactory() {
		return factory;
	}

	public static void setFactory(AbstractDAOFactory factory) {
		AbstractDAOFactory.factory = factory;
	}
	
	public abstract IPatientDAO createPatientDAO();
	
	public abstract List<Patient> getListePatientByVille(String ville);
	
	public abstract Patient getPatientByNumeroNational(String numNa);
	
}
