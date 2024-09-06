package com.sih.scholarship.Config;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {

    @Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.csrf((csrf) -> csrf.ignoringRequestMatchers("/saveMsg").ignoringRequestMatchers(PathRequest.toH2Console()))
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/home").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/logout").permitAll()
                        .requestMatchers("/apply").permitAll()
                        .requestMatchers("/assets/**").permitAll()
                        .requestMatchers("/static/**").permitAll()
                        .requestMatchers("/registration").permitAll()
                        .requestMatchers(PathRequest.toH2Console()).permitAll()
                        .requestMatchers("/logged").authenticated()

                )
                .formLogin(loginConfigurer -> loginConfigurer.loginPage("/login")
                        .defaultSuccessUrl("/logged").failureUrl("/login?error=true").permitAll())
                .logout(logoutConfigurer -> logoutConfigurer.logoutSuccessUrl("/login?logout=true")
                        .invalidateHttpSession(true).permitAll())
                .httpBasic(AbstractHttpConfigurer::disable);
        http.headers(headersConfigurer -> headersConfigurer
                .frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("ankit")
                .password("1234")
//                .roles("admin", "user")
                .build();

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("4321")
//                .roles("user")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }
}
