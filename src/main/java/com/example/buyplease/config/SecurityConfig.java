package com.example.buyplease.config;

import com.example.buyplease.filter.FirebaseAuthenticationTokenFilter;
import com.google.firebase.database.annotations.Nullable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import javax.servlet.http.HttpServletRequest;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     * Use to create instance of {@link FirebaseAuthenticationTokenFilter}.
     *
     * @return instance of {@link FirebaseAuthenticationTokenFilter}
     */
    public FirebaseAuthenticationTokenFilter firebaseAuthenticationFilterBean() throws Exception {
//        logger.debug(
//                "firebaseAuthenticationFilterBean():: creating instance of FirebaseAuthenticationFilter.");

        FirebaseAuthenticationTokenFilter authenticationTokenFilter = new FirebaseAuthenticationTokenFilter();

        return authenticationTokenFilter;
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity
                .cors()
                .and()
                .csrf()
                .disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // Custom security filter
        httpSecurity.addFilterBefore(firebaseAuthenticationFilterBean(),
                UsernamePasswordAuthenticationFilter.class);
    }
}
