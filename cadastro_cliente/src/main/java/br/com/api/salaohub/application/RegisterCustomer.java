package br.com.api.salaohub.application;

import br.com.api.salaohub.application.service.RegisterClientService;
import br.com.api.salaohub.shared.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class RegisterCustomer {

    private final RegisterClientService registerClientService;

    public ClientDTO registerCustomer(ClientDTO clientDTO) {
        return registerClientService.registerClient(clientDTO);
    }
}
