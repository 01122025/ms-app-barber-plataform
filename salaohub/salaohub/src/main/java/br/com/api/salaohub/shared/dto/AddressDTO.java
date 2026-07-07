package br.com.api.salaohub.shared.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public record AddressDTO(
        @JsonProperty String logradouro,
        @JsonProperty String bairro,
        @JsonProperty String cep,
        @JsonProperty String cidade,
        @JsonProperty String uf,
        @JsonProperty String numero,
        @JsonProperty String complemento
) {
}
