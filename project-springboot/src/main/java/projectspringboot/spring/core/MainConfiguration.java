package projectspringboot.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import projectspringboot.spring.core.configuration.BarConfiguration;
import projectspringboot.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
