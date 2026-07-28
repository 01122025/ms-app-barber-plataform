package br.com.api.salaohub.adapter.in;

import br.com.api.salaohub.application.DeleteCustomer;
import br.com.api.salaohub.application.RegisterCustomer;
import br.com.api.salaohub.application.UpdateCustomer;
import br.com.api.salaohub.application.service.RegisterClientGateway;
import br.com.api.salaohub.shared.dto.ClientDTO;
import jakarta.transaction.Transactional;
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
    private final UpdateCustomer updateCustomer;
    private final DeleteCustomer deleteCustomer;

    @PostMapping("/registerCustomer")
    public ResponseEntity<ClientDTO> registerCustomer(
            @RequestHeader("Authorization") String auth,
            @RequestBody @Valid ClientDTO clientDTO) {
        log.info("registering client in the database...");
        var result = registerCustomer.registerCustomer(clientDTO);
        log.info("client registered successfully Client Name: {}, Client Number: {}",clientDTO.name(),clientDTO.telefone());
        return ResponseEntity.ok(result);
    }

    @PutMapping("/updateClient")
    public void updateClient(@RequestBody @Valid ClientDTO clientDTO) {
        log.info("updating client in the database...");
        var update = updateCustomer.updateClient(clientDTO);
        log.info("client updated successfully Client Name: {}, Client Number: {}",update.name(),update.telefone());
    }

    @DeleteMapping("/deleteClient")
    public ResponseEntity<ClientDTO> deleteClient(@RequestBody @Valid ClientDTO clientDTO) {
        log.info("deleting client in the database...");
        var delete = deleteCustomer.deleteClient(clientDTO);
        log.info("client deleted successfully Client Name: {}, Client Number: {}",delete.name(),delete.telefone());
        return ResponseEntity.ok(delete);
    }

}
