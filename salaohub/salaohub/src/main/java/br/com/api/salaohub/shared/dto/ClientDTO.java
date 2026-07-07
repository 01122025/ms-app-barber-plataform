package br.com.api.salaohub.shared.dto;

import br.com.api.salaohub.shared.enums.Accessibility;
import com.fasterxml.jackson.annotation.JsonProperty;

public record ClientDTO(
        @JsonProperty("idClient") Integer idClient,
        @JsonProperty("name") String name,
        @JsonProperty("email") String email,
        @JsonProperty("telefone") String telefone,
        @JsonProperty("addressDTO") AddressDTO addressDTO,
        @JsonProperty("accessibility") Accessibility accessibility

) {
}
