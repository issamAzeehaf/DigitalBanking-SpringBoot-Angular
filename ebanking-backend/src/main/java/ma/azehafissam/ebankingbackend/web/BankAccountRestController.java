package ma.azehafissam.ebankingbackend.web;

import lombok.AllArgsConstructor;
import ma.azehafissam.ebankingbackend.dtos.AccountOperationDTO;
import ma.azehafissam.ebankingbackend.dtos.BankAccountDTO;
import ma.azehafissam.ebankingbackend.entities.AccountOperation;
import ma.azehafissam.ebankingbackend.exceptions.BankAccountNotFoundAxception;
import ma.azehafissam.ebankingbackend.services.BankAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BankAccountRestController {
    public BankAccountService bankAccountService;

    @GetMapping("/accounts/{accountId}")
    public BankAccountDTO getBankAccount(@PathVariable String accountId) throws BankAccountNotFoundAxception {
        return bankAccountService.getBankAccount(accountId);
    }
    @GetMapping("/accounts")
    public List<BankAccountDTO> listAccounts(){
        return bankAccountService.bankAccountList();
    }

    @GetMapping("/accounts/{accountId}/operations")
    public List<AccountOperationDTO> getHistory(@PathVariable String accountId){
        return bankAccountService.accountHistory(accountId);
    }
}
