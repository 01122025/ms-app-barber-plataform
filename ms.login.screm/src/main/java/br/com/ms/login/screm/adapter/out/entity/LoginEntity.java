package br.com.ms.login.screm.adapter.out.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

@Data
@RequiredArgsConstructor
@Table(name = "users")
@Entity(name = "users")
public class LoginEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_Users;
    @Column(name = "login", unique = true, nullable = false)
    String login;
    @Column(name = "password_hash")
    String passwordHash;
    @Column(name = "created_at")
    LocalDateTime createdAt;
    @Column(name = "active")
    Boolean active;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return passwordHash;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isEnabled() {
        return active == null || active;
    }
}
