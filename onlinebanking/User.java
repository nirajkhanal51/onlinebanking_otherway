package onlinebanking;

import java.util.Date;

public class User {

	
		private int id; 
		private double account_no; 
		private String account_name;
		private String email;
		private double mobile_no; 
		
		private Date deposited_date; 
		private long withdrawn_amount;
		private long deposit_amount;
		private long balance;
			
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getAccount_no() {
			return account_no;
		}
		public void setAccount_no(double account_no) {
			this.account_no = account_no;
		}
		public String getAccount_name() {
			return account_name;
		}
		public void setAccount_name(String account_name) {
			this.account_name = account_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getMobile_no() {
			return mobile_no;
		}
		public void setMobile_no(double mobile_no) {
			this.mobile_no = mobile_no;
		}
	
		public Date getDeposited_date() {
			return deposited_date;
		}
		public void setDeposited_date(Date deposited_date) {
			this.deposited_date = deposited_date;
		}
		public long getWithdrawn_amount() {
			return withdrawn_amount;
		}
		public void setWithdrawn_amount(long withdrawn_amount) {
			this.withdrawn_amount = withdrawn_amount;
		}
		public long getDeposit_amount() {
			return deposit_amount;
		}
		public void setDeposit_amount(long deposit_amount) {
			this.deposit_amount = deposit_amount;
		}
		public long getBalance() {
			return balance;
		}
		public void setBalance(long balance) {
			this.balance = balance;
		}
	}

