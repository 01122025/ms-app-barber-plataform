package br.com.api.cadastro_barbeiro.adapter.in;

import br.com.api.cadastro_barbeiro.application.RegisterProfessional;
import br.com.api.cadastro_barbeiro.shared.dto.ProfessionalDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registerProfessional")
@RequiredArgsConstructor
@Slf4j
public class RegisterProfessionalController {

    private final RegisterProfessional registerProfessional;

    @Transactional
    @PostMapping("/registerProfessional")
    public ResponseEntity<ProfessionalDTO> registerProfessional(
            @RequestHeader("Authorization") String authorization,
            @RequestBody @Valid ProfessionalDTO professionalDTO) {
        log.info("Register Professional  -  request received : {}", professionalDTO);
        var request = registerProfessional.registerProfessional(professionalDTO);
        log.info("Register Professional  -  response : {}", request.toString());
        return ResponseEntity.ok().body(request);
    }
}
