package com.farmacia.marcos.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBCLIENTE")
public class ClienteModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDCLIENTE")
    private Integer cdCliente;

    @Column(name = "NMCLIENTE")
    private String nmCliente;

    @Column(name = "CPFCLIENTE")
    private String cpfCliente;

    @Column(name = "TELEFONECLIENTE")
    private String telefoneCliente;

    @Column(name = "EMAILCLIENTE")
    private String emailCliente;


}
