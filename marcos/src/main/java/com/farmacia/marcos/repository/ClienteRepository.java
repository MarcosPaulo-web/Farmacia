package com.farmacia.marcos.repository;

import com.farmacia.marcos.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteModel,Integer> {

    Optional<ClienteModel> findByCdCliente(int cdCliente);
    Optional<ClienteModel> findAllByCdCliente(int cdCliente);
    //List<ClienteModel> findAllClientes();
}
