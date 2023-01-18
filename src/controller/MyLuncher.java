package controller;

import java.util.Iterator;
import java.util.List;

import business.Patient;
import dao.AbstractDAOFactory;
import dao.IPatientDAO;
import dao.mySQL.MySQLDAOFactory;
import dao.mySQL.MySQLPatientDAO;

public class MyLuncher {

	public static void main(String[] args) {
		
		AbstractDAOFactory.setFactory(MySQLDAOFactory.getInstance());
       
		IPatientDAO psql = new MySQLPatientDAO();

        List<Patient> listByTown =psql.getListePatientByVille("Brussel");
        Iterator<Patient> listPr = listByTown.iterator();

        int cpt = 1;
        while(listPr.hasNext()){
            Patient pa = listPr.next();
            System.out.println("Patient " + cpt + " : " + pa);
            cpt++;
            System.out.println();
        }
        
        
        System.out.println("=================================================");
        System.out.println("=================================================");
        
        
        //Patient patient = new Patient();
        
        IPatientDAO psqla = new MySQLPatientDAO();

        Patient paByNN = psqla.getPatientByNumeroNational("22.10.01.123.12");
    

    
            System.out.println(paByNN);

	}

}
