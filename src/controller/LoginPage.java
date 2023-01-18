package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	
	// windows
			JFrame frame  = new JFrame();
			// login buttom
			JButton btLog = new JButton("Login");
			// reset buttom
			JButton btReset = new JButton("Reset");
			// text field user id 
			JTextField userID = new JTextField();
			// and  password
			JPasswordField userPsswd = new JPasswordField();
			// label userid and password 
			JLabel userLbId = new JLabel("UserID: ");
			JLabel userLbPasswd = new JLabel("UserPswd: ");
			
			// message succed or not
			//JLabel messageLb = new JLabel("THIS IS A TEST");
			JLabel messageLb = new JLabel();
	
	
	HashMap<String,String> logInfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> liginInformation){
		
		//copy
		logInfo = liginInformation;
		
		//set text position x, y, w, h
				userLbId.setBounds(50,100, 75, 25);
				userLbPasswd.setBounds(50,150, 75, 25);
				
				messageLb.setBounds(125,250, 250, 35);
				messageLb.setFont(new Font(null, Font.ITALIC,25));
				
				
				// text field
				userID .setBounds(125,100, 250, 35);
				userPsswd.setBounds(125,150, 250, 35);
				
				// buttoms add to listener
				btLog.setBounds(125,200, 100, 25);
				btLog.setFocusable(false);
				btLog.addActionListener(this);
				
				btReset.setBounds(235,200, 100, 25);
				btReset.setFocusable(false);
				btReset.addActionListener(this);
				
				// add userid and paswd to the frame
				frame.add(userLbId);
				frame.add(userLbPasswd);
				frame.add(messageLb);
				frame.add(userID);
				frame.add(userPsswd);
				frame.add(btLog);
				frame.add(btReset);
				
				// exit and close
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// size of windows
				frame.setSize(420,420);
				frame.setLayout(null);
				frame.setVisible(true);
				
				
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// getting action
		if(e.getSource() == btReset) {
			userID.setText("");
			userPsswd.setText(""); 
		}
		if(e.getSource() == btLog) {
			String userIdinfo = userID.getText();
			// cast pswd to string
			String userPswdInfo = String.valueOf(userPsswd.getPassword()); 
			
			// check in the map 
			if(logInfo.containsKey(userIdinfo)) {
				// compare infos
				if(logInfo.get(userIdinfo).equals(userPswdInfo)) {
					// background color green ok
					messageLb.setForeground(Color.GREEN);
					// send text msg
					messageLb.setText("Login successfull");
					
					// use dispose method before lunch the welcome page
					// login page going to disapear
					frame.dispose();
					
					// instance about login page and send user name as argument
					WelcomePage welkom = new WelcomePage(userIdinfo);
				}
				else {
					messageLb.setForeground(Color.RED);
					// send text msg
					messageLb.setText("Wrong DATA");
					// instance about login page
					
				}
			}
			else {
				messageLb.setForeground(Color.RED);
				// send text msg
				messageLb.setText("USER NAME NOT FOUND");
			}
		}
		
	}

}















