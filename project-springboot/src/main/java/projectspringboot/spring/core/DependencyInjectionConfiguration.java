package projectspringboot.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projectspringboot.spring.core.data.Bar;
import projectspringboot.spring.core.data.Foo;
import projectspringboot.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo,Bar bar){
        return new FooBar(foo,bar);
    }
}
