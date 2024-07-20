package com.template.repo;

import org.springframework.data.repository.CrudRepository;

import com.template.model.Account;

public interface AccountRepo extends CrudRepository<Account, Integer>{

}
