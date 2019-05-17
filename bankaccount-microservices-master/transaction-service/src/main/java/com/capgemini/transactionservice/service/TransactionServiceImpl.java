package com.capgemini.transactionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.accountservice.entity.BankAccount;
import com.capgemini.transactionservice.dao.TransactionDao;
import com.capgemini.transactionservice.entity.BankAccountTransaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionDao dao;

	String baseUrl = "http://localhost:8080/account";

	@Override
	public double deposite(int accountId, double amount) {

		RestTemplate restTemplate = new RestTemplate();
		BankAccount account = restTemplate.getForObject(baseUrl + "/" + accountId, BankAccount.class);

		account.setAccountBalance(account.getAccountBalance() + amount);

		restTemplate.put(baseUrl, account, BankAccount.class);

		BankAccountTransaction accountTransaction = new BankAccountTransaction(account.getAccountHolderName(),
				account.getAccountType());
		dao.save(accountTransaction);
		return account.getAccountBalance();
	}

	@Override
	public double withdraw(int accountId, double amount) {
		RestTemplate restTemplate = new RestTemplate();
		BankAccount account = restTemplate.getForObject(baseUrl + "/" + accountId, BankAccount.class);

		if (account.getAccountBalance() >= amount) {
			account.setAccountBalance(account.getAccountBalance() - amount);
		}

		restTemplate.put(baseUrl, account, BankAccount.class);

		BankAccountTransaction accountTransaction = new BankAccountTransaction(account.getAccountHolderName(),
				account.getAccountType());
		dao.save(accountTransaction);
		return account.getAccountBalance();
	}

	@Override
	public double fundtransfer(int senderId, int reciverId, double amount) {
		double balance = withdraw(senderId, amount);
		deposite(reciverId, amount);
		return balance;
	}

}
