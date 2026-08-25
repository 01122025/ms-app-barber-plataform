package br.com.ms.login.screm.adapter.in;

import br.com.ms.login.screm.adapter.security.ProcessAuthentication;
import br.com.ms.login.screm.adapter.security.TokenService;
import br.com.ms.login.screm.shared.dto.LoginDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RequestMapping("/login")
@RestController
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final ProcessAuthentication processAuthentication;
    private final TokenService tokenService;

    @PostMapping("/check")
    public ResponseEntity<String> loginCheck(@RequestBody @Valid LoginDTO dto) {
       var userAuthentication = processAuthentication.processAuth(dto);
       var principal = Objects.requireNonNull(userAuthentication.getPrincipal());
       LoginDTO principalDto;
       if (principal instanceof br.com.ms.login.screm.adapter.out.entity.LoginEntity entity) {
           principalDto = new LoginDTO(entity.getId_Users(), entity.getLogin(), entity.getPasswordHash(), entity.getCreatedAt(), entity.getActive());
       } else if (principal instanceof LoginDTO loginPrincipal) {
           principalDto = loginPrincipal;
       } else {
           principalDto = dto;
       }
       return ResponseEntity.ok(tokenService.getCreatedToken(principalDto));
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
