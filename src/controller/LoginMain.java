package controller;

import business.Utilisateurs;

public class LoginMain {

	public static void main(String[] args) {
	
		
		
		Utilisateurs idUsers = new Utilisateurs();
		
		
		LoginPage logIn  = new LoginPage(idUsers.getLogininfos());
		
		
		
		
		
		

	}

}
