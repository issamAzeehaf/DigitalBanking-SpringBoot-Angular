package ma.azehafissam.ebankingbackend.services;

import ma.azehafissam.ebankingbackend.dtos.*;
import ma.azehafissam.ebankingbackend.entities.BankAccount;
import ma.azehafissam.ebankingbackend.entities.CurrentAccount;
import ma.azehafissam.ebankingbackend.entities.Customer;
import ma.azehafissam.ebankingbackend.entities.SavingAccount;
import ma.azehafissam.ebankingbackend.exceptions.BalanceNotSufficientException;
import ma.azehafissam.ebankingbackend.exceptions.BankAccountNotFoundAxception;
import ma.azehafissam.ebankingbackend.exceptions.CustomerNotFountException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFountException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFountException;

    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundAxception;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundAxception, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundAxception;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundAxception, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFountException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);
}
