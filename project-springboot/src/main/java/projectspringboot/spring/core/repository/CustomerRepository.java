package projectspringboot.spring.core.repository;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}
