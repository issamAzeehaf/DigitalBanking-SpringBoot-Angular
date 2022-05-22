package ma.azehafissam.ebankingbackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.azehafissam.ebankingbackend.entities.BankAccount;
import ma.azehafissam.ebankingbackend.enums.OperationTyoe;

import javax.persistence.*;
import java.util.Date;


@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationTyoe type;
    private BankAccount bankAccount;
    private String description;
}
