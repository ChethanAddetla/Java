package net.javaProject.banking.service;

import net.javaProject.banking.dto.AccountDto;
import net.javaProject.banking.entity.Account;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdraw(Long id, double amount);
}
