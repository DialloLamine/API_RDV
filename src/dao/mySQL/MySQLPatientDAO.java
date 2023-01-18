package dao.mySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Patient;
import dao.IPatientDAO;

public class MySQLPatientDAO implements IPatientDAO{
	
	
	 private  String sqlp ="select * from Patient where numNa=?";

    private  String sql ="select * from Patient where ville=?";

	
	public static MySQLPatientDAO instance;
	
	public static MySQLPatientDAO getInstance() {
		if(instance == null)
			instance = new MySQLPatientDAO();
		return instance;
	}
	
	public MySQLPatientDAO() {}; // private ????

	

	@Override
	public List<Patient> getListePatientByVille(String ville) {
		
		Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Patient> liste = new ArrayList<>();


        // To Do
        try {
            c = MysqlConnectionFactory.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1,ville);
            rs = ps.executeQuery();

            Patient p = null;
            while (rs.next()) {
                p = new Patient(rs.getString(1),rs.getString(2),
                        rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getString(6));
                liste.add(p);
            }
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                MysqlConnectionFactory.closeResultSet(rs);
                MysqlConnectionFactory.closePrepareStatement(ps);
                MysqlConnectionFactory.closeConnection(c);
            } catch (SQLException se) {
            }
        }
        return liste;
		
	}	

	@Override
	public Patient getPatientByNumeroNational(String numNa) {
		
	
		Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       Patient patient = new Patient();
        
        try {
            c = MysqlConnectionFactory.getConnection();
            ps = c.prepareStatement(sqlp);
            ps.setString(1,numNa);
            rs = ps.executeQuery();
            
            
            while (rs.next()) {
            	patient.setNumNa(rs.getNString("numNa"));
                patient.setNom(rs.getNString("nom"));     
                patient.setPrenom(rs.getNString("prenom"));
                patient.setDateNais(rs.getDate("dateNais"));
                patient.setPays(rs.getNString("pays"));
                patient.setVille(rs.getNString("ville"));
                
                System.out.println("Bien dans la boucle&&&&&&");
            }
            return patient;
      
        } catch (Exception e){
        	System.out.println("Je ne trouve rien;;;");
            e.printStackTrace();
            return null;
        }finally {
            try {
                MysqlConnectionFactory.closeResultSet(rs);
                MysqlConnectionFactory.closePrepareStatement(ps);
                MysqlConnectionFactory.closeConnection(c);
            } catch (SQLException se) {
            }
        }
     
	}
	
	
}
