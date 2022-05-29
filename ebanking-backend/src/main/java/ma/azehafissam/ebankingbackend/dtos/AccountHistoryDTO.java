package ma.azehafissam.ebankingbackend.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AccountHistoryDTO {
    private String accountId;
    private double balance;
    private int curentPage;
    private int totalPages;
    private int pageSize;
    private List<AccountOperationDTO> accountOperationsDTOS;

}
