package com.capgemini.accountservice.service;

import java.util.List;

import com.capgemini.accountservice.entity.BankAccount;

public interface BankAccountService {
	public BankAccount addNew(BankAccount account);
	public List<BankAccount> getAllBankAccounts();
	public BankAccount getBankAccountById(int accountId);
	public BankAccount updateAccountById(BankAccount account);
	public void deleteAccountById(int accountId);
}
