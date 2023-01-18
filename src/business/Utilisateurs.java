/**
 * 
 */
package business;

import java.util.HashMap;

/**
 * @author hp
 *
 */
public class Utilisateurs {
	
	// store key and value (userName and passsword)
	HashMap<String, String> loginInfos = new HashMap<String, String>();

	
	
	// constructor
	 public Utilisateurs() {
		
		loginInfos.put("Diallo","lam");
		loginInfos.put("Bah","oumou");
		loginInfos.put("Jalloh","Abou");
	}

	public HashMap getLogininfos() {
		return loginInfos;
	}


	// getter method
	
	
	
	
	
	
	
}
