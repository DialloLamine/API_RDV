package dao.mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlConnectionFactory {

	 public static Connection getConnection() {
	       // String dbURL = "jdbc:mysql://localhost:3306/jdbc-test";

	        Connection c;

	        try {
	           // Class.forName("com.mysql.jdbc.Driver");
	            c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgbd",
	                    "root", "");
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        return c;
	    }
	    public static  void closeResultSet(ResultSet rs) throws SQLException {
	        try{
	            if(rs!=null) rs.close();
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
	    }
	    public static  void closePrepareStatement(PreparedStatement ps) throws SQLException {
	        try{
	            if(ps!=null) ps.close();
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
	    }
	    public static  void closeConnection(Connection c) throws SQLException {
	        try{
	            if(c!=null) c.close();
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
	    }
	
}
