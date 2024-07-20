package com.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.template.model.Account;
import com.template.repo.AccountRepo;

@Component
public class AccountService {

	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired(required = true)
	private PasswordEncoder passwordEncoder;
	
	public Account saveAccount(Account account) {
		account.setPasswordString(passwordEncoder.encode(account.getPasswordString()));
		return this.accountRepo.save(account);
	}
	
	
}
