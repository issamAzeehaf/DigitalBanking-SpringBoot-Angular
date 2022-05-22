package ma.azehafissam.ebankingbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.azehafissam.ebankingbackend.entities.BankAccount;

import javax.persistence.*;
import java.util.List;


@Data
public class CustomerDTO {
    private Long id;
    private String nom;
    private String email;
}
