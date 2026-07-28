package br.com.api.cadastro_barbeiro.adapter.out;

import br.com.api.cadastro_barbeiro.adapter.out.mapper.RegisterProfessionalMapper;
import br.com.api.cadastro_barbeiro.adapter.out.repository.RegisterProfessionalRepository;
import br.com.api.cadastro_barbeiro.application.service.RegisterProfessionalService;
import br.com.api.cadastro_barbeiro.shared.dto.ProfessionalDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class RegisterProfessionalUseCase implements RegisterProfessionalService {

    private final RegisterProfessionalMapper mapperRegisterProfessional;
    private final RegisterProfessionalRepository jparegisterProfessional;


    @Override
    public ProfessionalDTO registerProfessional(ProfessionalDTO professionalDTO) {
        log.info("Registering a professional in the database - request received : {}", professionalDTO);
        var persistence = mapperRegisterProfessional.toRegisterProfessionalEntity(professionalDTO);
        var result = jparegisterProfessional.save(persistence);
        log.info("Register a professional in the database - response : {}", result);
        return mapperRegisterProfessional.toProfessionalDTO(result);
    }
}
