package controller;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
		JFrame frame = new JFrame();
		JLabel welcomeLb = new JLabel("Hello!");
	
		WelcomePage(String userId){
			
			welcomeLb.setBounds(0, 0, 200, 35);
			welcomeLb.setFont(new Font(null, Font.PLAIN,25));
			// set text to string and user info as we need
			welcomeLb.setText("HELLO " + userId);
			
			
			frame.add(welcomeLb);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// size of windows
			frame.setSize(420,420);
			frame.setLayout(null);
			frame.setVisible(true);
		}
}
