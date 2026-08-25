package br.com.ms.login.screm.adapter.security;

import br.com.ms.login.screm.application.LoginAuthentication;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements UserDetailsService {

    private final LoginAuthentication loginAuthentication;

    @Override
    public UserDetails loadUserByUsername( @NotNull String username) throws UsernameNotFoundException {
        return loginAuthentication.findByLogin(username);
    }
}
