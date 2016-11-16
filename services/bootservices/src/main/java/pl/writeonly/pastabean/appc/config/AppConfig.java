package pl.writeonly.pastabean.appc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="helloBean")
    public Pasta helloWorld() {
        return new PastaBean();
    }

}
