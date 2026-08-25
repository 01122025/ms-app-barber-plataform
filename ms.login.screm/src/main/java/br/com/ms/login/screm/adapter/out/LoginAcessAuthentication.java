package br.com.ms.login.screm.adapter.out;

import br.com.ms.login.screm.adapter.out.repository.UsuarioRepository;
import br.com.ms.login.screm.application.service.LoginServiceAuth;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class LoginAcessAuthentication implements LoginServiceAuth {

    private final UsuarioRepository userJpasearch;

    @Override
    public br.com.ms.login.screm.adapter.out.entity.LoginEntity findbyLogin(String loginAuth) {
        return userJpasearch.findByLogin(loginAuth);
    }
}
