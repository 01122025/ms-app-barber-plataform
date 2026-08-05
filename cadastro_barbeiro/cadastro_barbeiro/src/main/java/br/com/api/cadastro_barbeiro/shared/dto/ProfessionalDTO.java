package br.com.api.cadastro_barbeiro.shared.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public record ProfessionalDTO(
      @JsonProperty Long id,
      @JsonProperty  String nome,
      @JsonProperty  String email,
      @JsonProperty  String telefone,
      @JsonProperty  String ownerOrCollaborator) {
}
