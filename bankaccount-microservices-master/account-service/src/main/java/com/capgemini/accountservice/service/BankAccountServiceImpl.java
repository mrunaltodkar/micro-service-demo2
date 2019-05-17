package com.capgemini.accountservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.accountservice.dao.BankAccountDao;
import com.capgemini.accountservice.entity.BankAccount;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountDao dao;

	@Override
	public BankAccount addNew(BankAccount account) {
		return dao.save(account);
	}

	@Override
	public List<BankAccount> getAllBankAccounts() {
		return dao.findAll();
	}

	@Override
	public BankAccount getBankAccountById(int accountId) {
		return dao.findById(accountId).get();
	}

	@Override
	public BankAccount updateAccountById(BankAccount account) {
		BankAccount account2 = dao.findById(account.getAccountNumber()).get();
		account2.setAccountHolderName(account.getAccountHolderName());
		account2.setAccountBalance(account.getAccountBalance());
		return dao.save(account2);
	}

	@Override
	public void deleteAccountById(int accountId) {
		dao.deleteById(accountId);
	}

}
