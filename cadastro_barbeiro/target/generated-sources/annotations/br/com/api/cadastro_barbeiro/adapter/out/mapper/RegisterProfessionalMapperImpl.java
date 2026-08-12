package br.com.api.cadastro_barbeiro.adapter.out.mapper;

import br.com.api.cadastro_barbeiro.adapter.out.entity.RegisterProfessionalEntity;
import br.com.api.cadastro_barbeiro.shared.dto.ProfessionalDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-08-11T23:07:30-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class RegisterProfessionalMapperImpl implements RegisterProfessionalMapper {

    @Override
    public RegisterProfessionalEntity toRegisterProfessionalEntity(ProfessionalDTO professionalDTO) {
        if ( professionalDTO == null ) {
            return null;
        }

        RegisterProfessionalEntity registerProfessionalEntity = new RegisterProfessionalEntity();

        registerProfessionalEntity.setId( professionalDTO.id() );
        registerProfessionalEntity.setNome( professionalDTO.nome() );
        registerProfessionalEntity.setEmail( professionalDTO.email() );
        registerProfessionalEntity.setTelefone( professionalDTO.telefone() );
        registerProfessionalEntity.setOwnerOrCollaborator( professionalDTO.ownerOrCollaborator() );

        return registerProfessionalEntity;
    }

    @Override
    public ProfessionalDTO toProfessionalDTO(RegisterProfessionalEntity registerProfessionalEntity) {
        if ( registerProfessionalEntity == null ) {
            return null;
        }

        Long id = null;
        String nome = null;
        String email = null;
        String telefone = null;
        String ownerOrCollaborator = null;

        id = registerProfessionalEntity.getId();
        nome = registerProfessionalEntity.getNome();
        email = registerProfessionalEntity.getEmail();
        telefone = registerProfessionalEntity.getTelefone();
        ownerOrCollaborator = registerProfessionalEntity.getOwnerOrCollaborator();

        ProfessionalDTO professionalDTO = new ProfessionalDTO( id, nome, email, telefone, ownerOrCollaborator );

        return professionalDTO;
    }
}
