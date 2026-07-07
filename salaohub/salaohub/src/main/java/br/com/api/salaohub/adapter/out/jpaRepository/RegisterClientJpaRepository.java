package br.com.api.salaohub.adapter.out.jpaRepository;

import br.com.api.salaohub.adapter.out.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RegisterClientJpaRepository extends JpaRepository<ClientEntity, Long> {
}
