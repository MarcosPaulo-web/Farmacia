package com.farmacia.marcos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBFUNCIONARIO")
public class FuncionarioModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDFUNCIONARIO")
    private Integer cdFuncionario;

    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;

    @Column(name = "CPFFUNCIONARIO")
    private String cpfFuncionario;

    @Column(name = "TELEFONEFUNCIONARIO")
    private String telefoneFuncionario;

    @Column(name = "EMAILFUNCIONARIO")
    private String emailFuncionario;

    @Column(name = "SALARIOFUNCIONARIO")
    private Double salarioFuncionario;

    @Column(name = "CARGOFUNCIONARIO")
    private String cargoFuncionario;

    @Column(name = "CDCARGOFUNCIONARIO")
    private Integer cdCargoFuncionario;

}
