package com.capgemini.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.accountservice.entity.BankAccount;

@Repository
public interface BankAccountDao extends JpaRepository<BankAccount, Integer> {

}
