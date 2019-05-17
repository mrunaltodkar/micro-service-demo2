package com.capgemini.transactionservice.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class BankAccountTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
	private String accountHolderName;
	private String accountType;
	private LocalDate date;
	private LocalTime time;

	public BankAccountTransaction() {
		super();
	}

	public BankAccountTransaction(String accountHolderName, String accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.date = LocalDate.now();
		this.time = LocalTime.now();
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "BankAccountTransaction [transactionId=" + transactionId + ", accountHolderName=" + accountHolderName
				+ ", accountType=" + accountType + ", date=" + date + ", time=" + time + "]";
	}

}
