package ma.azehafissam.ebankingbackend.repositories;

import ma.azehafissam.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("select c from Customer c where c.nom like :kw")
    List<Customer> searchCustomer(@Param("kw") String nom);
}
