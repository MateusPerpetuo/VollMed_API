package med.vol.api.infra.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

// @Component é utilizado para que o Spring carregue uma classe / componente genérico
@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        var tokenJWT = recuperarToken(request);


        // Linha responsável por seguir para o proximo filtro ou continuar a aplicação
        filterChain.doFilter(request, response);
    }

    private String recuperarToken(HttpServletRequest request) {
        var authoriationHeader = request.getHeader("Authorization");
        if(authoriationHeader == null) {
            throw new RuntimeException("Token JWT não enviado no cabeçalho Autorization!");
        }

        return authoriationHeader.replace("Bearer","");
    }
}
