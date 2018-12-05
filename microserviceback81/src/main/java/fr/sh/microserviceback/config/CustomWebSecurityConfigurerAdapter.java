package fr.sh.microserviceback.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
//@EnableWebSecurity
public class CustomWebSecurityConfigurerAdapter /* extends WebSecurityConfigurerAdapter*/ {

/*	@Override
    protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
        auth
          .inMemoryAuthentication()
          .withUser("user")
            .password("{noop}password")
            .roles("USER")
            .and()
          .withUser("admin")
            .password("{noop}admin")
            .roles("USER", "ADMIN");
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeRequests()
          .anyRequest()
          .authenticated()
          .and()
          .httpBasic();
    }*/
}
