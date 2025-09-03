package com.farmacia.marcos.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBEMPRESA")
public class EmpresaModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDEMPRESA")
    private Integer cdEmpresa;

    @Column(name = "NMEMPRESA")
    private String nmEmpresa;

    @Column(name = "CNPJEMPRESA")
    private String cnpjEmpresa;

    @Column(name = "TELEFONEEMPRESA")
    private String telefoneEmpresa;

    @Column(name = "ENDERECOEMPRESA")
    private String enderecoEmpresa;

    @Column(name = "EMAILEMPRESA")
    private String emailEmpresa;

}
