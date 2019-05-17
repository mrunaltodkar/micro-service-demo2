package com.capgemini.transactionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.transactionservice.entity.BankAccountTransaction;
import com.capgemini.transactionservice.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService service;

	@PostMapping("/transaction/{accountId}/{amount}")
	public ResponseEntity<BankAccountTransaction> deposit(@PathVariable int accountId, @PathVariable double amount) {
		return new ResponseEntity(service.deposite(accountId, amount), HttpStatus.OK);
	}

	@GetMapping("/transaction/{accountId}/{amount}")
	public ResponseEntity<BankAccountTransaction> withdraw(@PathVariable int accountId, @PathVariable double amount) {
		return new ResponseEntity(service.withdraw(accountId, amount), HttpStatus.OK);
	}

	@GetMapping("/transaction/{senderId}/{reciverId}/{amount}")
	public ResponseEntity<BankAccountTransaction> fundtransfer(@PathVariable int senderId, @PathVariable int reciverId,
			@PathVariable double amount) {
		return new ResponseEntity(service.fundtransfer(senderId, reciverId, amount), HttpStatus.OK);
	}
}
