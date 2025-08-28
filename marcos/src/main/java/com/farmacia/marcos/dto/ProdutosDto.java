package com.farmacia.marcos.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutosDto(
        @NotBlank(message = "Não é possivel salvar um produto sem nome")
        String nmProduto,
        @NotBlank(message = "Não é possivel salvar um produto sem descrição")
        String dsBula,
        @NotNull(message = "Não é possivel salvar um produto sem valor")
        @DecimalMin(value = "0.01", message = "Não é possivel salvar valor abaixo de zero")
        double vlProduto) {


}
