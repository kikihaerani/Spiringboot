package projectspringboot.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import projectspringboot.spring.core.Service.CategoryService;
import projectspringboot.spring.core.Service.CustomerService;
import projectspringboot.spring.core.Service.ProductServic;
import projectspringboot.spring.core.repository.CategoryRepository;
import projectspringboot.spring.core.repository.CustomerRepository;
import projectspringboot.spring.core.repository.ProductRepository;

public class ComponenTest {

    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService() {

        ProductServic productServic1 = applicationContext.getBean(ProductServic.class);
        ProductServic productServic2 = applicationContext.getBean("ProductServic", ProductServic.class);

        Assertions.assertSame(productServic1,productServic2);
    }
    @Test
    void testConstructorDependencyInjection(){
        ProductServic productServic = applicationContext.getBean(ProductServic.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productServic.getProductRepository());

    }

    @Test
    void testSetterDepedencyInjection() {

        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFildDepedencyInjection() {
        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);
        CustomerService customerService = applicationContext.getBean(CustomerService.class);


        Assertions.assertSame(customerRepository, customerService.getCustomerRepository());

    }
}
