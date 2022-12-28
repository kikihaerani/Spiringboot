package projectspringboot.spring.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import projectspringboot.spring.core.data.Bar;
import projectspringboot.spring.core.data.Foo;

import java.util.prefs.BackingStoreException;

@Slf4j
@Configuration
public class DependsOnConfigutarion {

    @Lazy
    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Creat new Bar");
        return new Bar();
    }
}
