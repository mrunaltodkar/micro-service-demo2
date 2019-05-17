package com.capgemini.transactionservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.transactionservice.entity.BankAccountTransaction;

@Repository
public interface TransactionDao extends JpaRepository<BankAccountTransaction, Integer> {

}
