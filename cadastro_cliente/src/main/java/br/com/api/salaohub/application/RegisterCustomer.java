package br.com.api.salaohub.application;

import br.com.api.salaohub.application.service.RegisterClientGateway;
import br.com.api.salaohub.shared.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class RegisterCustomer {

    private final RegisterClientGateway registerClientGateway;

    public ClientDTO registerCustomer(ClientDTO clientDTO) {
        log.info("Creating a customer record");
        return registerClientGateway.registerClient(clientDTO);
    }
}
