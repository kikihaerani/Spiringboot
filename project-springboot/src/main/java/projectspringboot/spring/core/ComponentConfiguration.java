package projectspringboot.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "Projectspringboot.spring.core.repository",
        "Projectspringboot.spring.core.servic",

})
public class ComponentConfiguration {
}
