package com.capgemini.accountservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "bankDetails")
@Inheritance(strategy = InheritanceType.JOINED)
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private String accountType;

	public BankAccount() {
		super();
	}

	public BankAccount(String accountHolderName, double accountBalance, String accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountType=" + accountType + "]";
	}

}
