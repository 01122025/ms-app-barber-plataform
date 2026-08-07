package br.com.api.salaohub.adapter.out.mapper;

import br.com.api.salaohub.adapter.out.entity.AddressEntity;
import br.com.api.salaohub.adapter.out.entity.ClientEntity;
import br.com.api.salaohub.shared.dto.AddressDTO;
import br.com.api.salaohub.shared.dto.ClientDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ClientMapper {

     ClientEntity DTOtoEntity(ClientDTO clientDTO);

     ClientDTO entityToDTO(ClientEntity clientEntity);
}
