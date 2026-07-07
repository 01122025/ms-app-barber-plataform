//package br.com.api.salaohub.adapter.out.mapper;
//
//import br.com.api.salaohub.adapter.out.entity.ClientEntity;
//import br.com.api.salaohub.shared.dto.ClientDTO;
//import org.mapstruct.BeanMapping;
//import org.mapstruct.Mapper;
//import org.mapstruct.NullValuePropertyMappingStrategy;
//
//@Mapper(componentModel = "spring")
//public interface RegisterClientMapper {
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    ClientDTO entityToDTO(ClientEntity clientEntity);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    ClientEntity DTOtoEntity(ClientDTO clientDTO);
//}
