package br.com.api.salaohub.adapter.out.mapper;

import br.com.api.salaohub.adapter.out.entity.AddressEntity;
import br.com.api.salaohub.adapter.out.entity.ClientEntity;
import br.com.api.salaohub.shared.dto.AddressDTO;
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
            new AddressEntity(),
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
            new AddressDTO(
                clientEntity.getAddressDTO().getLogradouro(),
                clientEntity.getAddressDTO().getBairro(),
                clientEntity.getAddressDTO().getCep(),
                clientEntity.getAddressDTO().getCidade(),
                clientEntity.getAddressDTO().getUf(),
                clientEntity.getAddressDTO().getNumero(),
                clientEntity.getAddressDTO().getComplemento()
            ),
            clientEntity.getAccessibility()
        );
    }
}
