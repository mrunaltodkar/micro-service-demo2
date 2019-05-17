package com.capgemini.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.accountservice.entity.BankAccount;
import com.capgemini.accountservice.entity.SavingAccount;
import com.capgemini.accountservice.service.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService accountService;

	@PostMapping("/account")
	public ResponseEntity<BankAccount> addNewAccount(@RequestBody BankAccount account) {
		accountService.addNew(account);
		return new ResponseEntity<BankAccount>(account, HttpStatus.CREATED);
	}

	@GetMapping("/account")
	public ResponseEntity<List<BankAccount>> getAllBankAccounts() {

		return new ResponseEntity(accountService.getAllBankAccounts(), HttpStatus.OK);
	}

	@GetMapping("/account/{accountId}")
	public ResponseEntity<BankAccount> getBankAccountById(@PathVariable int accountId) {
		return new ResponseEntity(accountService.getBankAccountById(accountId), HttpStatus.OK);
	}

	@PutMapping("/account")
	public ResponseEntity<BankAccount> updateBankDetails(@RequestBody BankAccount account) {
		return new ResponseEntity(accountService.updateAccountById(account), HttpStatus.OK);
	}

	@DeleteMapping("/account/{accountId}")
	public ResponseEntity deleteBankAccount(@PathVariable int accountId) {
		accountService.deleteAccountById(accountId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
