package br.com.ms.login.screm.adapter.security;

import br.com.ms.login.screm.shared.dto.LoginDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProcessAuthentication {

    private final AuthenticationManager authenticationManager;

    public Authentication processAuth(LoginDTO dto){
        var token  = new UsernamePasswordAuthenticationToken(dto.login(), dto.password());
        return authenticationManager.authenticate(token);
    }
}
