package br.com.api.cadastro_barbeiro.shared.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public record ProfessionalDTO(
      @JsonProperty("id") Long id,
      @JsonProperty("nome") String nome,
      @JsonProperty("email") String email,
      @JsonProperty("telefone") String telefone,
      @JsonProperty("ownerOrCollaborator") String ownerOrCollaborator) {
}
