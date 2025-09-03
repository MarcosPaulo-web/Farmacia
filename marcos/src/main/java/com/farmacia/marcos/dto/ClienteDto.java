package com.farmacia.marcos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ClienteDto (
         @NotBlank(message = "O nome do cliente não pode ester em Branco")
         String nmCliente,

         @NotBlank(message = "O cpf do cliente não pode estar em branco")
         String cpfCliente,

         @NotBlank(message = "O telefone do cliente não pode estar em branco")
         String telefoneCliente,

         @Email(message = "O email não está em um formato de email")
         @NotBlank(message = "O email do cliente não pode estar em branco")
         String emailCliente


){
}
