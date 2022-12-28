package projectspringboot.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import projectspringboot.spring.core.data.Foo;

public class DuplicatTest {

    @Test
    void TestDuplicat() {
        ApplicationContext context= new AnnotationConfigApplicationContext(DuplicatConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () ->{
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void getBean() {

        ApplicationContext context= new AnnotationConfigApplicationContext(DuplicatConfiguration.class);

         Foo foo1= context.getBean("foo1", Foo.class);
        Foo foo2= context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1,foo2);
    }
}
