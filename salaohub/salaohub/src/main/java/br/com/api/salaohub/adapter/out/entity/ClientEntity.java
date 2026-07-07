package br.com.api.salaohub.adapter.out.entity;

import br.com.api.salaohub.shared.dto.AddressDTO;
import br.com.api.salaohub.shared.enums.Accessibility;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "registerClient")
@Entity(name = "registerClient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String telefone;

    @Embedded
    private AddressDTO addressDTO;

    @Enumerated(EnumType.STRING)
    private Accessibility accessibility;
}