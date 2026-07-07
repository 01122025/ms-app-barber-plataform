package br.com.api.salaohub.adapter.in;

import br.com.api.salaohub.application.RegisterCustomer;
import br.com.api.salaohub.shared.dto.ClientDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RestController
@RequiredArgsConstructor
@Slf4j
public class RegisterCustomerController {

    private final RegisterCustomer registerCustomer;

    @PostMapping("/registerCustomer")
    public ResponseEntity<ClientDTO> registerCustomer(
            @RequestHeader("Authorization") String auth,
            @RequestBody @Valid ClientDTO clientDTO) {
        log.info("registering client in the database...");
        var result = registerCustomer.registerCustomer(clientDTO);
        log.info("client registered successfully Client Name: {}, Client Number: {}",clientDTO.name(),clientDTO.telefone());
        return ResponseEntity.ok(result);
    }

    @PutMapping
    public void updateClient(ClientDTO clientDTO) {

    }

    @DeleteMapping
    public void deleteClient(ClientDTO clientDTO) {
    }

}
