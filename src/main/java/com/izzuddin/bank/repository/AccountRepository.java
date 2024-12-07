package com.izzuddin.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izzuddin.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
