package ma.enset.customersfrontappthymeleaf.repository;

import ma.enset.customersfrontappthymeleaf.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
