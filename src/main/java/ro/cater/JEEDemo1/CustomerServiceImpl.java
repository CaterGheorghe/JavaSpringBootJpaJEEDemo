package ro.cater.JEEDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer create(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public Customer delete(int id) {
		Customer customer = findById(id);
		if (customer != null) {
			customerRepository.delete(customer);
		}
		return customer;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}

	@Override
	public Customer findById(int id) {
		return customerRepository.getOne(id);
	}

	@Override
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}

}
