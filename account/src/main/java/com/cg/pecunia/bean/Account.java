package com.cg.pecunia.bean;

public class Account {
	String accountNumber;
	String accountName;
	String accountAadhar;
	String accountPan;
	//String accountDob;
	String accountGender;
	String accountContact;
	public Account() {
		super();
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAccountAadhar() {
		return accountAadhar;
	}
	public void setAccountAadhar(String accountAadhar) {
		this.accountAadhar = accountAadhar;
	}
	public String getAccountPan() {
		return accountPan;
	}
	public void setAccountPan(String accountPan) {
		this.accountPan = accountPan;
	}

	/*
	 * public String getAccountDob() { return accountDob; } public void
	 * setAccountDob(String accountDob) { this.accountDob = accountDob; }
	 */
	public String getAccountGender() {
		return accountGender;
	}
	public void setAccountGender(String accountGender) {
		this.accountGender = accountGender;
	}
	public String getAccountContact() {
		return accountContact;
	}
	public void setAccountContact(String accountContact) {
		this.accountContact = accountContact;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", firstName=" + accountName + ", lastName="
				 + ", accountBalance="  + ", accountAadhar=" + accountAadhar
				+ ", accountPan=" + accountPan + ", accountDob=" + accountDob + ", accountAddress="  
				+ ", accountGender=" + accountGender + ", accountContact=" + accountContact + "]";
	}
	
	
	

}
