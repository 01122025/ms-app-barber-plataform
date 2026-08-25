package br.com.ms.login.screm.application;

import br.com.ms.login.screm.application.service.LoginServiceAuth;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginAuthentication {

    private final LoginServiceAuth serviceAuth;

    public UserDetails findByLogin(String username) {
    return serviceAuth.findbyLogin(username);
    }
}
