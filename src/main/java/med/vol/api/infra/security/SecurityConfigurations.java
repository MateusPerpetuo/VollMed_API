package med.vol.api.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.swing.text.PasswordView;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(c -> c.disable())
                .sessionManagement( sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
        /**
         * csrf().disable() -> Cross-Site Request Forgery
         *        Desabilitando a proteção contra ataques do tipo CSRF
         *        por que os proprios tokens que vamos usar ja é uma proteção contra esse tipo de ataque
         *
         */
    }

    // @Bean serve para exportar uma classe para o Spring, fazendo com que ele consiga carregá-la
    // e realize a sua injeção de dependência em outra classes
    @Bean
    public AuthenticationManager authenticationManager (AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    // Metodo pro Spring identificar o algoritimo de hash de senha
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
