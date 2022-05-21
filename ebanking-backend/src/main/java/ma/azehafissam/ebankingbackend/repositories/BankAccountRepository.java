package ma.azehafissam.ebankingbackend.repositories;

import ma.azehafissam.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
