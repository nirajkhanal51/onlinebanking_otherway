package onlinebanking;

public class ServiceImpl implements Service{

	UserDao userDao = new UserDaoImpl(); 
	
	@Override
	public int createAccount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int depositAmount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdrawAmount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getBalance(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
	
	