package ua.company.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.company")
@PropertySource("classpath:someProperties.properties")
public class SpringConfig {
}
