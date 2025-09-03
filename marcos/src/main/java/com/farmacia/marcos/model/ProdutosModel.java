package com.farmacia.marcos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor   // gera automaticamente um construtor vazio (sem parâmetros)
@AllArgsConstructor  // gera automaticamente um construtor com todos os atributos
@Data                // gera getters, setters, toString, equals, hashCode e construtor para atributos finais


@Entity
@Table(name = "TBPRODUTOS")
public class ProdutosModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdProduto")// para indentificar que é id
    private Integer cdProduto;

    @Column(name = "nmProduto")
    private String nmProduto;

    @Column(name = "dsBula")
    private String dsBula;

    @Column(name = "vlProduto")
    private double vlProduto;

}
