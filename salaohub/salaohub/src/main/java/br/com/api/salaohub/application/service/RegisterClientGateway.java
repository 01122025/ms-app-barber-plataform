package br.com.api.salaohub.application.service;

import br.com.api.salaohub.shared.dto.ClientDTO;

public interface RegisterClientGateway {

    ClientDTO registerClient(ClientDTO clientDTO);
    ClientDTO updateClient(ClientDTO clientDTO);
}
