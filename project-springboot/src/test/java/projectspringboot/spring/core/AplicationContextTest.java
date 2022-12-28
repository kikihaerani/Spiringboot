package projectspringboot.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicationContextTest {
    @Test
    void testApplicationContext() {

        ApplicationContext context = new AnnotationConfigApplicationContext(HeloWordConfiguration.class);

        Assertions.assertNotNull(context);
    }
}
