package projectspringboot.spring.core.Service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projectspringboot.spring.core.repository.CustomerRepository;

@Component
public class CustomerService {


    @Getter
    @Autowired
    private CustomerRepository customerRepository;

}
