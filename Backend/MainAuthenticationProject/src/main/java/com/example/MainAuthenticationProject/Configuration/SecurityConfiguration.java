package com.example.MainAuthenticationProject.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auth->{
            auth.requestMatchers("/api/users/**").authenticated()
                    .requestMatchers("/").permitAll()
                    .anyRequest();
        }).formLogin(form->form.permitAll().defaultSuccessUrl("/dashboard"));

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailService(PasswordEncoder passwordEncoder){
        UserDetails user = User.withUsername("Kutty").password(passwordEncoder().encode("kutty@123")).roles("USER").build();
        UserDetails admin = User.withUsername("MK").password(passwordEncoder().encode("mk@123")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user,admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
