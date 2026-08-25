package br.com.ms.login.screm.shared.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record LoginDTO(
       @JsonProperty("id_Users") Long id_Users,
       @JsonProperty("login") @NotBlank(message = "Login é obrigatório para preenchimento") String login,
       @JsonAlias({"passwordHash"})
       @JsonProperty("password") @NotBlank(message = "Senha é obrigatória para preenchimento") String password,
       @JsonProperty("createdAt") LocalDateTime createdAt,
       @JsonProperty("active") Boolean active
) {
   public String passwordHash() {
       return password;
   }
}
