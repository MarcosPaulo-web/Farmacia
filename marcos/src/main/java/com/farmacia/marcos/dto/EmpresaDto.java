package com.farmacia.marcos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmpresaDto(
        @NotBlank(message = "O nome da empresa não pode estar em branco !!!")
        String nmEmpresa,

        @NotBlank(message = "o cnpj não pode estar em branco")
        String cnpjEmpresa,

        @NotBlank(message = "O telefone da empresa não pode estar em branco")
        String telefoneEmpresa,

        @NotBlank(message = "O endereço da empresa não pode ser null")
        String enderecoEmpresa,

        @Email(message = "O email esta fora de formatação")
        @NotBlank(message = "O email não pode estar em branco")
        String emailEmpresa) {
}
