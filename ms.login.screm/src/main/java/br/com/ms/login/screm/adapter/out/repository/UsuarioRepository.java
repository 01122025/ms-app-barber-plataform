package br.com.ms.login.screm.adapter.out.repository;

import br.com.ms.login.screm.adapter.out.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<LoginEntity,Long> {

    LoginEntity findByLogin(String username);

}
