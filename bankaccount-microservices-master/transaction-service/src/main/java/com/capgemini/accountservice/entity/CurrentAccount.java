package com.capgemini.accountservice.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "current")
public class CurrentAccount extends BankAccount {

	private double odlimit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountHolderName, double accountBalance, double odlimit) {
		super(accountHolderName, accountBalance,"current");
		this.odlimit = odlimit;
	}

	public double getOdlimit() {
		return odlimit;
	}

	public void setOdlimit(double odlimit) {
		this.odlimit = odlimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [odlimit=" + odlimit + "]";
	}

}
