package br.com.ms.login.screm.adapter.security;

import br.com.ms.login.screm.shared.dto.LoginDTO;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${api.security.token.secret-password}")
    private String secretPassword;

    public String getCreatedToken(LoginDTO loginDTO) {
        try {
            var algorithm = Algorithm.HMAC256(secretPassword);
            return JWT.create()
                    .withIssuer("login.screm")
                    .withSubject(loginDTO.login())
                    .withClaim("id_users", loginDTO.id_Users())
                    .withClaim("login", loginDTO.login())
                    .withExpiresAt(dataExpiracao())
                    .sign(algorithm);
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro ao gerar o jwt", exception);
        }
    }

    public String getSubject(String tokenJWT) {
        try {
            var normalizedToken = tokenJWT == null ? null : tokenJWT.trim();
            if (normalizedToken == null || normalizedToken.isEmpty()) {
                throw new IllegalArgumentException("Token ausente");
            }
            if (normalizedToken.startsWith("Bearer ")) {
                normalizedToken = normalizedToken.substring(7).trim();
            }

            var algorithm = Algorithm.HMAC256(secretPassword);
            return JWT.require(algorithm)
                    .withIssuer("login.screm")
                    .build()
                    .verify(normalizedToken)
                    .getSubject();
        } catch (Exception exception) {
            throw new RuntimeException("Token JWT inválido ou expirado", exception);
        }
    }

    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
