package projectspringboot.spring.core.Service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import projectspringboot.spring.core.repository.ProductRepository;


@Component
public class ProductServic {

    @Getter
    private ProductRepository productRepository;

    @Autowired
    public ProductServic(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductServic(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
