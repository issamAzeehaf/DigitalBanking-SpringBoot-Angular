package ma.azehafissam.ebankingbackend.repositories;

import ma.azehafissam.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
