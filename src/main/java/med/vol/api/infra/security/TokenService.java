package med.vol.api.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import med.vol.api.domain.usuario.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String gerarToken( Usuario usuario) {
        try{
            var algoritmo = Algorithm.HMAC256(secret);

            return JWT.create()
                    .withIssuer("API Voll.med")
                    .withSubject(usuario.getLogin())
                 //   .withClaim("id",usuario.getId())
                 //   .withClaim("senha", usuario.getSenha())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritmo);

        } catch (JWTCreationException e){
            throw new RuntimeException("Erro ao gerar token jwt", e);
        }
    }

    public String getSubject (String tokenJWT) {
        try{
            var algoritmo = Algorithm.HMAC256(secret);

            return JWT.require(algoritmo)
                    .withIssuer("API Voll.med")
                    .build()
                    .verify(tokenJWT)
                    .getSubject();
        } catch (JWTCreationException e){
            throw new RuntimeException("Token JWT inválido ou expirado", e);
        }
    }

    // Metodo que define 2 hrs de validade para o token
    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
