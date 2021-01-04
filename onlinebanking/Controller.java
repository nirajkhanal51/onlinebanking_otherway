package onlinebanking;

import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Service service = new ServiceImpl();
		
		
		User user =   new User();
		 
		
		int created = service.createAccount(user); 
		
		public static User getUser() {
			
			User user = new User(); 
			String account_no = JOptionPane.showInputDialog("Enter Account Number: " );
			String account_name = JOptionPane.showInputDialog("Enter your Account Name: ");
			String email = JOptionPane.showInputDialog("Enter your email: ");
			long mobile_no = Long.parseLong(JOptionPane.showInputDialog("Enter your mobile number: "));
					
			user.setAccount_no(account_no);
			user.setAccount_name(account_name);
			user.setEmail(email);
			user.setMobile_no(mobile_no);
			
			return user; 
		}
		
		 
		
		
		
			}

	

		}
