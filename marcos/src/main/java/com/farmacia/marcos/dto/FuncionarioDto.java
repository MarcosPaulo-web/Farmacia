package com.farmacia.marcos.dto;

import jakarta.validation.constraints.*;

public record FuncionarioDto(


        @NotBlank(message = "O nome do funcionario não pode ester em branco")
        String nmFuncionario,

        @Pattern(regexp = "//d{11}" , message = "O cpf do funcionario não está com 11 caracteres")
        @NotBlank(message = "O cpf do funcionario não pode ester em branco")
        String cpfFuncionario,

        @Pattern(regexp = "//d{11}" , message = "O numero de telefone do funcionario não está com 11 caracteres")
        @NotBlank(message = "O numero do funcionario não pode ester em branco")
        String telefoneFuncionario,

        @Email(message = "O email do funcionario não está em formatação correta")
        @NotBlank(message = "O email do funcionario não pode estar em branco")
        String emailFuncionario,

        @DecimalMin(value = "0.01", message = " O salario do funcionario não pode ser menor que 0.01")
        @NotNull(message = "O salário não pode ser nulo")
        Double salarioFuncionario,

        @NotBlank(message = "O cardo do funcionario não pode ser null")
        String cargoFuncionario,

        @NotNull(message = "O codigo do cargo do funcionario não pode ser null")
        Integer cdCargoFuncionario

) {
}
