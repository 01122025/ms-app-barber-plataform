package br.com.api.salaohub.adapter.out.entity;

import br.com.api.salaohub.shared.enums.Accessibility;
import jakarta.persistence.*;
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
    private AddressEntity addressDTO;

    @Enumerated(EnumType.STRING)
    private Accessibility accessibility;
}