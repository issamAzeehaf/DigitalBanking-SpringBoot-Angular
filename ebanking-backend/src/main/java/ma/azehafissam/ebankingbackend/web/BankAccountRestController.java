package ma.azehafissam.ebankingbackend.web;

import lombok.AllArgsConstructor;
import ma.azehafissam.ebankingbackend.dtos.AccountHistoryDTO;
import ma.azehafissam.ebankingbackend.dtos.AccountOperationDTO;
import ma.azehafissam.ebankingbackend.dtos.BankAccountDTO;
import ma.azehafissam.ebankingbackend.entities.AccountOperation;
import ma.azehafissam.ebankingbackend.exceptions.BankAccountNotFoundAxception;
import ma.azehafissam.ebankingbackend.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
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

    @GetMapping("/accounts/{accountId}/pageOperations")
    public AccountHistoryDTO getHistory(
            @PathVariable String accountId,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "5") int size) throws BankAccountNotFoundAxception {
        return bankAccountService.getAccountHistory(accountId, page, size);
    }


}
