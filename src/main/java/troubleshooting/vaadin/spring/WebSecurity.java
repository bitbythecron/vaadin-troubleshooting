package troubleshooting.vaadin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * Configures Spring Security for the local web server.
 */
@EnableWebSecurity
class WebSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().not().authenticated()
            .and()
            .httpBasic().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder)
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.setAllowedOrigins(Arrays.asList("*"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type", "X-Auth-Token"));
        corsConfiguration.setExposedHeaders(Arrays.asList("X-Auth-Token"));

        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return source;

    }

}