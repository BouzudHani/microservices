package com.patient.sec;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers(HttpMethod.POST,"/creatAccount").permitAll();
        http.authorizeRequests().antMatchers(HttpMethod.GET,"/getPatient").hasAuthority("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET,"/listOfPatient").hasAuthority("ADMIN");
        http.authorizeRequests().antMatchers("/patients/..").hasAuthority("ADMIN");

        http.authorizeRequests().anyRequest().authenticated();
        http.addFilterBefore(new JwtAuthrization(), UsernamePasswordAuthenticationFilter.class);
    }

}
