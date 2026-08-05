package br.com.api.salaohub.application;

import br.com.api.salaohub.application.service.RegisterClientGateway;
import br.com.api.salaohub.shared.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class DeleteCustomer {

    private final RegisterClientGateway registerClientGateway;

    public ClientDTO deleteClient(ClientDTO clientDTO) {
       log.info("Deleting client: {}", clientDTO.idClient());
        return registerClientGateway.deleteClient(clientDTO);
    }
}
