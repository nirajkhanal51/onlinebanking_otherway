package onlinebanking;

public interface UserDao {
	
	int createAccount(User user); 
	int depostAmount(User user); 
	int withdrawAmount(int id); 
	int getBalance(int id); 

}
