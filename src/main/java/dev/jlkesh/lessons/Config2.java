package dev.jlkesh.lessons;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:aa.properties")
public class Config2 {
    @Bean
    @Lazy
    @Scope("singleton")
    public Manager manager() {
        return new Manager();
    }

    @Bean(initMethod = "init")
    @Lazy
    public Manager2 manager2() {
        return new Manager2();
    }
}
