package co.edu.unbosque.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/Aplicacion/dashboard",
                        "/Aplicacion/Mi-Cuenta",
                        "/Aplicacion/cargueArchivo",
                        "/Aplicacion/primerosPasos",
                        "/Aplicacion/cargoNuevo",
                        "/Aplicacion/dependenciaNueva",
                        "/Aplicacion/empleadoNuevo",
                        "/Aplicacion/registroNuevo").authenticated()
                .antMatchers("/", "/Aplicacion/signup").permitAll()
                .and()
                .formLogin()
                .loginPage("/Aplicacion/login")
                .and()
                .exceptionHandling().accessDeniedPage("/errCodes/403");
    }
}
