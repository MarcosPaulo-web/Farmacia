package com.farmacia.marcos.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TBCARGO")
public class CargoModel {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDCARGO")
    private Integer cdCargo;

    @Column(name = "NMCARGO")
    private String nmCargo;


}
