package dao.mySQL;

import java.util.List;

import business.Patient;
import dao.AbstractDAOFactory;
import dao.IPatientDAO;

public class MySQLDAOFactory extends AbstractDAOFactory{
	
	private static MySQLDAOFactory instance;
	
	

	
	public MySQLDAOFactory() {};

	public static MySQLDAOFactory getInstance() {
		if(instance == null)
			instance = new MySQLDAOFactory();
		return instance;
	}

	@Override
	public IPatientDAO createPatientDAO() {
		return  MySQLPatientDAO.getInstance();
	}

	@Override
	public List<Patient> getListePatientByVille(String ville) {
		
			AbstractDAOFactory factory = AbstractDAOFactory.getFactory();
	        //IPersonDao prDAO = MySqlDaoFactory.getInstance().createPersonDAO();
		 	IPatientDAO paDAO = factory.createPatientDAO();
	      return paDAO.getListePatientByVille(ville);
	}

	@Override
	public Patient getPatientByNumeroNational(String numNa) {
		
		AbstractDAOFactory factory = AbstractDAOFactory.getFactory();
        //IPersonDao prDAO = MySqlDaoFactory.getInstance().createPersonDAO();
	 	IPatientDAO paDAO = factory.createPatientDAO();
	 	return paDAO.getPatientByNumeroNational(numNa);
	}
	
	

}
