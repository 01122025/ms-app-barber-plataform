package br.com.api.salaohub.adapter.out.mapper;

import br.com.api.salaohub.adapter.out.entity.ClientEntity;
import br.com.api.salaohub.shared.dto.ClientDTO;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientEntity DTOtoEntity(ClientDTO clientDTO) {
        if (clientDTO == null) {
            return null;
        }
        
        return new ClientEntity(
            clientDTO.idClient(),
            clientDTO.name(),
            clientDTO.email(),
            clientDTO.telefone(),
            clientDTO.addressDTO(),
            clientDTO.accessibility()
        );
    }

    public ClientDTO entityToDTO(ClientEntity clientEntity) {
        if (clientEntity == null) {
            return null;
        }
        
        return new ClientDTO(
            clientEntity.getIdClient(),
            clientEntity.getName(),
            clientEntity.getEmail(),
            clientEntity.getTelefone(),
            clientEntity.getAddressDTO(),
            clientEntity.getAccessibility()
        );
    }
}
