package br.com.api.salaohub.adapter.out;

import br.com.api.salaohub.adapter.out.entity.ClientEntity;
import br.com.api.salaohub.adapter.out.jpaRepository.RegisterClientJpaRepository;
import br.com.api.salaohub.adapter.out.mapper.ClientMapper;
import br.com.api.salaohub.application.service.RegisterClientGateway;
import br.com.api.salaohub.shared.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class RegisterCustomerUseCase implements RegisterClientGateway {
    private final ClientMapper clientMapper;
    private final RegisterClientJpaRepository registerClientJpaRepository;

    @Override
    public ClientDTO registerClient(ClientDTO clientDTO) {
        log.info("Register client from database ID: {}, name:{}", clientDTO.idClient(), clientDTO.name());
        ClientEntity clientEntity = clientMapper.DTOtoEntity(clientDTO);
        log.info("Register client {}", clientEntity);
        registerClientJpaRepository.save(clientEntity);
        return clientMapper.entityToDTO(clientEntity);
    }

    @Override
    public ClientDTO updateClient(ClientDTO clientDTO) {
        log.info("Update client from database ID: {}", clientDTO.idClient());
        var searchId = registerClientJpaRepository.getReferenceById(clientDTO.idClient());
        var mapper = clientMapper.entityToDTO(searchId);
        log.info("Update client {}", searchId);
        var mapperReturn = clientMapper.DTOtoEntity(clientDTO);
        registerClientJpaRepository.save(mapperReturn);
        return mapper;
    }

    @Override
    public ClientDTO deleteClient(ClientDTO clientDTO) {
        log.info("Delete client from database ID: {}", clientDTO.idClient());
        var deleteClient = registerClientJpaRepository.getReferenceById(clientDTO.idClient());
        var mapper = clientMapper.entityToDTO(deleteClient);
        registerClientJpaRepository.delete(deleteClient);
        log.info("Delete client {}", deleteClient.getIdClient());
        return mapper;
    }
}