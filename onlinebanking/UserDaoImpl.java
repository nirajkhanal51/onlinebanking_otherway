package onlinebanking;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

	public static final String sql_create = "INSERT INTO account_tbl (account_no, account_name, email, mobile_no) VALUES (?, ?, ?, ?)";

	@Override
	public int createAccount(User user) {
		int create = 0 ; 
		try {
			PreparedStatement ps = Util.getConnection().prepareStatement(sql_create);
			
			ps.setDouble(1, user.getAccount_no());
			ps.setString(2, user.getAccount_name());
			ps.setString(3,user.getEmail());
			ps.setDouble(4,user.getMobile_no());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}

	@Override
	public int depostAmount(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdrawAmount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBalance(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

	
	

	
	

