/**
 * 
 */
package dao;

import java.util.List;

import business.Patient;

/**
 * @author DIALLO
 *
 */
public interface IPatientDAO {
	
	public Patient getPatientByNumeroNational(String numNa);
	
	public List<Patient> getListePatientByVille(String ville);

}
