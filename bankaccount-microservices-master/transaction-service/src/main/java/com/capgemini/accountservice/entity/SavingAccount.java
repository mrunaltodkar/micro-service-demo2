package com.capgemini.accountservice.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "saving")
public class SavingAccount extends BankAccount {

	private boolean salary;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountHolderName, double accountBalance, boolean salary) {
		super(accountHolderName, accountBalance, "saving");
		this.salary = salary;
	}

	public boolean isSalary() {
		return salary;
	}

	public void setSalary(boolean salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SavingAccount [salary=" + salary + "]";
	}

}
