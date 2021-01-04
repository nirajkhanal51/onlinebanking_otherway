package onlinebanking;

public interface Service {

		
		int createAccount(User user );

		int depositAmount( User user); 
		
		int withdrawAmount(User user); 
		
		User getBalance(int id); 

	}
	