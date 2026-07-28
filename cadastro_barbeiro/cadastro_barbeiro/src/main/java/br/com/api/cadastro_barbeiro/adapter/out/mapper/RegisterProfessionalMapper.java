package br.com.api.cadastro_barbeiro.adapter.out.mapper;

import br.com.api.cadastro_barbeiro.adapter.out.entity.RegisterProfessionalEntity;
import br.com.api.cadastro_barbeiro.shared.dto.ProfessionalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RegisterProfessionalMapper {

    @Mapping(target = "id", ignore = true)
    RegisterProfessionalEntity toRegisterProfessionalEntity(ProfessionalDTO professionalDTO);

    ProfessionalDTO toProfessionalDTO(RegisterProfessionalEntity registerProfessionalEntity);
}
