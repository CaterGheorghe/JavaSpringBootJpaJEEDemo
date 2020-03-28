package ro.cater.JEEDemo1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
