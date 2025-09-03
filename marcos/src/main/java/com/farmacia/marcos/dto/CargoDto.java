package com.farmacia.marcos.dto;

import jakarta.validation.constraints.NotBlank;

public record CargoDto(
        @NotBlank(message = "o nome do cargo não pode ser nulo !!!")
        String nmCargo
){

}
