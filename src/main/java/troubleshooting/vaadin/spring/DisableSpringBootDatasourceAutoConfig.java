package troubleshooting.vaadin.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Disable Spring Boot JPA auto configs.
 */
@Configuration
@EnableAutoConfiguration
public class DisableSpringBootDatasourceAutoConfig {
}